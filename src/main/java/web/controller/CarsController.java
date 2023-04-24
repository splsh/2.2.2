package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarServiceImpl service;

    @Autowired
    public CarsController(CarServiceImpl service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap modelMap, @RequestParam(defaultValue = "0") Integer quantity) {
        modelMap.addAttribute("carList", service.returnCarQuantity(quantity));
        modelMap.addAttribute("car", new Car());
        return "cars";
    }

}
