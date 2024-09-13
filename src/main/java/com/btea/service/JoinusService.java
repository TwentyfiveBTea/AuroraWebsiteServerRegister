package com.btea.service;

import com.btea.dto.JoinusDto;


/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/09/12 20:14
 * @Description: “加入我们” 接口
 */
public interface JoinusService {

    /**
     * 新成员报名
     *
     * @param joinusDto
     * @return 插入数据的条数
     */
    int insertMember(JoinusDto joinusDto);
}