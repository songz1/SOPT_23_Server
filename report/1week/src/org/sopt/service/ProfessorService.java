package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    // 교수 고유 번호로 조회
    Professor getByProfessorIdx(final int ProfessorIdx);
}
