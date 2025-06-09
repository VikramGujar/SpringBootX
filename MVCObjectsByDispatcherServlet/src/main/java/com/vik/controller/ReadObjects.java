package com.vik.controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Controller
public class ReadObjects {
 
	
	@Autowired
	ServletConfig sevCnf;
	
	@Autowired
	ServletContext sevCnx;
	
	@RequestMapping("/home")
	public String printObjects( HttpSession session)
	{
		System.out.println(sevCnf.getClass());
		System.out.println(sevCnx.getClass());
		System.out.println(session.getClass());
		//System.out.println(res.getClass());
		//System.out.println(req.getClass());

		return "home";
	}
}
