package com.acutedoctor.controller;

import com.acutedoctor.model.common.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("patient")
@RequestMapping("patients")
public class PatientController {
    @GetMapping("/{patientId}")
    Patient addPatient(@PathVariable int patientId){
        System.out.println(patientId);

        return  new Patient();
    }

    @PostMapping
    Patient addPatient(@RequestBody Patient input){

        System.out.println(input);
        return  input;
    }

    @PutMapping
    ResponseEntity<?> updatePatient(@RequestBody Patient input){

        System.out.println(input);
        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }

    @DeleteMapping("/{patientId}")
    ResponseEntity<?> removePatient(@PathVariable int patientId){
        System.out.println(patientId);

        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }

//    @PostMapping("/{patientId}/uploadImage")
//    ResponseEntity<?>  updateImage(){
//
//
//        return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
//    }

}
