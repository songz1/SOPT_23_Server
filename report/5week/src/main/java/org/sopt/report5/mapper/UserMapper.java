package org.sopt.report5.mapper;

import org.apache.ibatis.annotations.*;
import org.sopt.report5.dto.User;

import java.util.List;

@Mapper
public interface UserMapper {

    // 모든 회원 조회
    @Select("SELECT * FROM user")
    List<User> findAll();

    // 회원 이름으로 조회
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") final String name);

    // 회원 파트로 조회
    @Select("SELECT * FROM user WHERE part = #{part}")
    User findByPart(@Param("part") final String part);

    // 회원 이름과 파트로 조회
    @Select("SELECT * FROM user WHERE name = #{name} AND part = #{part}")
    User findByNameAndPart(@Param("name") final String name, @Param("part") final String part);

    // 회원 고유번호로 조회
    @Select("SELECT * FROM user WHERE user_idx = #{user_idx}")
    User findByUserIdx(@Param("user_idx") final int user_idx);

    // 회원 등록
    @Insert("INSERT INTO user(name, part) VALUES(#{user.name}, #{user.part})")
    void save(@Param("user") final User user);

    // 회원 수정
    @Update("UPDATE user SET name = #{user.name}, part = #{user.part} WHERE user_idx = #{user_idx}")
    void update(@Param("user_idx") final int user_idx, @Param("user") final User user);

    // 회원 삭제
    @Delete("DELETE FROM user WHERE user_idx = #{user_idx}")
    void deleteByUserIdx(@Param("user_idx") final int user_idx);

}
