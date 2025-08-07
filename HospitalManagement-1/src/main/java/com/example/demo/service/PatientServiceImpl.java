package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;


@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository pr;

	@Override
	public void savePatientInDb(Patient p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	
	
}
