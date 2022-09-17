package com.softnerve.assessment;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/patients")
@AllArgsConstructor
public class PatientController {
    private final PatientRepository patientRepository;
    private final PatientService patientService;

//    public PatientController (PatientRepository patientRepository){
//        this.patientRepository = patientRepository;
//    }

    @GetMapping(value = "/test")
    public String test(){
        return "Hello world";
    }

    @GetMapping(value = "/get")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping(value = "/post")
//    @RequestMapping()
    private Patient addPatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }



//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public Patient addNewPatient(@RequestBody Patient patient){
//        return patientRepository.save(patient);
//    }
}
