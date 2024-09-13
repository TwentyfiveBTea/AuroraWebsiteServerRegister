package com.btea.service;

import com.btea.dto.JoinusDto;
import com.btea.mapper.JoinusMapper;
import com.btea.pojo.Joinus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/09/12 20:14
 * @Description: “加入我们” 接口实现类
 */
@Service
public class JoinusServiceImpl implements JoinusService {
    private final JoinusMapper joinusMapper;

    public JoinusServiceImpl(JoinusMapper joinusMapper) {
        this.joinusMapper = joinusMapper;
    }

    @Override
    public int insertMember(JoinusDto joinusDto) {
        Joinus joinus = new Joinus();
        joinus.setName(joinusDto.getName());
        joinus.setGender(joinusDto.getGender());
        joinus.setGrade(joinusDto.getGrade());
        joinus.setPhone(joinusDto.getPhone());
        joinus.setEmail(joinusDto.getEmail());
        joinus.setMajors(joinusDto.getMajors());
        joinus.setOrientation(joinusDto.getOrientation());
        joinus.setIntroduce(joinusDto.getIntroduce());

        return joinusMapper.insert(joinus);
    }
}
