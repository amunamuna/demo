package com.example.demo.common.page;

import lombok.Data;

/**
 * @ClassName CommonPageRequest
 * @Description 分页请求
 * @Author nannan.zhang
 * @Date 2020/5/11 15:49
 * @Version 1.0
 **/
@Data
public class CommonPageRequest<T> {
    //当前页
    private int pageIndex;
    //每页的数量
    private int pageSize;
    private T data;
}
