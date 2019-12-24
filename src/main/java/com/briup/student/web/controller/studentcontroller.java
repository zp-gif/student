package com.briup.student.web.controller;

import com.briup.student.bean.student;
import com.briup.student.util.Message;
import com.briup.student.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class studentcontroller {
    @ApiOperation(value="添加学生")
    @PostMapping("/add")
    public Message add(student stu) {
        /*Message<String> message=new Message<>();
        Date date=new Date();
        message.setTime(date.getTime());
        message.setStatus(200);
        message.setMessage("success");
        message.setData("添加学生成功");
        return message;

    }*/
        return MessageUtil.success("添加学生成功");

    }
    @GetMapping("/delete")
    @ApiOperation(value="删除学生")
    //对参数进行说明，注意一个参数和多个参数使用的不同方法
   // @ApiImplicitParam(name="stuID",value="学号",paramType="query",dataType ="int")
    @ApiImplicitParams({
            //required代表这个属性一定要填
            @ApiImplicitParam(name="stuID",value="学号",paramType="query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value="姓名",paramType = "query",dataType = "String")
    })
    public Message delete(int stuID,String name){
        return MessageUtil.success("删除学生成功");
    }
}

