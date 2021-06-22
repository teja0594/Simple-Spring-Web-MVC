package com.vm.springmvc.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/{id}")
	public String display(@PathVariable("id") int id)
	{
		String s="";
		for(int i=0;i<id;i++)
		{
			s+="hello world<br>";
		}
		return s;
	}
	@RequestMapping("/{id}/{name}")
	public String display2(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		String s="";
		for(int i=0;i<id;i++)
		{
			s+="hello "+name+"<br>";
		}
		return s;
	}

}
