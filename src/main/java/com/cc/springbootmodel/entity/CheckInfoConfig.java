package com.cc.springbootmodel.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "check_info_config")
public class CheckInfoConfig {
    /**
     * id 主键
     */
    @Id
    private String id;

    /**
     * 核查说明 核查说明
     */
    @Column(name = "explain_remark")
    private String explainRemark;

    /**
     * 核查方式 核查方式：1是增量核查；2是全量核查
     */
    @Column(name = "check_method")
    private Integer checkMethod;

    /**
     * 核查频率 核查频率，CRON字符串
     */
    @Column(name = "check_frequency")
    private String checkFrequency;

    /**
     * 开始时间 核查开始时间
     */
    @Column(name = "quary_start_time")
    private Date quaryStartTime;

    /**
     * 结束时间 核查结束时间
     */
    @Column(name = "quary_end_time")
    private Date quaryEndTime;

    /**
     * 结果库表 结果库表
     */
    @Column(name = "result_table")
    private String resultTable;

    /**
     * 状态 核查状态，包括：1，待核查；2，核查中；3，异常配置；4，弃用
     */
    @Column(name = "check_statute")
    private Integer checkStatute;

    /**
     * 备注 备注：异常信息，额外备注
     */
    private String remarks;

    /**
     * 获取id 主键
     *
     * @return id - id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id 主键
     *
     * @param id id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取核查说明 核查说明
     *
     * @return explain_remark - 核查说明 核查说明
     */
    public String getExplainRemark() {
        return explainRemark;
    }

    /**
     * 设置核查说明 核查说明
     *
     * @param explainRemark 核查说明 核查说明
     */
    public void setExplainRemark(String explainRemark) {
        this.explainRemark = explainRemark == null ? null : explainRemark.trim();
    }

    /**
     * 获取核查方式 核查方式：1是增量核查；2是全量核查
     *
     * @return check_method - 核查方式 核查方式：1是增量核查；2是全量核查
     */
    public Integer getCheckMethod() {
        return checkMethod;
    }

    /**
     * 设置核查方式 核查方式：1是增量核查；2是全量核查
     *
     * @param checkMethod 核查方式 核查方式：1是增量核查；2是全量核查
     */
    public void setCheckMethod(Integer checkMethod) {
        this.checkMethod = checkMethod;
    }

    /**
     * 获取核查频率 核查频率，CRON字符串
     *
     * @return check_frequency - 核查频率 核查频率，CRON字符串
     */
    public String getCheckFrequency() {
        return checkFrequency;
    }

    /**
     * 设置核查频率 核查频率，CRON字符串
     *
     * @param checkFrequency 核查频率 核查频率，CRON字符串
     */
    public void setCheckFrequency(String checkFrequency) {
        this.checkFrequency = checkFrequency == null ? null : checkFrequency.trim();
    }

    /**
     * 获取开始时间 核查开始时间
     *
     * @return quary_start_time - 开始时间 核查开始时间
     */
    public Date getQuaryStartTime() {
        return quaryStartTime;
    }

    /**
     * 设置开始时间 核查开始时间
     *
     * @param quaryStartTime 开始时间 核查开始时间
     */
    public void setQuaryStartTime(Date quaryStartTime) {
        this.quaryStartTime = quaryStartTime;
    }

    /**
     * 获取结束时间 核查结束时间
     *
     * @return quary_end_time - 结束时间 核查结束时间
     */
    public Date getQuaryEndTime() {
        return quaryEndTime;
    }

    /**
     * 设置结束时间 核查结束时间
     *
     * @param quaryEndTime 结束时间 核查结束时间
     */
    public void setQuaryEndTime(Date quaryEndTime) {
        this.quaryEndTime = quaryEndTime;
    }

    /**
     * 获取结果库表 结果库表
     *
     * @return result_table - 结果库表 结果库表
     */
    public String getResultTable() {
        return resultTable;
    }

    /**
     * 设置结果库表 结果库表
     *
     * @param resultTable 结果库表 结果库表
     */
    public void setResultTable(String resultTable) {
        this.resultTable = resultTable == null ? null : resultTable.trim();
    }

    /**
     * 获取状态 核查状态，包括：1，待核查；2，核查中；3，异常配置；4，弃用
     *
     * @return check_statute - 状态 核查状态，包括：1，待核查；2，核查中；3，异常配置；4，弃用
     */
    public Integer getCheckStatute() {
        return checkStatute;
    }

    /**
     * 设置状态 核查状态，包括：1，待核查；2，核查中；3，异常配置；4，弃用
     *
     * @param checkStatute 状态 核查状态，包括：1，待核查；2，核查中；3，异常配置；4，弃用
     */
    public void setCheckStatute(Integer checkStatute) {
        this.checkStatute = checkStatute;
    }

    /**
     * 获取备注 备注：异常信息，额外备注
     *
     * @return remarks - 备注 备注：异常信息，额外备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注 备注：异常信息，额外备注
     *
     * @param remarks 备注 备注：异常信息，额外备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}