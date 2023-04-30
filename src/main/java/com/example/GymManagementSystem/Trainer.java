package com.example.GymManagementSystem;

import java.util.List;

public class Trainer {
    private int trainerId;
    private List<Member> members;
    private List<Gym> gyms;

    public Trainer(int trainerId, List<Member> members, List<Gym> gyms) {
        this.trainerId = trainerId;
        this.members = members;
        this.gyms = gyms;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(List<Gym> gyms) {
        this.gyms = gyms;
    }
}
