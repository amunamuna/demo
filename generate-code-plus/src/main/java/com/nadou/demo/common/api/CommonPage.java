package com.nadou.demo.common.api;
import cn.hutool.core.convert.Convert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
/**
 * @ClassName CommonPage
 * @Description 分页数据封装类
 * @Author amunamuna
 * @Date 2020/9/7 14:53
 * @Version 1.0
 **/
public class CommonPage<T> {
    private Integer pageNum;//当前页
    private Integer pageSize;//每页的数量
    private Integer totalPage;//总页数
    private Long total;//总记录数
    private List<T> list;//结果集

    /**
     * 将MyBatis Plus 分页结果转化为通用结果
     */
    public static <T> CommonPage<T> restPage(Page<T> pageResult) {
        CommonPage<T> result = new CommonPage<>();
        result.setPageNum(Convert.toInt(pageResult.getCurrent()));
        result.setPageSize(Convert.toInt(pageResult.getSize()));
        result.setTotal(pageResult.getTotal());
        result.setTotalPage(Convert.toInt(pageResult.getTotal()/pageResult.getSize()+1));
        result.setList(pageResult.getRecords());
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}