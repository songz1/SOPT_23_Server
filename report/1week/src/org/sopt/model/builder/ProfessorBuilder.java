package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int idx;
    private String name;
    private String part;
    private String num;
    private String subject;

    public ProfessorBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public ProfessorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProfessorBuilder setPart(String part) {
        this.part = part;
        return this;
    }

    public ProfessorBuilder setNum(String num) {
        this.num = num;
        return this;
    }

    public ProfessorBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Professor build(){
        return new Professor(this.idx, this.name, this.part, this.num, this.subject);
    }
}
