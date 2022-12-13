package com.acutedoctor.model.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Patient {
    int id;

    String name;

    Object info;
}
