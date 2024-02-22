package com.car.manage.car.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CarVO {
    private int modelNumber;
    private String modelName;
    private int price;
    private int mfrCode;
    private String mfrName;
    private MfrVO mfrVO;
}
