package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Student
        final ArrayList<Student> studentList = new ArrayList<>();

        final StudentBuilder studentBuilder1 = new StudentBuilder();
        final StudentBuilder studentBuilder2 = new StudentBuilder();
        final StudentBuilder studentBuilder3 = new StudentBuilder();

        final Student student1 = studentBuilder1
                .build();
        final Student student2 = studentBuilder2
                .build();
        final Student student3 = studentBuilder3
                .build();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (final Student s : studentList) {
            System.out.println(s.toString());
        }


        // Professor
        final ArrayList<Professor> professorList = new ArrayList<>();

        final ProfessorBuilder professorBuilder1 = new ProfessorBuilder();
        final ProfessorBuilder professorBuilder2 = new ProfessorBuilder();
        final ProfessorBuilder professorBuilder3 = new ProfessorBuilder();

        final Professor professor1 = professorBuilder1
                .build();
        final Professor professor2 = professorBuilder2
                .build();
        final Professor professor3 = professorBuilder3
                .build();

        professorList.add(professor1);
        professorList.add(professor2);
        professorList.add(professor3);

        for (final Professor p : professorList) {
            System.out.println(p.toString());
        }


        // Department
        final ArrayList<Department> departmentList = new ArrayList<>();

        final DepartmentBuilder departmentBuilder1 = new DepartmentBuilder();
        final DepartmentBuilder departmentBuilder2 = new DepartmentBuilder();
        final DepartmentBuilder departmentBuilder3 = new DepartmentBuilder();

        final Department department1 = departmentBuilder1
                .build();
        final Department department2 = departmentBuilder2
                .build();
        final Department department3 = departmentBuilder3
                .build();

        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);

        for (final Department d : departmentList) {
            System.out.println(d.toString());
        }


        // University
        final ArrayList<University> universityList = new ArrayList<>();

        final UniversityBuilder universityBuilder1 = new UniversityBuilder();
        final UniversityBuilder universityBuilder2 = new UniversityBuilder();
        final UniversityBuilder universityBuilder3 = new UniversityBuilder();

        final University university1 = universityBuilder1
                .build();
        final University university2 = universityBuilder2
                .build();
        final University university3 = universityBuilder3
                .build();

        universityList.add(university1);
        universityList.add(university2);
        universityList.add(university3);

        for (final University u : universityList) {
            System.out.println(u.toString());
        }

    }
}
