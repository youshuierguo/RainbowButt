package com.tw.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultModel  implements Serializable {
    private boolean b;
    private String s;
    public ResultModel(boolean b, String s) {
        this.b=b;
        this.s=s;
    }
}
