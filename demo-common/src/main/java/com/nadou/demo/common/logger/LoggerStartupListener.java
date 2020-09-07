package com.nadou.demo.common.logger;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

/**
 *@ClassName LoggerStartupListener
 *@Description 程序启动时,传参
 *@Author amunamuna
 *@Date 2019/12/7 11:10 AM
 *@Version 1.0
 **/
public class LoggerStartupListener extends ContextAwareBase
    implements LoggerContextListener, LifeCycle {

  private boolean started = false;

  @Override
  public void start() {
    if (started) {
      return;
    }
    Context context = getContext();
    context.putProperty("server.name", getServerName());
    started = true;
  }

  private String getServerName(){
      String str=System.getProperty("sun.java.command");
      String serverName=null;
      if(str!=null){
        String[] s=str.split("\\s+");
        serverName=s[s.length-1];
      }else{
        serverName="Log"+String.valueOf(Math.random()*100);
      }

    return serverName;
  }

  @Override
  public void stop() {}

  @Override
  public boolean isStarted() {
    return started;
  }

  @Override
  public boolean isResetResistant() {
    return true;
  }

  @Override
  public void onStart( LoggerContext context ) {}

  @Override
  public void onReset( LoggerContext context ) {}

  @Override
  public void onStop( LoggerContext context ) {}

  @Override
  public void onLevelChange( Logger logger, Level level ) {}

}