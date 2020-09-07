package com.nadou.demo.config;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @ClassName MyBatisConfig
 * @Description MyBatis配置类
 * @Author amunamuna
 * @Date 2020/9/7 14:17
 * @Version 1.0
 **/
@Configuration
@MapperScan("com.nadou.demo.modules.*.mapper")
public class MyBatisConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }
}
