package org.sopt.report5.dto;

import lombok.Data;

@Data
public class User {
    // 회원 고유번호
    private int user_idx = 0;
    // 회원 이름
    private String name = "";
    // 회원 파트
    private String part = "";
}
