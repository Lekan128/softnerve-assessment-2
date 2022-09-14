package com.softnerve.assessment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class AssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner (PatientRepository patientRepository, MongoTemplate mongoTemplate){
//		return args -> {
//			String patientContactNo = "+91999000232";
//			Patient patient = new Patient(
//					"rames",
//					patientContactNo
//			);
//
//			patientRepository.findPatientByPatientContactNo(patientContactNo).ifPresentOrElse(
//					(Consumer<Patient>) patient1 -> {
//						System.out.println("student already exists");
//			}, ()->{
//						System.out.println("Inserting");
//				System.out.println("patientRepository = " + patientRepository + ", mongoTemplate = " + mongoTemplate);
//				patientRepository.insert(patient);
//					});
//
////			Query query = new Query();
////			query.addCriteria(Criteria.where("patientContactNo").is(patientContactNo));
////
////			List<Patient> patients = mongoTemplate.find(query, Patient.class);
////			if(patients.size()>1){
////				throw new IllegalStateException("same person with one mobile umber" + patientContactNo);
////			}
////			if(patients.isEmpty()){
////				System.out.println("Inserting");
////				System.out.println("patientRepository = " + patientRepository + ", mongoTemplate = " + mongoTemplate);
////				patientRepository.insert(patient);
////			}else System.out.println("student already exists");
//
//		};
//	}

}
