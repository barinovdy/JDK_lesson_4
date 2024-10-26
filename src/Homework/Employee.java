package Homework;

public class Employee {
    private int personnelNumber;
    private String phoneNumber;
    private String name;
    private float experience;

    public Employee(int personnelNumber, String phoneNumber, String name, float experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Табельный номер: " + personnelNumber +
                ", номер телефона: " + phoneNumber +
                ", имя: " + name +
                ", стаж: " + experience;
    }
}
