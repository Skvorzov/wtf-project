package com.wtf.wtfproject.repository;

import com.wtf.wtfproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Student, Long> {
}