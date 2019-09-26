package com.poktest.spring.validate.mvc.model;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message = "is require")
    @Size(min=1,message = "is require")
    private String lastName;

    @NotNull(message = "is require")
    @Min(value=0,message ="must be greater than or equal to zero" )
    @Max(value=10,message ="must be less than or equal to 10" )
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @NotNull(message = "is required")
    @Email(message = "Invalid email! Please enter valid email")
    private String email;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", freePasses=" + freePasses +
                ", postalCode='" + postalCode + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
