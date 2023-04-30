package com.example.GymManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class gymService {
    @Autowired
    gymRepository gymRepository;

    public void addGym(Gym gym) {
        gymRepository.addGym(gym);
    }

    public void addMember(Member member) {
        gymRepository.addMember(member);
    }

    public void addTrainer(Trainer trainer) {
        gymRepository.addTrainer(trainer);
    }

    public int memberMostTrainer() {                        // 1.api
        return gymRepository.memberMostTrainer();
    }

    public int gymMostNoOfMember() {                        // 2.api
        return gymRepository.gymMostMembers();
    }

    public int NoMemberTrainerGymGreaterThan1() {            // 3.api
        return gymRepository.NoMemberTrainerGymGreaterThan1();
    }
}
