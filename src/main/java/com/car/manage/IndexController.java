package com.car.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){

        System.out.println("dev 브랜치에서 추가한 코드");
        return "redirect:/car/management";
    }
}
