package com.car.manage.car.controller;

import com.car.manage.car.services.CarServiceImpl;
import com.car.manage.car.vo.CarVO;
import com.car.manage.car.vo.MfrVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Resource(name="carService")
    private CarServiceImpl carService;

    @GetMapping("/management")
    public String management(Model model) {
        List<CarVO> carList = carService.selectCars();
        List<MfrVO> mfrList = carService.selectMfrList();
        model.addAttribute("carList" , carList);
        model.addAttribute("mfrList", mfrList);
        System.out.println(carList);
        return "content/car/management";
    }

    @PostMapping("/addModel")
    public String addModel(CarVO carVO) {
        carService.addModel(carVO);
        return "redirect:/";
    }

}
