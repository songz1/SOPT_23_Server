package org.sopt.model;

public class Student extends Department{
    // 학번
    private int idx;
    // 이름
    private String name;
    // 학년
    private int grade;
    // 학과
    private String part;
    // 이메일
    private String email;
    // 주소
    private String address;
    // 나이
    private int year;
    // 현재 상태(휴학, 재학, 군휴학, 취업계)
    private String state;

    public  Student(){
    }

    public Student(int idx, String name, int grade, String part, String email, String address, int year, String state) {
        this.idx = idx;
        this.name = name;
        this.grade = grade;
        this.part = part;
        this.email = email;
        this.address = address;
        this.year = year;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", part='" + part + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year +
                ", state='" + state + '\'' +
                '}';
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
