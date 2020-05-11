package com.example.demo.mapper;

import com.example.demo.model.OcCaseInfo;

public interface OcCaseInfoMapper {
    int deleteByPrimaryKey(String caseId);

    int insert(OcCaseInfo record);

    int insertSelective(OcCaseInfo record);

    OcCaseInfo selectByPrimaryKey(String caseId);

    int updateByPrimaryKeySelective(OcCaseInfo record);

    int updateByPrimaryKey(OcCaseInfo record);
}