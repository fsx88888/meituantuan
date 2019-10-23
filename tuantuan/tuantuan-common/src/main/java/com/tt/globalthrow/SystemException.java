package com.tt.globalthrow;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tt.vo.SysResult;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice	 //对Controller层异常有效
@Slf4j		//引入日志

public class SystemException  {
	
	@ExceptionHandler(RuntimeException.class)
	public SysResult exception(Throwable throwable) {
		log.info(throwable.getMessage());
		return SysResult.fail();
	}
}
