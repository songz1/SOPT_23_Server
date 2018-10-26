package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getByStudentIdx(int getByStudentIdx){
        // Builder로 객체 생성해서 반환
        StudentBuilder studentBuilder = new StudentBuilder();

        return studentBuilder.build();
    }
}
