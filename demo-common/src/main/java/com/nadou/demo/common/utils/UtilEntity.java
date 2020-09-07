package com.nadou.demo.common.utils;

import java.io.Serializable;

import lombok.Data;

/**
 *@ClassName UtilEntity
 *@Description TODO
 *@Author amunamuna
 *@Date 2020/6/4 11:02
 *@Version 1.0
 **/
@Data
public class UtilEntity implements Serializable {
  private String userId;
  private String userName;

  public UtilEntity() {
  }

  public UtilEntity(String userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }
}
