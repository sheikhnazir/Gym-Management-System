package com.example.GymManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class gymController {
    @Autowired
    gymService gymService;

    @PostMapping("/add-Gym")
    public String addGym(@RequestBody Gym gym) {
        gymService.addGym(gym);
        return "Gym has been added successfully";
    }

    @PostMapping("/add-Member")
    public String addMember(@RequestBody Member member) {
        gymService.addMember(member);
        return "Member has been added successfully";
    }

    @PostMapping("/add-Trainer")
    public String addTrainer(@RequestBody Trainer trainer) {
        gymService.addTrainer(trainer);
        return "Trainer has been added successfully";
    }

    @GetMapping("/member-Most-Trainer")
    public int memberMostTrainer() {
        return gymService.memberMostTrainer();
    }

    @GetMapping("/gym-Most-No-Of-Member")
    public int gymMostNoOfMember() {
        return gymService.gymMostNoOfMember();
    }

    @GetMapping("/No-Member-Trainer-Gym-GreaterThan1")
    public int NoMemberTrainerGymGreaterThan1() {
        return gymService.NoMemberTrainerGymGreaterThan1();
    }
}
