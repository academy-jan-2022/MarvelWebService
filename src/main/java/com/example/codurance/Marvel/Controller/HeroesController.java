package com.example.codurance.Marvel.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("heroes")
public class HeroesController {

    @GetMapping()
    @ResponseStatus  (HttpStatus.OK)
    @ResponseBody
    public void getHeroes(){

    }

}
