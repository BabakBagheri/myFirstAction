package com.acutedoctor.controller;

import com.acutedoctor.model.common.Appointment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("appointment")
@RequestMapping("appointments")
public class AppointmentController {


    @GetMapping("/patient/{patientId}")
    List<Appointment> getPatientAppointment(@PathVariable int patientId){
        System.out.println(patientId);

        return  null;
    }

    @GetMapping("/doctor/{doctorId}")
    List<Appointment> getDoctorAppointments(@PathVariable int doctorId){
        System.out.println(doctorId);

        return null;
    }

    @PostMapping("/{doctorId}")
    ResponseEntity<?> addAppointment(@PathVariable int doctorId){
        System.out.println(doctorId);

        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }
    @DeleteMapping("/{appointmentId}/doctor/{doctorId}")
    ResponseEntity<?> removeAppointment(@PathVariable int appointmentId,@PathVariable int doctorId){
        System.out.println(doctorId);

        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }

    @PutMapping("/{appointmentId}/patient/{patientId}")
    ResponseEntity<?> bookAppointment( @PathVariable int appointmentId,@PathVariable int patientId){
        System.out.println(patientId);

        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }

    @DeleteMapping("/{appointmentId}/patient/{patientId}")
    ResponseEntity<?> cancelAppointment( @PathVariable int appointmentId,@PathVariable int patientId){
        System.out.println(patientId);

        return  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }
}
