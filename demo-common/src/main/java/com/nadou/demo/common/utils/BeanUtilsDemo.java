package com.nadou.demo.common.utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


/**
 *@ClassName Demo
 *@Description BeanUtilsDemo
 *@Author amunamuna
 *@Date 2020/6/5 10:19
 *@Version 1.0
 **/
public class BeanUtilsDemo {
  @Test
  public void test1() throws ParseException {
    Map<String, Object> map1 = new HashMap<>();
    Map<String, Object> map2 = new HashMap<>();
    map1.put("userName","张三");
    map1.put("userId","001");
    map2.put("userName","王五");
    map2.put("userId","002");
    ArrayList<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
    maps.add(map1);
    maps.add(map2);
    List<UtilEntity> entities = BeanUtils.mapsToBeans(maps, UtilEntity.class);
    System.out.println(entities.toString());
  }
  @Test
  public void test2() throws ParseException {
    UtilEntity utilEntity1 = new UtilEntity("001","张三");
    UtilEntity utilEntity2 = new UtilEntity("002","王五");
    ArrayList<UtilEntity> beans = new ArrayList<>();
    beans.add(utilEntity1);
    beans.add(utilEntity2);

    List<Map<String, Object>> maps = BeanUtils.beansToMaps(beans);
    System.out.println(maps.toString());
  }
}
