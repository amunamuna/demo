package com.nadou.demo.mapper;

import com.nadou.demo.model.OcCaseInfo;

public interface OcCaseInfoMapper {
    int deleteByPrimaryKey(String caseId);

    int insert(OcCaseInfo record);

    int insertSelective(OcCaseInfo record);

    OcCaseInfo selectByPrimaryKey(String caseId);

    int updateByPrimaryKeySelective(OcCaseInfo record);

    int updateByPrimaryKey(OcCaseInfo record);
}