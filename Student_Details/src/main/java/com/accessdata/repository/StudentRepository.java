package com.accessdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findAllByStdid(Integer stdid);

}
