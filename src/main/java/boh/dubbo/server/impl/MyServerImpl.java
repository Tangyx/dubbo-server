package boh.dubbo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;

import boh.dubbo.server.MyServer;

@Service
public class MyServerImpl implements MyServer{

	public String server(String name) {
		return "DubboServer Response:"+name;
	}

}
