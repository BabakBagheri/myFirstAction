package com.acutedoctor.controller;

import com.acutedoctor.model.common.Doctor;
import com.acutedoctor.model.entity.DoctorEntity;
import com.acutedoctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("doctors")
public class DoctorController {


    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping
    List<Doctor> findAllDoctor(){


        return StreamSupport.stream(doctorRepository.findAll().spliterator(),false)
                .map(doctorEntity -> {
                    Doctor r = new Doctor();
                    r.setId(doctorEntity.getId());
                    r.setName(doctorEntity.getFullName());
                    r.setInfo(doctorEntity.getExtraInfo());
                    return r;
                }).collect(Collectors.toList());
    }

    @GetMapping("/{doctorId}")
    Doctor findDoctor(@PathVariable int doctorId){
        Optional<DoctorEntity> doctor = doctorRepository.findById(doctorId);
        if(doctor.isPresent()){
            System.out.println(doctor);
            return doctor.map(entity -> {
                Doctor r = new Doctor();
                r.setId(entity.getId());
                r.setName(entity.getFullName());
                r.setInfo(entity.getExtraInfo());
                return r;
            }).get();
        }else {
            return  new Doctor();
        }
    }

    @PostMapping
    Doctor addDoctor(@RequestBody Doctor input){

        DoctorEntity doc = new DoctorEntity();
        doc.setFullName(input.getName());
        doc.setExtraInfo(input.getInfo().toString());

        var e = doctorRepository.save(doc);
        System.out.println(e);
        input.setId(e.getId());

        return input;
    }

    @PutMapping
    ResponseEntity<?> updateDoctor(@RequestBody Doctor input){

        System.out.println(input);
        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }

    @DeleteMapping("/{doctorId}")
    ResponseEntity<?> removeDoctor(@PathVariable int doctorId){
        doctorRepository.deleteById(doctorId);
        return  ResponseEntity.ok().build();
    }

//    @PostMapping("/{doctorId}/uploadImage")
//    ResponseEntity<?>  updateImage(){
//
//
//        return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
//    }

}
