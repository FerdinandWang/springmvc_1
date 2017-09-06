package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	//1.使用@requestMappjing 注解来映射请求的url
	//2.返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器会做如下的解析：
	//通过prefix+returnval+后缀 这样的方式得到实际的物理视图，然后做转发操作
	// /WEB-INF/views/
	@RequestMapping("/helloword")
	public String hello() {
		System.out.println("Hello World!");
		return "success";
	}

}
