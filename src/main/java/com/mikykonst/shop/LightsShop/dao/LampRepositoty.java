package com.mikykonst.shop.LightsShop.dao;

import com.mikykonst.shop.LightsShop.model.Lamp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LampRepositoty extends CrudRepository<Lamp, Integer> {
}
