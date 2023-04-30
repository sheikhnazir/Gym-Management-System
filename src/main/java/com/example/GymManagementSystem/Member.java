package com.example.GymManagementSystem;

import java.util.List;

public class Member {
    private int memberId;
    private List<Trainer> trainers;
    private Gym gym;

    public Member(int memberId, List<Trainer> trainers, Gym gym) {
        this.memberId = memberId;
        this.trainers = trainers;
        this.gym = gym;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
