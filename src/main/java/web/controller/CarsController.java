package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;


import java.awt.print.Pageable;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String showCars(ModelMap modelMap, @RequestParam(defaultValue = "0") Integer count) {
        count = count < 0 | count > 5 ? 5 : count;
        List<Car> carList = Car.createFiveCars();
        modelMap.addAttribute("carList", carList.subList(0, count));
        modelMap.addAttribute("car", new Car());
        return "cars";
    }

//    @GetMapping("/cars")
//    public List<Car> getCars(@RequestParam(defaultValue = "0") Integer page,
//                             @RequestParam(defaultValue = "5") Integer size) {
//        Pageable paging = PageRequest.of(page, size);
//
//        Page<Car> pagedResult = carRepository.findAll(paging);
//
//        if(pagedResult.hasContent()) {
//            return pagedResult.getContent();
//        } else {
//            return new ArrayList<Car>();
//        }
//    }


}
