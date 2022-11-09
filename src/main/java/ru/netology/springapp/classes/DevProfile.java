package ru.netology.springapp.classes;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is Dev";
    }
}
