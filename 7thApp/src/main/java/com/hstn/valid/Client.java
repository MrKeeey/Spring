package com.hstn.valid;

import com.hstn.valid.validation.CarNumber;
import jakarta.validation.constraints.*;

public class Client {
    private String firstName;

    @NotNull(message = "The field must not be empty.")
    @Size(min = 2, max = 100, message = "Enter correct last name. Min 2 symbols, max 100 symbols.")
    private String lastName;

    @NotNull(message = "Enter your age.")
    @Min(value = 18, message = "You must be older then 17.")
    @Max(value = 125, message = "Are you really still alive? You must be younger then 126.")
    private Integer age;

    @NotNull
//    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Enter valid zip code. Only numbers, 5 digit.")
    @Pattern(regexp = "^[0-9]{5}", message = "Enter valid zip code. Only numbers, 5 digit.")
    private String zipCode;

    @CarNumber(value = "ENG", message = "Number must be from England")
    private String carNumber;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
