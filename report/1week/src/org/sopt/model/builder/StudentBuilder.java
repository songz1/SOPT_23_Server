package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int idx;
    private String name;
    private int grade;
    private String part;
    private String email;
    private String address;
    private int year;
    private String state;

    public StudentBuilder setIdx(final int idx){
        this.idx = idx;
        return this;
    }
    public StudentBuilder setName(final String name){
        this.name = name;
        return this;
    }
    public StudentBuilder setGrade(final int grade){
        this.grade = grade;
        return this;
    }
    public StudentBuilder setPart(final String part){
        this.part = part;
        return this;
    }
    public StudentBuilder setEmail(final String email){
        this.email = email;
        return this;
    }
    public StudentBuilder setAddress(final String address){
        this.address = address;
        return this;
    }
    public StudentBuilder setYear(final int year){
        this.year = year;
        return this;
    }
    public StudentBuilder setState(final String state){
        this.state = state;
        return this;
    }

    public Student build(){
        return new Student(this.idx, this.name, this.grade, this.part, this.email, this.address, this.year, this.state);
    }
}
