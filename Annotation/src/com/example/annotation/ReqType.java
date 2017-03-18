package com.example.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface ReqType {
	
	/**
	 *请求方式枚举 
	 */
	enum ReqTypeEnum{GET,POST,DELETE,PUT};
	/**
	 * 请求方式 
	 */
	ReqTypeEnum reqType() default ReqTypeEnum.POST;
	

}
