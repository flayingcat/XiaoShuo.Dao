package com.zengqiang.xiaoshuo.common.util;

import com.zengqiang.xiaoshuo.model.AC01;

public class Utils {
	/**
	 * 去除字符串中空白字符
	* @Title: trim  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param str
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws
	 */
	public static String trim(String str){
		return str.replaceAll("\\s*", "");
	}
	/**
	 * 
	 * @Description: TODO  判断Null
	 * @param @param value
	 * @param @return   
	 * @return boolean  
	 * @throws
	 * @author yokoboy
	 * @date 2017年5月3日
	 */
	public static boolean isNull(String value){
		if(value==null||"".equals(value)){
			return true;
		}
		return false;
	}
	
	public static boolean isNullUnde(String value){
		if(value==null||"".equals(value)||"undefined".equals(value)){
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @Description: TODO  删除字符串中的html标签
	 * @param @param str
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author yokoboy
	 * @date 2017年5月11日
	 */
	public static String deleteHtmlTag(String str){
		return (str.replaceAll("\\n", "").replaceAll("\\<[^\\>]*\\>", "").replaceAll("　", ""));
	}
	
	
	public static String switchURL(String area){
		
			if(Utils.isNull(area)){
				
			}else{
				String[] temp = area.split("/");
				if(temp.length>2){
					return ("file/bookImageDOWN?path="+temp[3]);
				}
			}
			return "";
	}
}
