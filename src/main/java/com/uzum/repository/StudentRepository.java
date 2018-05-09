package com.uzum.repository;

import com.uzum.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2017/3/2.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
