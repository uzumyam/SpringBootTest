package com.uzum.service;

import com.uzum.domain.Student;
import com.uzum.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/3/2.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveAndFlush(Student entity) {
        return studentRepository.saveAndFlush(entity);
    }


    @Override
    public void delete(Integer id) {
        studentRepository.delete(id);
    }
}
