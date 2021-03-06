package com.nadou.demo.common.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *@ClassName LoggerUtils
 *@Description 获取自定义logger
 *@Author amunamuna
 *@Date 2020/6/2 09:52
 *@Version 1.0
 **/
public class LoggerUtils {
  //自定义logger
  public static Logger traceLogger = LoggerFactory.getLogger(LogFileName.M_TRACE_LOGGER.getLogFileName());
  public static Logger monitorLogger = LoggerFactory.getLogger(LogFileName.M_MONITOR_LOGGER.getLogFileName());

}
