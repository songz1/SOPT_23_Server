package org.sopt.model;

public class Department extends University {
    // 학과 고유 번호
    private int idx;
    // 학과 이름
    private String name;
    // 학과 전화번호
    private String num;
    // 학과 타입(공대, 자연대, 사범대, 치대..)
    private String type;

    public Department(){
    }

    public Department(int idx, String name, String num, String type) {
        this.idx = idx;
        this.name = name;
        this.num = num;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", type='" + type + '\'' +
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
