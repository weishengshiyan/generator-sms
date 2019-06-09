package com.ls.sms.dao;

import com.ls.sms.bean.studentCourse;

import java.util.List;

public interface StudentCourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(studentCourse record);

    int insertSelective(studentCourse record);

    studentCourse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(studentCourse record);

    int updateByPrimaryKey(studentCourse record);

        List<studentCourse> findAllstudentCourse();


}