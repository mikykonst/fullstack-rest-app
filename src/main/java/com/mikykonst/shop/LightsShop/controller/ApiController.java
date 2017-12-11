package com.mikykonst.shop.LightsShop.controller;

import com.mikykonst.shop.LightsShop.dao.LampRepositoty;
import com.mikykonst.shop.LightsShop.model.Lamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    final LampRepositoty repositoty;

    public ApiController(LampRepositoty repositoty) {
        this.repositoty = repositoty;
    }

    @CrossOrigin
    @GetMapping("/getAllProducts")
    public Iterable<Lamp> getAll() {
        return repositoty.findAll();
    }

    @GetMapping("/addProduct")
    public void add(@RequestParam(value = "name") String name,
                    @RequestParam(value = "description") String description,
                    @RequestParam(value = "url") String url,
                    @RequestParam(value = "price") String price) {
        Lamp lamp = new Lamp(name, description, url, price);
        repositoty.save(lamp);
    }
}
