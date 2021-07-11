package com.javaeplanet.auth.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaeplanet.auth.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findByEmail(String email);
}
