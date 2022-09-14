package com.softnerve.assessment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
    Optional<Patient> findPatientByPatientContactNo(String patientContactNo);
}
