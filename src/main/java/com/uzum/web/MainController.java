package com.uzum.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.uzum.domain.Student;
import com.uzum.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/3/2.
 */
@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "student", method = {RequestMethod.GET, RequestMethod.POST})
    public Student addStudent(@RequestParam(defaultValue = "1") Integer id, @RequestParam String name, @RequestParam String sex){
        JSONObject jsonObject = new JSONObject();
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        Student result = studentService.saveAndFlush(student);
        if(result == null){
            jsonObject.put("status", 0);
        }else{
            jsonObject.put("status", 1);
        }
        return student;
    }

    @RequestMapping(value = "student/{id}")
    public String getStudentById(@PathVariable int id){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Student> list = studentService.findAll();
        map.put("rows", list);
        map.put("total", list.size());
        return JSON.toJSONString(map);
    }

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}
