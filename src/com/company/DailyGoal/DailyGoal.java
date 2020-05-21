package com.company.DailyGoal;

import com.company.fitness.Steps;

public class DailyGoal {
    int dailyGoal  = 10000;

    public boolean hasMetGoal (Steps steps) {
        if (steps.getSteps() >= dailyGoal) {
            return true;
        }
        return false
    }
}
