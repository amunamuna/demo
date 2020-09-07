package com.nadou.demo;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadou.demo.common.logger.LoggerUtils;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static Logger traceLogger = LoggerUtils.traceLogger;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
