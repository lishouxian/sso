package com.xian.client1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HelloController {


    /**
     * 无需登录
     * @return
     */
    @ResponseBody
    @GetMapping("/hello")
    public String Hello(){

        return "hello";
    }


    /**
     * 无需登录
     * @return
     */
    @GetMapping("/employees")
    public String employees(Model model){

        ArrayList<String> emps = new ArrayList<>();
        emps.add("xiaobai");
        emps.add("xiaohei");

        model.addAttribute("emps",emps);
        return "list";
    }
}
