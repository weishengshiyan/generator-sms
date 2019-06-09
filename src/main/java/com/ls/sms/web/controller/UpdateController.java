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
@RequestMapping("update")
public class UpdateController {

    @Autowired
    private AllActionService allActionService;
    @ApiOperation("更新课表")
    @GetMapping("studentCourse")
       public Message updatestudentCourseByPrimaryKey(studentCourse record){

            allActionService.updatestudentCourseByPrimaryKey(record);

           return MessageUtils.success("更新成功");
       }

    @ApiOperation("更新课表")
    @GetMapping("ourse")
    public Message updateCourseByPrimaryKey(Course record){

         allActionService.updateCourseByPrimaryKey(record);

        return MessageUtils.success("更新成功");
    }


    @ApiOperation("更新用户")
    @GetMapping("user")
    public Message updateUserByPrimaryKey(User record){

        allActionService.updateUserByPrimaryKey(record);

        return MessageUtils.success("更新成功");
    }

}
