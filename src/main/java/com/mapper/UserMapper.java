package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @desc：
 * @title：UserMapper
 * @author: huangwencai
 * @date: 2020-01-16 15:24
 * @version: v4.40.0
 */
//@Repository  这里Repository可以不写，因为不管是在接口类上面加注解@Mapper,还是在启动类上面加@MapperScan注解，都会涉及到该这里
//@Mapper
public interface UserMapper {
    User Sel(int id);
    void add();
    void subtract();
}
