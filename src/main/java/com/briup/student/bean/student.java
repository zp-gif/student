package com.briup.student.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class student implements Serializable{
    @ApiModelProperty(value="学生Id",required = true)
    private  int id;
    @ApiModelProperty(value="学生姓名")
    private String name;
    @ApiModelProperty(value="学生分数")
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
