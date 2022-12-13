package com.acutedoctor.model.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
public class Appointment {

    int id;

    Date startTime;

    Date endTime;


    int doctorId;

    int patientId;
}
