package org.sopt.model;

public class Professor extends Department{
    // 교수 고유 번호
    private int idx;
    // 교수 이름
    private String name;
    // 교수 학과
    private String part;
    // 교수 전화번호
    private String num;
    // 담당 과목
    private String subject;

    public Professor(){
    }

    public Professor(int idx, String name, String part, String num, String subject) {
        this.idx = idx;
        this.name = name;
        this.part = part;
        this.num = num;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", part='" + part + '\'' +
                ", num='" + num + '\'' +
                ", subject='" + subject + '\'' +
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

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
