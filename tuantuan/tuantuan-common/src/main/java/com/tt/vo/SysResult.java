package com.tt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysResult {
	private Integer status=200; //定义状态码200成功 201失败
	private String msg;
	private Object data;
	
	public static SysResult  success() {
		return new SysResult(200,null,null);
	}
	public static SysResult  success(Object obj) {
		
		return new SysResult(200,null,obj);
	}
	public static SysResult  success(String msg,Object obj) {
		return new SysResult(200,msg,obj);
	}
	public static SysResult  fail() {
		return new SysResult(201,null,null);
	}
	public static SysResult  fail(Object obj) {
		
		return new SysResult(201,null,obj);
	}
	public static SysResult  fail(String msg,Object obj) {
		return new SysResult(201,msg,obj);
	}
}
