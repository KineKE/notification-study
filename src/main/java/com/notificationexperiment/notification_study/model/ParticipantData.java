package com.notificationexperiment.notification_study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class ParticipantData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private String gender;
    private String audioOutput;
    private String inputDevice;
    private String hearingImpairment;
    private String computerFamiliarity;
    private String previousStudy;
    private String question1;
    private String question2;
    private String question3;
    private String engagement;
    private String difficulty;
    private String distraction;

    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private List<ResponseTime> responseTimes = new ArrayList<>();

    // Constructor, getters, and setters
    public ParticipantData() {}


    public ParticipantData(int age, String gender, String audioOutput, String inputDevice,
                           String hearingImpairment, String computerFamiliarity, String previousStudy,
                           String question1, String question2, String question3, String engagement,
                           String difficulty, String distraction) {
        this.age = age;
        this.gender = gender;
        this.audioOutput = audioOutput;
        this.inputDevice = inputDevice;
        this.hearingImpairment = hearingImpairment;
        this.computerFamiliarity = computerFamiliarity;
        this.previousStudy = previousStudy;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.engagement = engagement;
        this.difficulty = difficulty;
        this.distraction = distraction;
    }

    // Add getters and setters for responseTimes
    public List<ResponseTime> getResponseTimes() {
        return responseTimes;
    }

    public void setResponseTimes(List<ResponseTime> responseTimes) {
        this.responseTimes = responseTimes;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAudioOutput() {
        return audioOutput;
    }

    public void setAudioOutput(String audioOutput) {
        this.audioOutput = audioOutput;
    }

    public String getInputDevice() {
        return inputDevice;
    }

    public void setInputDevice(String inputDevice) {
        this.inputDevice = inputDevice;
    }

    public String getHearingImpairment() {
        return hearingImpairment;
    }

    public void setHearingImpairment(String hearingImpairment) {
        this.hearingImpairment = hearingImpairment;
    }

    public String getComputerFamiliarity() {
        return computerFamiliarity;
    }

    public void setComputerFamiliarity(String computerFamiliarity) {
        this.computerFamiliarity = computerFamiliarity;
    }

    public String getPreviousStudy() {
        return previousStudy;
    }

    public void setPreviousStudy(String previousStudy) {
        this.previousStudy = previousStudy;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getEngagement() {
        return engagement;
    }

    public void setEngagement(String engagement) {
        this.engagement = engagement;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDistraction() {
        return distraction;
    }

    public void setDistraction(String distraction) {
        this.distraction = distraction;
    }
}