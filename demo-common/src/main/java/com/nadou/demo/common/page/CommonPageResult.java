package com.nadou.demo.common.page;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @ClassName CommonPageResult
 * @Description 分页数据封装类
 * @Author amunamuna
 * @Date 2020/5/11 15:51
 * @Version 1.0
 **/
@Data
public class CommonPageResult<T> {
    //当前页
    private Integer pageNum;
    //每页的数量
    private Integer pageSize;
    //总页数
    private Integer totalPage;
    //总记录数
    private Long total;
    //结果集
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPageResult<T> restPage(List<T> list) {
        CommonPageResult<T> result = new CommonPageResult<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
    public static <T> CommonPageResult<T> restPage(Page<T> pageInfo) {
        CommonPageResult<T> result = new CommonPageResult<T>();
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageNum(pageInfo.getNumber());
        result.setPageSize(pageInfo.getSize());
        result.setTotal(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        return result;
    }
}
