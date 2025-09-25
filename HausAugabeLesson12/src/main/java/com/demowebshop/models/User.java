package com.demowebshop.models;

public class User {
    private String gender;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    public String getGender() { return gender; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getConfirmPassword() { return confirmPassword; }

    public User setGender(String gender) { this.gender = gender; return this; }
    public User setFirstName(String firstName) { this.firstName = firstName; return this; }
    public User setLastName(String lastName) { this.lastName = lastName; return this; }
    public User setEmail(String email) { this.email = email; return this; }
    public User setPassword(String password) { this.password = password; return this; }
    public User setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; return this; }
}
