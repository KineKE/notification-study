package com.notificationexperiment.notification_study.repository;

import com.notificationexperiment.notification_study.model.ParticipantData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantDataRepository extends JpaRepository<ParticipantData, Long> {
    // No additional code is needed for basic CRUD operations
}