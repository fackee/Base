package com.example.annotation;

public interface IReqApi {
	
	@ReqType(reqType = ReqType.ReqTypeEnum.POST)
	@ReqUrl(reqUrl="www.baidu.com")
	String login(@ReqParam("userId") String userId, @ReqParam("pwd") String pwd);

}
