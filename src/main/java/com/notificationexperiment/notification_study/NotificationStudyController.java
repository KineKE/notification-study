package com.notificationexperiment.notification_study;

import com.notificationexperiment.notification_study.model.ParticipantData;
import com.notificationexperiment.notification_study.model.ResponseTime;
import com.notificationexperiment.notification_study.repository.ParticipantDataRepository;
import com.notificationexperiment.notification_study.repository.ResponseTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class NotificationStudyController {

    // Inject the ParticipantDataRepository
    @Autowired
    private ParticipantDataRepository participantDataRepository;

    @Autowired
    private ResponseTimeRepository responseTimeRepository;

    // Endpoint for å logge data
    @PostMapping("/logData")
    public String logData(@RequestBody ParticipantData data) {

        // Save the received data to the database
        ParticipantData savedParticipant = participantDataRepository.save(data); // Correct declaration

        // Save response times
        if (data.getResponseTimes() != null) {
            for (ResponseTime rt : data.getResponseTimes()) {
                rt.setParticipant(savedParticipant);
                responseTimeRepository.save(rt);
            }
        }

        // Save the received data to the database
        participantDataRepository.save(data);
        System.out.println("Data mottatt: " + data);
        return "Data logging gjennomført og lagret i databasen";
    }

    // Endpoint for å motta data
    @GetMapping("/getData")
    public Iterable<ParticipantData> getData() {
        // Retrieve all participant data from the database
        return participantDataRepository.findAll();
    }
}
