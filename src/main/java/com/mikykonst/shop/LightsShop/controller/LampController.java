package com.mikykonst.shop.LightsShop.controller;

import com.mikykonst.shop.LightsShop.dao.LampRepositoty;
import com.mikykonst.shop.LightsShop.model.Lamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LampController {

    @Autowired
    final LampRepositoty repositoty;

    public LampController(LampRepositoty repositoty) {
        this.repositoty = repositoty;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
