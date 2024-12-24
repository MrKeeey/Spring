package com.hstn.thymeleaf.model;

import java.util.List;

public class Pupil {
    private String firstName;
    private String lastName;
    private String sex;
    private String city;
    private String favoriteDrink;
    private List<String> favoriteCars;

    public Pupil() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }

    public List<String> getFavoriteCars() {
        return favoriteCars;
    }

    public void setFavoriteCars(List<String> favoriteCars) {
        this.favoriteCars = favoriteCars;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", favoriteDrink='" + favoriteDrink + '\'' +
                ", favoriteCars=" + favoriteCars +
                '}';
    }
}
