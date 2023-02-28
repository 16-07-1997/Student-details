package com.accessdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accessdata.repository.Student;
import com.accessdata.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@PostMapping("/studentdetails")
	public String details(@RequestParam(name = "stdid", required = true) int stdid, Model model) 
	{
		List<Student> studentlist = studentRepository.findAllByStdid(stdid);
		System.out.println("print the name:" + studentlist.size());

		model.addAttribute("studentDetails", studentRepository.findAllByStdid(stdid));

		return "student_list";

	}
}