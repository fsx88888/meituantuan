package com.tt.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {
	private static final ObjectMapper MAPPER=new ObjectMapper();
	
	/**
	 * 对象转化为json串
	 */
	public static String toJson(Object target) {
		String result=null;
		try {
			result = MAPPER.writeValueAsString(target);
			return result;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * 将json串转化为对象
	 * @param <T> 
	 * @param json  需要解析的json数据
	 * @param targetClass 需要返回的对象类型
	 * @return 
	 */
	public static <T>T toObject(String json,Class<T> targetClass) {
		T object=null;
		try {
			object  = MAPPER.readValue(json, targetClass);
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
