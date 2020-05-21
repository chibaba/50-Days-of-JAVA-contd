package com.company.DailyGoal;

import com.company.fitness.Steps;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class DailyGoal {
    int dailyGoal  = 10000;

    public boolean hasMetGoal (Steps steps) {
        if (steps.getSteps() >= dailyGoal) {
            return true;
        }
        return false;
    }

}
