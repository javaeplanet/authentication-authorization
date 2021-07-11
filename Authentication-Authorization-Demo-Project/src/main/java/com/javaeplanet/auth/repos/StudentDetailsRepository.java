package com.javaeplanet.auth.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaeplanet.auth.entity.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

}
