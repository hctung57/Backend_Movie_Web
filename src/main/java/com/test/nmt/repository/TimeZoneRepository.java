package com.test.nmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.nmt.model.showTime.TimeZoneEntity;

@Repository
public interface TimeZoneRepository extends JpaRepository<TimeZoneEntity, Long> {

}
