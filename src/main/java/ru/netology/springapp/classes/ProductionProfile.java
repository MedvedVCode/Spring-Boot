package ru.netology.springapp.classes;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is Production";
    }
}
