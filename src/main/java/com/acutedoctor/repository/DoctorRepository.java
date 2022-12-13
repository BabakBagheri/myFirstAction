package com.acutedoctor.repository;

import com.acutedoctor.model.entity.DoctorEntity;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<DoctorEntity, Integer> {
}
