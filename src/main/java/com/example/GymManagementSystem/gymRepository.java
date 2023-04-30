package com.example.GymManagementSystem;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class gymRepository {

//    Q. Create a Gym Management System
//
//    Gym: GymId, Location, List<Members>, List<Trainers>
//    Member: MemberId, List<Trainer>,Gym
//    Trainer: TrainerId, List<Member>, List<Gym>
//    POST: Add Gym, Member, Trainer

//1.Find the member which is being trained by the most number of trainers.
//2.Find the number of members who are being trained by a trainer working in more than 1 gym.
//3.Find the gym with the most number of members.
    HashMap<Integer, Gym> gymDb = new HashMap<>();
    HashMap<Integer, Trainer> trainerDb = new HashMap<>();
    HashMap<Integer, Member> memberDb = new HashMap<>();

    public String addGym(Gym gym) {
        gymDb.put(gym.getGymId(), gym);
        return "Gym has been added successfully";
    }

    public String addTrainer(Trainer trainer) {
        trainerDb.put(trainer.getTrainerId(), trainer);
        return "Trainer has been added successfully";
    }

    public String addMember(Member member) {
        memberDb.put(member.getMemberId(), member);
        return "Member has been added successfully";
    }


    //1.Find the member which is being trained by the most number of trainers.
    public int memberMostTrainer() {                    // 1. api
        int ans = 0;
        int max = 0;
        for (int memberId : memberDb.keySet()) {
            int curr =  memberDb.get(memberId).getTrainers().size();
            if (max < curr) {
                ans = memberId;
                max = curr;
            }
        }
        return ans;
    }

    //2.Find the number of members who are being trained by a trainer working in more than 1
    public int NoMemberTrainerGymGreaterThan1()                                  // 2. API
    {
        //  2. Find the number of members who are being trained by a trainer working in more than 1 gym.
        int count = 0;

        for(int memberId : memberDb.keySet())
        {
            List<Trainer> trainers = memberDb.get(memberId).getTrainers();

            for(Trainer trainer : trainers)
            {
                if(trainer.getGyms().size() > 1)
                {
                    count++;
                    break;
                }
            }

        }

        return count;
    }

    //3.Find the gym with the most number of members.
    public int gymMostMembers() {
        int ans = 0;
        int max = 0;
        for (int gymId : gymDb.keySet()) {
            int curr = gymDb.get(gymId).getMembers().size();
            if(max < curr) {
                ans = gymId;
                max = curr;
            }
        }
        return ans;
    }

}
