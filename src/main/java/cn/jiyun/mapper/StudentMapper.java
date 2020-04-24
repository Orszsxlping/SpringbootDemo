package cn.jiyun.mapper;

import cn.jiyun.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper extends tk.mybatis.mapper.common.Mapper<Student> {

    public List<Student> selectStuAll();
}
