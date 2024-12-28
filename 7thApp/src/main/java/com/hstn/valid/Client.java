package com.hstn.valid;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Client {
    private String firstName;

    @NotNull(message = "The field must not be empty.")
    @Size(min = 2, max = 100, message = "Enter correct last name. Min 2 symbols, max 100 symbols.")
    private String lastName;

    @Min(value = 18, message = "You must be older then 17.")
    @Max(value = 125, message = "Are you really still alive? You must be younger then 126.")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
