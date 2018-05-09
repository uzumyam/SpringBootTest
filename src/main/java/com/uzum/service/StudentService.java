package com.uzum.service;

import com.uzum.domain.Student;

import java.util.List;

/**
 * Created by admin on 2017/3/2.
 */
public interface StudentService {

    List<Student> findAll();

    Student saveAndFlush(Student entity);

    void delete(Integer id);
}
