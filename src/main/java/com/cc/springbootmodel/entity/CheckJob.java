package com.cc.springbootmodel.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "check_job")
public class CheckJob {
    /**
     * 作业id 作业id
     */
    @Id
    @Column(name = "job_id")
    private String jobId;

    /**
     * 核查id 核查id
     */
    @Column(name = "check_id")
    private String checkId;

    /**
     * 下次执行时间 下次执行时间
     */
    @Column(name = "next_date")
    private Date nextDate;

    /**
     * 备注 备注信息
     */
    private String remark;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取下次执行时间 下次执行时间
     *
     * @return next_date - 下次执行时间 下次执行时间
     */
    public Date getNextDate() {
        return nextDate;
    }

    /**
     * 设置下次执行时间 下次执行时间
     *
     * @param nextDate 下次执行时间 下次执行时间
     */
    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
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

    /**
     * 获取更新时间 更新时间
     *
     * @return update_time - 更新时间 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间 更新时间
     *
     * @param updateTime 更新时间 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}