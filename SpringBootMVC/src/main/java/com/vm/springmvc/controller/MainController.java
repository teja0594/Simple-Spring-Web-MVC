package com.vm.springmvc.controller;





import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/")
    public String display(
        @RequestParam(value = "name", required = false) String name,
        @RequestParam(value = "country", required = false) String country,
        @RequestParam(value = "action", required = false) String action,
        @RequestParam(value = "id", required = false) Integer id,Model model) {
       
    	String msg ="hello" +name;
    	System.out.println(msg);
    	 model.addAttribute("id", id);
         List<Integer> userIds = Arrays.asList(1,2,3,4);
         model.addAttribute("userIds", userIds);
        return "index";
    }
}
