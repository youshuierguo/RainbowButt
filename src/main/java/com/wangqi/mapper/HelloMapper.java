package com.wangqi.mapper;

import com.wangqi.vo.Hello;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface HelloMapper {
    Hello selectAll();
}
