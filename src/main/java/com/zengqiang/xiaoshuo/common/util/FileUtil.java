/**  
 * @Title: FileUtil.java
 * @Package com.zengqiang.xiaoshuo.common.util
 * @Description: TODO
 * @author yokoboy
 * @date 2017年4月30日
 */
package com.zengqiang.xiaoshuo.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.zengqiang.xiaoshuo.common.exception.XiaoShuoException;

/**
 * <p>Title: FileUtil</p>
 * <p>Description: </p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年4月30日
 */
public class FileUtil {
	
	private FileUtil(){
		
	}
	/**
	 * 读取文件类容
	 * @Description: TODO
	 * @param @param path
	 * @param @return
	 * @param @throws IOException   
	 * @return String  
	 * @throws
	 * @author yokoboy
	 * @date 2017年4月30日
	 */
	public  String read(String path) throws IOException{
		File file = new File(path);
		FileReader out = new FileReader(file);
		
		StringBuffer sb = new StringBuffer();
		BufferedReader br  = new BufferedReader(out);
		String str = null;
		while((str = br.readLine())!=null){
			sb.append(str);
		}
			
		return sb.toString();
	}
	
	public static FileUtil instance(){
		return new FileUtil();
	}
	/**
	 * 
	 * @Description: TODO
	 * @param @param path  路径
	 * @param @param content   正文
	 * @param @return
	 * @param @throws IOException   
	 * @return boolean  
	 * @throws
	 * @author yokoboy
	 * @date 2017年5月2日
	 */
	public long write(String path,String content)throws IOException{
		File file  = new File(path);
		if(file.exists()){
			throw new  XiaoShuoException("文件已经存在");
		}else{
			file.createNewFile();
			FileWriter out = new FileWriter(file);
			out.write(content);
			out.close();
		}
		return content.length();
	}
	/**
	 * 创建文件夹
	 * @Description: TODO
	 * @param @param path   
	 * @return void  
	 * @throws
	 * @author yokoboy
	 * @date 2017年5月2日
	 */
	public void createDir(String path){
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
	}
	public void deleteDir(String path){
		File file = new File(path);
		file.deleteOnExit();
	}
	
	public void fileRead(String path,ByteArrayOutputStream outputStream) throws IOException{
		File file = new File(path);
		byte[] temp = new byte[2048];
		FileInputStream inputStream = new FileInputStream(file);
		int size = 0 ; 
		while ((size = inputStream.read(temp))!=-1) {
			outputStream.write(temp, 0, size);
		}
		inputStream.close();
	}
}
