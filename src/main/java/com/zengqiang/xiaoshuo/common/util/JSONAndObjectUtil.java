package com.zengqiang.xiaoshuo.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

public class JSONAndObjectUtil {
	/**
	 * json字符串转map对象
	* @Title: jsonToMap  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param jsonObj
	* @param @return    设定文件  
	* @return Map<Object,Object>    返回类型  
	* @throws
	 */
	@SuppressWarnings("unchecked")
	public static Map<Object, Object> jsonToMap(Object jsonObj) {
		JsonConfig jsonConfig = new JsonConfig();  
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
        JSONObject jsonObject = JSONObject.fromObject(jsonObj,jsonConfig);
        Map<Object, Object> map = (Map<Object, Object>)jsonObject;
        return map;
    }
	/**
	 * json对象转Bean
	* @Title: jsonToBean  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param jsonObj
	* @param @param type
	* @param @return    设定文件  
	* @return T    返回类型  
	* @throws
	 */
	public  static <T>  T jsonToBean(Object jsonObj, Class<T> type) {
		JsonConfig jsonConfig = new JsonConfig();  
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
        JSONObject jsonObject = JSONObject.fromObject(jsonObj,jsonConfig);
        T obj =(T)JSONObject.toBean(jsonObject, type);
        return obj;
    } 
	/**
	 * list  array 兑现转JSON字符串
	* @Title: arrayToJSON  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param obj
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws
	 */
	public static String arrayToJSON(Object obj){
		JsonConfig jsonConfig = new JsonConfig();  
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		JSONArray jsonArray = JSONArray.fromObject(obj, jsonConfig);
		return jsonArray.toString();
	}
	/**
	 * 这个是json字符串转List<T>对象
	* @Title: jsonToObject  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param obj
	* @param @param classType
	* @param @return    设定文件  
	* @return List<T>    返回类型  
	* @throws
	 */
	public static <T> List<T> jsonToObject(Object obj ,Class<T> classType){
		JsonConfig jsonConfig = new JsonConfig();  
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		JSONArray jsonArray = JSONArray.fromObject(obj, jsonConfig);
		return JSONArray.toList(jsonArray, classType);
	}
	
	/**
	 * objct对象转JSON
	* @Title: objectToJSON  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param obj
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws
	 */
	public static String objectToJSON(Object obj){
		JsonConfig jsonConfig = new JsonConfig();  
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		JSONObject jsonObject = JSONObject.fromObject(obj, jsonConfig);
		return jsonObject.toString();
	}
}
