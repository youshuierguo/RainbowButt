package com.wangqi.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Hello implements Serializable {
    private String variable;
    private String value;
    private String setTime;
    private String setBy;

}
