package com.notificationexperiment.notification_study.model;

import jakarta.persistence.*;

@Entity
public class ResponseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "participant_id", nullable = false)
    private ParticipantData participant;

    private boolean withSound;
    private long responseTime; // Time in milliseconds

    // Constructor, getters, and setters
    public ResponseTime() {}

    public ResponseTime(ParticipantData participant, boolean withSound, long responseTime) {
        this.participant = participant;
        this.withSound = withSound;
        this.responseTime = responseTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParticipantData getParticipant() {
        return participant;
    }

    public void setParticipant(ParticipantData participant) {
        this.participant = participant;
    }

    public boolean isWithSound() {
        return withSound;
    }

    public void setWithSound(boolean withSound) {
        this.withSound = withSound;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }
}
