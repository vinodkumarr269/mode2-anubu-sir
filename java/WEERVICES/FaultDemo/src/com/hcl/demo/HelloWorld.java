package com.hcl.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="HelloWorld",serviceName="HelloWorldService")
public class HelloWorld {
	@WebMethod
	public String sayHelloWorld(String message) throws Exception{
		if(message==null||message.isEmpty()){
			throw new MissingName();
		}
		return "Here is the message:"+message+".";
	}

}
