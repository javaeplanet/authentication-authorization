package com.javaeplanet.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaeplanet.auth.entity.Student;
import com.javaeplanet.auth.entity.StudentDetails;
import com.javaeplanet.auth.repos.StudentDetailsRepository;
import com.javaeplanet.auth.repos.StudentRepository;
import com.javaeplanet.auth.service.SecurityService;

@Controller
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentRepository repos;

	@Autowired
	private StudentDetailsRepository repository;

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private SecurityService service;

	@RequestMapping("/showReg")
	public String showReg() {
		return "login/Registration";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		student.setPassword(encoder.encode(student.getPassword()));
		Student savedStudent = repos.save(student);
		
		return "login/login";
	}

	@RequestMapping(value = "/showLogin")
	public String showLogin() {
		return "login/login";
	}

//	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
//	public String getAllStudents(ModelMap modelMap) {
//		List<Student> students = (List<Student>) repos.findAll();
//		modelMap.addAttribute("students", students);
//		return "login/displayStudents";
//	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
//		Student student = repos.findByEmail(email);
//		if (std.getPassword().equals(password)) {
//			return "redirect:/getAllStudentDetails";
		boolean loginResponse = service.login(email, password);
			if(loginResponse) {
				return "redirect:/api/getAllStudentDetails";
		} else {
			modelMap.addAttribute("msg", "Invalid username or password, Please try again");
		}
		return "login/login";
	}

	@RequestMapping("/showDetailsReg")
	public String showDetailsReg() {
		return "login/details";
	}

	@RequestMapping(value = "/saveStudentDetails", method = RequestMethod.POST)
	public String saveStudentDetails(@ModelAttribute("studentDetails") StudentDetails studentDetails) {
		StudentDetails details = repository.save(studentDetails);
		return "login/successful";
	}

	@RequestMapping(value = "/getAllStudentDetails", method = RequestMethod.GET)
	public String getAllStudentDetails(ModelMap modelMap) {
		List<StudentDetails> studentDetails = (List<StudentDetails>) repository.findAll();
		modelMap.addAttribute("studentDetails", studentDetails);
		return "login/studentDetails";
	}

	@RequestMapping("admin/showAddStudent")
	public String showAddStudent() {
		return "login/addStudent";
	}
}
