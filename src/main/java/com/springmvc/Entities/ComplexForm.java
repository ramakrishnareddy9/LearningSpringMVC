package com.springmvc.Entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public class ComplexForm {

    private Integer id;
    private String name;
    private String dob;
    private List<String> course;
    private String gender;
    private String type;
    private Address address;

    public ComplexForm() {}

    public ComplexForm(Integer id, String name, String dob, List<String> course, String gender, String type,Address address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.course = course;
        this.gender = gender;
        this.type = type;
        this.address = address;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public List<String> getCourse() { return course; }
    public void setCourse(List<String> course) { this.course = course; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return "ComplexForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", course=" + course +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", address=" + address +
                '}';
    }
}
