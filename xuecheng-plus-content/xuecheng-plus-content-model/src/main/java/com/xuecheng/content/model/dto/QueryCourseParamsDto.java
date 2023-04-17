package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author 郑帅
 * @Description TODO
 * @DateTime 2023/4/6 11:04
 **/
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    @ApiModelProperty("审核状态")
    private String auditStatus;

    //课程名称
    @ApiModelProperty("课程名称")
    private String courseName;

    //发布状态
    @ApiModelProperty("发布状态")
    private String publishStatus;
}
