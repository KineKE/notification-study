package com.notificationexperiment.notification_study.repository;

import com.notificationexperiment.notification_study.model.ResponseTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseTimeRepository extends JpaRepository<ResponseTime, Long> {
}