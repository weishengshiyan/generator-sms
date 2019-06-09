package com.ls.sms.service.impl;

import com.ls.sms.bean.Course;
import com.ls.sms.bean.User;
import com.ls.sms.bean.studentCourse;
import com.ls.sms.dao.CourseMapper;
import com.ls.sms.dao.StudentCourseMapper;
import com.ls.sms.dao.UserMapper;
import com.ls.sms.service.AllActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AllActionServiceImpl implements AllActionService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private CourseMapper courseMapper;

    @Resource
    private StudentCourseMapper studentCourseMapper;


    @Override
    public int deleteCourseByPrimaryKey(Long id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertCourse(Course record) {
        return courseMapper.insert(record);
    }

    @Override
    public int insertCourseSelective(Course record) {
        return courseMapper.insertSelective(record);
    }

    @Override
    public Course selectCourseByPrimaryKey(Long id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateCourseByPrimaryKeySelective(Course record) {
        return courseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateCourseByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deletestudentCourseByPrimaryKey(Long id) {
        return studentCourseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertstudentCourse(studentCourse record) {
        return studentCourseMapper.insert(record);
    }

    @Override
    public int insertstudentCourseSelective(studentCourse record) {
        return studentCourseMapper.insertSelective(record);
    }

    @Override
    public studentCourse selectstudentCourseByPrimaryKey(Long id) {
        return studentCourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatestudentCourseByPrimaryKeySelective(studentCourse record) {
        return studentCourseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updatestudentCourseByPrimaryKey(studentCourse record) {
        return studentCourseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteUserByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertUser(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertUserSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectUserByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUserByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateUserByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }


    @Override
    public List<studentCourse> findAllstudentCourse() {
        return studentCourseMapper.findAllstudentCourse();
    }

    @Override
    public List<Course> findAllCourse() {
        return courseMapper.findAllCourse();
    }

    @Override
    public List<User> findAllstudent() {
        return userMapper.findAllstudent();
    }

    @Override
    public List<User> findAllteacher() {
        return userMapper.findAllteacher();
    }
}
