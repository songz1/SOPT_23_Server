package org.sopt.model;

public class University {
    // 대학 고유 번호
    private int idx;
    // 대학 이름
    private String name;
    // 대학 전화번호
    private String num;
    // 대학 주소
    private String address;

    public  University(){
    }

    public University(int idx, String name, String num, String address) {
        this.idx = idx;
        this.name = name;
        this.num = num;
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", address='" + address + '\'' +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
