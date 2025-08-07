package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {

	@Autowired 
PatientService ps;	
	//Using Constructor Injection Method.Constructor Injection is mandatory.If we want to make our application mandatory
    //then we can for Constructor Injection.
	public void PatientController(PatientService ps) {
		this.ps =ps;
	}
	
	//Using Setter Injection Method.Settor Injection is optional.If we want to make our application mandatory then
	//we can go for Setter Injection.
	
	// public void setPatientService(PatientService ps) {
	// this.ps=ps;
	// }

	@PostMapping("addPatient")
	public String addPatient(@RequestBody Patient p) {
	ps.savePatientInDb(p);
	  return "Patient added";
	}
}
	
