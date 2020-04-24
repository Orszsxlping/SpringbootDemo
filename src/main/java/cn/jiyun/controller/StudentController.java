package cn.jiyun.controller;

import cn.jiyun.pojo.Student;
import cn.jiyun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    //restfull
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping("toStu")
    public String toStu(){
       System.out.println("111111");
       return "user.html";
    }


    @GetMapping("list")    // restfull  响应数据都是以json格式返回
    public List<Student> list(){
        return studentService.findStuAll();
    }

    @RequestMapping("findById")
    public Student findById(){
        return studentService.findById();
    }

}
