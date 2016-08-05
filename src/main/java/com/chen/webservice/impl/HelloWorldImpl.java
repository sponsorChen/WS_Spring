package com.chen.webservice.impl;

import javax.jws.WebService;

import com.chen.webservice.HelloWorld;
@WebService
public class HelloWorldImpl implements HelloWorld{

	public String helloWorld(String helloWorld) {
		// TODO Auto-generated method stub
		return helloWorld+"nihao";
	}

}
