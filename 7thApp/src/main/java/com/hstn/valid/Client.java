package com.hstn.valid;

import jakarta.validation.constraints.*;

public class Client {
    private String firstName;

    @NotNull(message = "The field must not be empty.")
    @Size(min = 2, max = 100, message = "Enter correct last name. Min 2 symbols, max 100 symbols.")
    private String lastName;

    @Min(value = 18, message = "You must be older then 17.")
    @Max(value = 125, message = "Are you really still alive? You must be younger then 126.")
    private int age;

    @NotNull
//    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Enter valid zip code. Only numbers, 5 digit.")
    @Pattern(regexp = "^[0-9]{5}", message = "Enter valid zip code. Only numbers, 5 digit.")
    private String zipCode;

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
