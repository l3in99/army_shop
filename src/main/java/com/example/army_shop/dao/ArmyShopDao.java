package com.example.army_shop.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArmyShopDao {
  @Autowired JdbcTemplate jt;

  public List<Map<String, Object>> select(int year, int month) {
    String sql = "select * from army_shop";
    // 이 같은 방식은 sql injection이라는 방식으로 해킹당할 우려가 있다
    // sql += " where year= " + year;
    // sql += " and month= " + month;
    sql += " where year=?";
    sql += " and month=?";
    return jt.queryForList(sql, year, month);
  }
}
