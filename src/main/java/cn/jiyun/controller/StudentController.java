package cn.jiyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


    @RequestMapping("toStu")
    public String toStu(){
       System.out.println("111111");
       return "user.html";
    }
}
