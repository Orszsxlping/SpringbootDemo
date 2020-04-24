package cn.jiyun.service;

import cn.jiyun.mapper.StudentMapper;
import cn.jiyun.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> findStuAll(){
        return studentMapper.selectStuAll();
    }

    public Student findById(){
        Student t =new Student();
        t.setId(20);
        return studentMapper.selectOne(t);
    }

    public Student findStuById(){
        return studentMapper.findByid(20);
    }
}
