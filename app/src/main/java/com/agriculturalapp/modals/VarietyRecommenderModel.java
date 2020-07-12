package com.agriculturalapp.modals;

import java.util.Comparator;

/**
 * Created by user on 15-02-2019.
 */

public class VarietyRecommenderModel {

    private String cropName;
    private double cropProbability;

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public double getCropProbability() {
        return cropProbability;
    }

    public void setCropProbability(double cropProbability) {
        this.cropProbability = cropProbability;
    }
}
