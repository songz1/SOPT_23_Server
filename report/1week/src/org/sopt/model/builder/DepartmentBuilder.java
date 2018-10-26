package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private int idx;
    private String name;
    private String num;
    private String type;

    public DepartmentBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public DepartmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DepartmentBuilder setNum(String num) {
        this.num = num;
        return this;
    }

    public DepartmentBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Department build(){
        return new Department(this.idx, this.name, this.num, this.type);
    }
}
