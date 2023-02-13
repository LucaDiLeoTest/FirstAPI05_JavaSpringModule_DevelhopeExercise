package co.develhope.FirstAPI05.controllers;

import co.develhope.FirstAPI05.DTO.CarDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {


    @GetMapping("/thecar")
    public CarDTO getCar(@RequestParam String id,@RequestParam String modelName,@RequestParam(required = false) Double price){
        return new CarDTO(id,modelName,price);
    }

    @PostMapping("/print")
    public String postCar(@Validated @RequestBody CarDTO car){
        System.out.println(car.toString());
        return "Created";
    }
}
