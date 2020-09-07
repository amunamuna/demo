package com.nadou.demo.common.logger;

/**
 *@ClassName LogFileName
 *@Description logger名需与logback中的保持一致
 *@Author amunamuna
 *@Date 2020/6/2 10:35
 *@Version 1.0
 **/
public enum LogFileName {
  M_TRACE_LOGGER("mTraceLogger"),
  M_MONITOR_LOGGER("mMonitorLogger");

  private String logFileName;

  LogFileName(String fileName) {
    this.logFileName = fileName;
  }

  public String getLogFileName() {
    return logFileName;
  }

  public void setLogFileName(String logFileName) {
    this.logFileName = logFileName;
  }
}
