package com.acutedoctor.model.entity;


import jakarta.persistence.*;

@Table
@Entity
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "ExtraInfo")
    private String extraInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        return "DoctorEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }
}
