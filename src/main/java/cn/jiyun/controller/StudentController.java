package cn.jiyun.controller;

import cn.jiyun.pojo.Student;
import cn.jiyun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController    //restfull
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping("toStu")
    public String toStu(){
       System.out.println("111111");
       System.out.println("222222");
       return "user.html";
    }


    @GetMapping("list")    // restfull  响应数据都是以json格式返回
    @ResponseBody
    public List<Student> list(){
        return studentService.findStuAll();
    }

    @RequestMapping("findById")
    @ResponseBody
    public Student findById(){
        return studentService.findById();
    }

    //返回thymeleaf页面数据方法
    @GetMapping("student")
    public String student(Model model){
        List<Student> stuList = studentService.findStuAll();
        model.addAttribute("stuList",stuList);
        System.out.println("======uuuuuuuuuuu==============");
        return "student";
    }

    @GetMapping("studentById")
    public String studentById(Model model){
        Student stuList = studentService.findById();
        model.addAttribute("stuList",stuList);
        System.out.println("======uuuuuuuuuuu==============");
        return "student";
    }

}
