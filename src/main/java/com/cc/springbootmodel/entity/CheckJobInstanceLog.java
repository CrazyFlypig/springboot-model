package com.cc.springbootmodel.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "check_job_instance_log")
public class CheckJobInstanceLog {
    /**
     * 作业示例id 作业示例id
     */
    @Id
    @Column(name = "instance_id")
    private String instanceId;

    /**
     * 作业id 作业id
     */
    @Column(name = "job_id")
    private String jobId;

    /**
     * 核查id 核查id
     */
    @Column(name = "check_id")
    private String checkId;

    /**
     * 结果条数 结果条数
     */
    @Column(name = "result_num")
    private Integer resultNum;

    /**
     * 核查开始时间 核查开始时间
     */
    @Column(name = "query_start_time")
    private Date queryStartTime;

    /**
     * 核查结束时间 核查结束时间
     */
    @Column(name = "query_end_time")
    private Date queryEndTime;

    /**
     * 结果状态 核查结果状态
     */
    @Column(name = "result_status")
    private Integer resultStatus;

    /**
     * 备注 备注信息
     */
    private String remark;

    /**
     * 获取作业示例id 作业示例id
     *
     * @return instance_id - 作业示例id 作业示例id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 设置作业示例id 作业示例id
     *
     * @param instanceId 作业示例id 作业示例id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }

    /**
     * 获取作业id 作业id
     *
     * @return job_id - 作业id 作业id
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 设置作业id 作业id
     *
     * @param jobId 作业id 作业id
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * 获取核查id 核查id
     *
     * @return check_id - 核查id 核查id
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置核查id 核查id
     *
     * @param checkId 核查id 核查id
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    /**
     * 获取结果条数 结果条数
     *
     * @return result_num - 结果条数 结果条数
     */
    public Integer getResultNum() {
        return resultNum;
    }

    /**
     * 设置结果条数 结果条数
     *
     * @param resultNum 结果条数 结果条数
     */
    public void setResultNum(Integer resultNum) {
        this.resultNum = resultNum;
    }

    /**
     * 获取核查开始时间 核查开始时间
     *
     * @return query_start_time - 核查开始时间 核查开始时间
     */
    public Date getQueryStartTime() {
        return queryStartTime;
    }

    /**
     * 设置核查开始时间 核查开始时间
     *
     * @param queryStartTime 核查开始时间 核查开始时间
     */
    public void setQueryStartTime(Date queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    /**
     * 获取核查结束时间 核查结束时间
     *
     * @return query_end_time - 核查结束时间 核查结束时间
     */
    public Date getQueryEndTime() {
        return queryEndTime;
    }

    /**
     * 设置核查结束时间 核查结束时间
     *
     * @param queryEndTime 核查结束时间 核查结束时间
     */
    public void setQueryEndTime(Date queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    /**
     * 获取结果状态 核查结果状态
     *
     * @return result_status - 结果状态 核查结果状态
     */
    public Integer getResultStatus() {
        return resultStatus;
    }

    /**
     * 设置结果状态 核查结果状态
     *
     * @param resultStatus 结果状态 核查结果状态
     */
    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    /**
     * 获取备注 备注信息
     *
     * @return remark - 备注 备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注 备注信息
     *
     * @param remark 备注 备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}