package com.car.manage.sales.services;

import com.car.manage.sales.vo.SalesVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesServiceImpl implements SalesService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void insertSales(SalesVO salesVO) {
        sqlSession.insert("salesMapper.addSales", salesVO);
    }
}
