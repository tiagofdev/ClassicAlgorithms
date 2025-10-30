package com.titi.algorithms.repo.implementation;

// This is a class used only to solve the Job Sequencing Problem
public class Job {
    String id;
    int deadline;
    int profit;
    Job (String id, String deadline, String profit) {
        this.id = id;
        this.deadline = Integer.parseInt(deadline);
        this.profit = Integer.parseInt(profit);
    }
}
