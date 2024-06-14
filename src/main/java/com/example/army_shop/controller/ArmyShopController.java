package com.example.army_shop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.army_shop.dao.ArmyShopDao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ArmyShopController {
  @Autowired
  ArmyShopDao armyShopDao;
    
  @GetMapping("army_shop/{year}/{month}")
  public List<Map<String, Object>> armyShop2(
    @PathVariable("year") int year,
    @PathVariable("month") int month)
   {
      return armyShopDao.select(year, month);
  }

  @GetMapping("army_shop")
  public List<Map<String, Object>> armyShop(
    @RequestParam("year") int year,
    @RequestParam("month") int month)
   {
      return armyShopDao.select(year, month);
  }
    
}
