package com.ls.sms.service;

import com.ls.sms.bean.Course;
import com.ls.sms.bean.User;
import com.ls.sms.bean.studentCourse;

import java.util.List;

public interface AllActionService {

    //课程表增删改查

    int deleteCourseByPrimaryKey(Long id);

    int insertCourse(Course record);

    int insertCourseSelective(Course record);

    Course selectCourseByPrimaryKey(Long id);

    int updateCourseByPrimaryKeySelective(Course record);

    int updateCourseByPrimaryKey(Course record);


    //学生课程表增删改查
    int deletestudentCourseByPrimaryKey(Long id);

    int insertstudentCourse(studentCourse record);

    int insertstudentCourseSelective(studentCourse record);

    studentCourse selectstudentCourseByPrimaryKey(Long id);

    int updatestudentCourseByPrimaryKeySelective(studentCourse record);

    int updatestudentCourseByPrimaryKey(studentCourse record);

    //用户增删改查
    int deleteUserByPrimaryKey(Long id);

    int insertUser(User record);

    int insertUserSelective(User record);

    User selectUserByPrimaryKey(Long id);

    int updateUserByPrimaryKeySelective(User record);

    int updateUserByPrimaryKey(User record);



    List<User> findAllstudent();
    List<User> findAllteacher();


    List<Course> findAllCourse();
    List<studentCourse> findAllstudentCourse();


}
