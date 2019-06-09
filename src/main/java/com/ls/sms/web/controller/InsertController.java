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

@RestController
@RequestMapping("insert")
public class InsertController {

    @Autowired
    private AllActionService allActionService;

    @ApiOperation("插入课程")
    @GetMapping("course")
       public Message insertCourse(Course record){

        allActionService.insertCourse(record);
        return MessageUtils.success("插入成功");
       }

    @ApiOperation("插入用户")
    @GetMapping("user")
    public Message insertUser(User record){

        allActionService.insertUser(record);
        return MessageUtils.success("插入成功");
    }

    @ApiOperation("插入课程表")
    @GetMapping("studentCourse")
    public Message insertStudentCourse(studentCourse record){

        allActionService.insertstudentCourse(record);
        return MessageUtils.success("插入成功");
    }



}