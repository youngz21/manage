package com.car.manage.car.services;

import com.car.manage.car.vo.CarVO;
import com.car.manage.car.vo.MfrVO;

import java.util.List;

public interface CarService {
    void addModel(CarVO carVO);
    List<CarVO> selectCars();
    List<MfrVO> selectMfrList();

}
