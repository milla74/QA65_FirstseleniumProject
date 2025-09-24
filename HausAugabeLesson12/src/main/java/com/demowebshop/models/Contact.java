package com.demowebshop.models;

import java.util.StringJoiner;

public class Contact {
    @Override
    public String toString() {
        return new StringJoiner(", ", Contact.class.getSimpleName() + "[", "]")
                .add("firstname='" + lastname + "'")
                .toString();
    }

    public String getGender(){
        return gender;
    }
    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getConfirmPassword(){
        return confirmpassword;
    }


    public Contact setGender(String gender){
        this.gender = gender;
        return this;
    }
    public Contact setFirsName(String firstname) {
        this.firstname = firstname;
        return this;
    }
    public Contact setLastName(String lastName) {
        this.lastname = lastName;
        return this;
    }
    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }
    public Contact setPassword(String password){
        this.password = password;
        return this;
    }
    public Contact setConfirmPassword(String confirmpassword){
        this.confirmpassword = confirmpassword;
        return this;
    }
    private String gender;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String ConfirmPassword;
}
