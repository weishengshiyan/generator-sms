package com.ls.sms.web.controller;

import com.ls.sms.service.AllActionService;
import com.ls.sms.service.impl.AllActionServiceImpl;
import com.ls.sms.utils.Message;
import com.ls.sms.utils.MessageUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delete")
public class DeleteController {

    @Autowired
    private AllActionService allActionService;

    @ApiOperation("通过id删除课程")
    @GetMapping("course")//如果有错就是这里错
    public Message deleteCourseByPrimaryKey(@ApiParam(value="主键",required = true) @RequestParam(value = "id") Long id){
                allActionService.deleteCourseByPrimaryKey(id);
        return MessageUtils.success("删除成功");
    }


    @ApiOperation("通过id删除学生")
    @GetMapping("studentourse")//如果有错就是这里错
    public Message deletestudentCourseByPrimaryKey(@ApiParam(value="主键",required = true) @RequestParam(value = "id") Long id){
        allActionService.deletestudentCourseByPrimaryKey(id);
        return MessageUtils.success("删除成功");
    }

        //后期删除学生或教师就在改
    @ApiOperation("通过id删除课程")
    @GetMapping("user")//如果有错就是这里错
    public Message deleteUserPrimaryKey(@ApiParam(value="主键",required = true) @RequestParam(value = "id") Long id){
        allActionService.deleteUserByPrimaryKey(id);
        return MessageUtils.success("删除成功");
    }




}
