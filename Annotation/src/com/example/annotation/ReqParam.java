package com.example.annotation;
import java.lang.annotation.*;

@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)

public @interface ReqParam {

	String value() default "";
}
