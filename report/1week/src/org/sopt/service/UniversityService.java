package org.sopt.service;

import org.sopt.model.University;

public interface UniversityService {
    // 대학 이름으로 조회
    University getByUniversityName(final String UniversityName);
}
