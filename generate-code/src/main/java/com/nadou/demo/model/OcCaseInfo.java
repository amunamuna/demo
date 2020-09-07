package com.nadou.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OcCaseInfo implements Serializable {
    @ApiModelProperty(value = "案件ID(委外催收系统自己加工，案件类型（前两位）+日期（年月日6位）+循环序列（九位）)")
    private String caseId;

    @ApiModelProperty(value = "客户号")
    private String custNum;

    @ApiModelProperty(value = "姓名")
    private String custName;

    @ApiModelProperty(value = "证件类型")
    private String crdtTp;

    @ApiModelProperty(value = "证件号码")
    private String cstCrdtNo;

    @ApiModelProperty(value = "催收级别(委外催收、电话催收、属地催收、司法催收、短信、IVR、AI电催、信函催收)")
    private String collLevel;

    @ApiModelProperty(value = "催收组代码")
    private String collGrp;

    @ApiModelProperty(value = "新催收组")
    private String collGrpNew;

    @ApiModelProperty(value = "本月任务类型(非核销、核销、资产证劵化、打包转让、M2大额、M3小额、M3+小额)")
    private String thmonTskTp;

    @ApiModelProperty(value = "当前委托机构")
    private String curEntrustAgency;

    @ApiModelProperty(value = "当前委托批次（派单批量之后更新，取放单日期8位数字年月日）")
    private String curEntrustBatch;

    @ApiModelProperty(value = "当前派单模式")
    private String curPatchMode;

    @ApiModelProperty(value = "派单跑批开始日期 yyyy-MM-dd")
    private Date batchStartDate;

    @ApiModelProperty(value = "委托期限(天数)")
    private Integer entrustPeriod;

    @ApiModelProperty(value = "放单跑批开始日期 yyyy-MM-dd")
    private Date releaseStartDate;

    @ApiModelProperty(value = "手别(M1、一手单、二手单、三手单、四手单、五手及以上)")
    private String changingHands;

    @ApiModelProperty(value = "推广渠道（城市）")
    private String bankAddress;

    @ApiModelProperty(value = "案件状态(查看数据字典)")
    private String caseStatus;

    @ApiModelProperty(value = "案件操作码")
    private String caseOpCode;

    @ApiModelProperty(value = "创建时间 yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间 yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "本息费合计")
    private BigDecimal baseintfee;

    @ApiModelProperty(value = "01：待派单 02：待重新派单 03：已派单 04 已放单")
    private String batchStatus;

    @ApiModelProperty(value = "上任委托机构")
    private String lastentrustagency;

    @ApiModelProperty(value = "扩展字段1")
    private String extenField1;

    @ApiModelProperty(value = "扩展字段2")
    private String extenField2;

    @ApiModelProperty(value = "扩展字段3")
    private String extenField3;

    @ApiModelProperty(value = "扩展字段4")
    private String extenField4;

    @ApiModelProperty(value = "扩展字段5")
    private String extenField5;

    private static final long serialVersionUID = 1L;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCrdtTp() {
        return crdtTp;
    }

    public void setCrdtTp(String crdtTp) {
        this.crdtTp = crdtTp;
    }

    public String getCstCrdtNo() {
        return cstCrdtNo;
    }

    public void setCstCrdtNo(String cstCrdtNo) {
        this.cstCrdtNo = cstCrdtNo;
    }

    public String getCollLevel() {
        return collLevel;
    }

    public void setCollLevel(String collLevel) {
        this.collLevel = collLevel;
    }

    public String getCollGrp() {
        return collGrp;
    }

    public void setCollGrp(String collGrp) {
        this.collGrp = collGrp;
    }

    public String getCollGrpNew() {
        return collGrpNew;
    }

    public void setCollGrpNew(String collGrpNew) {
        this.collGrpNew = collGrpNew;
    }

    public String getThmonTskTp() {
        return thmonTskTp;
    }

    public void setThmonTskTp(String thmonTskTp) {
        this.thmonTskTp = thmonTskTp;
    }

    public String getCurEntrustAgency() {
        return curEntrustAgency;
    }

    public void setCurEntrustAgency(String curEntrustAgency) {
        this.curEntrustAgency = curEntrustAgency;
    }

    public String getCurEntrustBatch() {
        return curEntrustBatch;
    }

    public void setCurEntrustBatch(String curEntrustBatch) {
        this.curEntrustBatch = curEntrustBatch;
    }

    public String getCurPatchMode() {
        return curPatchMode;
    }

    public void setCurPatchMode(String curPatchMode) {
        this.curPatchMode = curPatchMode;
    }

    public Date getBatchStartDate() {
        return batchStartDate;
    }

    public void setBatchStartDate(Date batchStartDate) {
        this.batchStartDate = batchStartDate;
    }

    public Integer getEntrustPeriod() {
        return entrustPeriod;
    }

    public void setEntrustPeriod(Integer entrustPeriod) {
        this.entrustPeriod = entrustPeriod;
    }

    public Date getReleaseStartDate() {
        return releaseStartDate;
    }

    public void setReleaseStartDate(Date releaseStartDate) {
        this.releaseStartDate = releaseStartDate;
    }

    public String getChangingHands() {
        return changingHands;
    }

    public void setChangingHands(String changingHands) {
        this.changingHands = changingHands;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getCaseOpCode() {
        return caseOpCode;
    }

    public void setCaseOpCode(String caseOpCode) {
        this.caseOpCode = caseOpCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getBaseintfee() {
        return baseintfee;
    }

    public void setBaseintfee(BigDecimal baseintfee) {
        this.baseintfee = baseintfee;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public String getLastentrustagency() {
        return lastentrustagency;
    }

    public void setLastentrustagency(String lastentrustagency) {
        this.lastentrustagency = lastentrustagency;
    }

    public String getExtenField1() {
        return extenField1;
    }

    public void setExtenField1(String extenField1) {
        this.extenField1 = extenField1;
    }

    public String getExtenField2() {
        return extenField2;
    }

    public void setExtenField2(String extenField2) {
        this.extenField2 = extenField2;
    }

    public String getExtenField3() {
        return extenField3;
    }

    public void setExtenField3(String extenField3) {
        this.extenField3 = extenField3;
    }

    public String getExtenField4() {
        return extenField4;
    }

    public void setExtenField4(String extenField4) {
        this.extenField4 = extenField4;
    }

    public String getExtenField5() {
        return extenField5;
    }

    public void setExtenField5(String extenField5) {
        this.extenField5 = extenField5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseId=").append(caseId);
        sb.append(", custNum=").append(custNum);
        sb.append(", custName=").append(custName);
        sb.append(", crdtTp=").append(crdtTp);
        sb.append(", cstCrdtNo=").append(cstCrdtNo);
        sb.append(", collLevel=").append(collLevel);
        sb.append(", collGrp=").append(collGrp);
        sb.append(", collGrpNew=").append(collGrpNew);
        sb.append(", thmonTskTp=").append(thmonTskTp);
        sb.append(", curEntrustAgency=").append(curEntrustAgency);
        sb.append(", curEntrustBatch=").append(curEntrustBatch);
        sb.append(", curPatchMode=").append(curPatchMode);
        sb.append(", batchStartDate=").append(batchStartDate);
        sb.append(", entrustPeriod=").append(entrustPeriod);
        sb.append(", releaseStartDate=").append(releaseStartDate);
        sb.append(", changingHands=").append(changingHands);
        sb.append(", bankAddress=").append(bankAddress);
        sb.append(", caseStatus=").append(caseStatus);
        sb.append(", caseOpCode=").append(caseOpCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", baseintfee=").append(baseintfee);
        sb.append(", batchStatus=").append(batchStatus);
        sb.append(", lastentrustagency=").append(lastentrustagency);
        sb.append(", extenField1=").append(extenField1);
        sb.append(", extenField2=").append(extenField2);
        sb.append(", extenField3=").append(extenField3);
        sb.append(", extenField4=").append(extenField4);
        sb.append(", extenField5=").append(extenField5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}