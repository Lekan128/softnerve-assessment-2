package com.softnerve.assessment;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service//so spring initialises this class as a bean
public class PatientService {
     private final PatientRepository patientRepository;

     public List<Patient> getAllPatients(){
         return patientRepository.findAll();
     }
}
