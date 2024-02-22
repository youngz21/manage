package com.car.manage.car.services;

import com.car.manage.car.vo.CarVO;
import com.car.manage.car.vo.MfrVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void addModel(CarVO carVO) {
        sqlSession.insert("carMapper.addModel", carVO);
    }

    @Override
    public List<CarVO> selectCars() {
        return sqlSession.selectList("carMapper.selectCars");
    }

    @Override
    public List<MfrVO> selectMfrList() {
        return sqlSession.selectList("carMapper.selectMfrList");
    }
}
