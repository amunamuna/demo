package com.example.demo.common.page;

/**
 * @ClassName PageVo
 * @Description 分页请求
 * @Author nannan.zhang
 * @Date 2020/5/11 15:49
 * @Version 1.0
 **/
public class CommonPageRequest<T> {
    private int pageSize;

    private int pageIndex;

    private T data;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
