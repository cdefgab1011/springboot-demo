package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    @ApiModelProperty(value = "时间戳", position = 1, required = true)
    private Date ts;

    @ApiModelProperty(value = "温度", position = 2, required = true)
    private int temperature;

    @ApiModelProperty(value = "湿度", position = 3)
    private float humidity;

}
