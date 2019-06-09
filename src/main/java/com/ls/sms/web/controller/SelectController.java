package com.ls.sms.web.controller;

import com.ls.sms.bean.Course;
import com.ls.sms.bean.User;
import com.ls.sms.bean.studentCourse;
import com.ls.sms.service.AllActionService;
import com.ls.sms.service.impl.AllActionServiceImpl;
import com.ls.sms.utils.Message;
import com.ls.sms.utils.MessageUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("select")
public class SelectController {

    @Autowired
    private AllActionService allActionService;

    @ApiOperation("通过id查询班级")
    @GetMapping("course")
    public Message selectCourseByPrimaryKey(Long id){
        Course course = allActionService.selectCourseByPrimaryKey(id);

        return MessageUtils.success("查询成功",course);
    }

    @ApiOperation("通过id查询用户")
    @GetMapping("user")
    public Message selectUserByPrimaryKey(Long id){
        User user = allActionService.selectUserByPrimaryKey(id);

        return MessageUtils.success("查询成功",user);
    }


    @ApiOperation("通过id查询课程")
    @GetMapping("studentCourse")
    public Message selectstudentCourseByPrimaryKey(Long id){
        studentCourse studentCourse = allActionService.selectstudentCourseByPrimaryKey(id); allActionService.selectstudentCourseByPrimaryKey(id);

        return MessageUtils.success("查询成功",studentCourse);
    }


   @ApiOperation("查询学生")
    @GetMapping("student")
    public Message findAllstudent(){
        List<User> allstudent = allActionService.findAllstudent();

        return MessageUtils.success("查询成功",allstudent);
    }

    @ApiOperation("查询教师")
    @GetMapping("teacher")
    public Message findAllteacher(){
        List<User> allteacher = allActionService.findAllteacher();

        return MessageUtils.success("查询成功",allteacher);
    }

    @ApiOperation("查询课程")
    @GetMapping("Allcourse")
    public Message findAllCourse(){
        List<Course> allCourse = allActionService.findAllCourse();

        return MessageUtils.success("查询成功",allCourse);
    }

    @ApiOperation("查询学科")
    @GetMapping("Allxk_name")
    public Message findAllstudentCourse(){
        List<studentCourse>  studentCourses = allActionService.findAllstudentCourse();

        return MessageUtils.success("查询成功",studentCourses);
    }


}
