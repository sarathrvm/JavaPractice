package com.infybuzz.microservices_example_student_service.repo;

import com.infybuzz.microservices_example_student_service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
