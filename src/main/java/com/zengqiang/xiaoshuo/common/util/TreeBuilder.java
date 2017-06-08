package com.zengqiang.xiaoshuo.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.zengqiang.xiaoshuo.common.exception.UtilException;

public class TreeBuilder {
	private Method setChildren;
	private Method getPid;
	private Method getId;
	private TreeBuilder() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings({ "unchecked",  "rawtypes"})
	public <T> List<T> buildListToTree(List<T> dirs) {
		Class dirsType = dirs.get(0).getClass();
		System.out.println(dirs);
		try{
			if(dirsType.getSuperclass().equals(Object.class)){
				setChildren = dirsType.getDeclaredMethod("setChildren",List.class);
				getPid = dirsType.getDeclaredMethod("getPid");
				getId=dirsType.getDeclaredMethod("getId");
			}else if(dirsType.getSuperclass().getSuperclass().equals(Object.class)){
				setChildren = dirsType.getSuperclass().getDeclaredMethod("setChildren",List.class);
				getPid = dirsType.getSuperclass().getDeclaredMethod("getPid");
				getId=dirsType.getSuperclass().getDeclaredMethod("getId");
			}else if(dirsType.getSuperclass().getSuperclass().getSuperclass().equals(Object.class)){
				setChildren = dirsType.getSuperclass().getSuperclass().getDeclaredMethod("setChildren",List.class);
				getPid = dirsType.getSuperclass().getSuperclass().getDeclaredMethod("getPid");
				getId=dirsType.getSuperclass().getSuperclass().getDeclaredMethod("getId");
			}else{
				throw new UtilException("实在无力，不知道需要的方法在哪儿");
			}
			
			
		}catch(NoSuchMethodException e){
			e.printStackTrace();
			throw new UtilException("方法找不到");
		}
		List<T> roots = findRoots(dirs);
		List<T> notRoots = (List<T>) CollectionUtils
				.subtract(dirs, roots);
		for (T root : roots) {
			try {
				setChildren.invoke(root,findChildren(root, notRoots));
			} catch (Exception e) {
				e.printStackTrace(); 
				throw new UtilException("root根节点加孩子失败！");
			} 
		}
		return roots;
	}
	
	@SuppressWarnings({ "unused" })
	/**
	 * 寻找头节点的方法
	 * @param allTs
	 * @return
	 */
	private <T> List<T> findRoots(List<T> allTs) {
		List<T> results = new ArrayList<T>();
		for (T o : allTs) {
			boolean isRoot = false;

			try {
				if (getPid.invoke(o)==null||"#".equals(getPid.invoke(o))) {
					isRoot = true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new UtilException("执行getPid时发生一场");
			} 
			if (isRoot) {
				results.add(o);
			}
		}
		return results;
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> findChildren(T root, List<T> allTs) {
		try{
			List<T> children = new ArrayList<T>();
			String rootId = (String) getId.invoke(root);
			for (T comparedOne : allTs) {
				if (getPid.invoke(comparedOne).equals(rootId)) {
					children.add(comparedOne);
				}
			}
			//集合相减
			List<T> notChildren = (List<T>) CollectionUtils.subtract(allTs, children);
			//寻找孩子 的孩子的节点
			for (T child : children) {
				List<T> tmpChildren = findChildren(child, notChildren);

				setChildren.invoke(child,tmpChildren);
			}
			return children;
		}catch(Exception e){
			e.printStackTrace();
			throw new UtilException("");
		}
	}

	public static TreeBuilder  instance(){
		return new TreeBuilder();
	}
}
