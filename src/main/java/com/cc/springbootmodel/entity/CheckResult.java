package com.cc.springbootmodel.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "check_result")
public class CheckResult {
    private String id;

    /**
     * 核查id
     */
    @Column(name = "check_id")
    private String checkId;

    /**
     * 节点id
     */
    @Column(name = "node_id")
    private String nodeId;

    /**
     * 节点类型
     */
    @Column(name = "node_type")
    private String nodeType;

    /**
     * 资源id
     */
    @Column(name = "resource_id")
    private String resourceId;

    /**
     * 数据源id
     */
    @Column(name = "datasource_id")
    private String datasourceId;

    /**
     * 表名或自定义SQL
     */
    @Column(name = "table_sql")
    private String tableSql;

    /**
     * 增量字段
     */
    @Column(name = "update_column")
    private String updateColumn;

    /**
     * 结果值
     */
    @Column(name = "result_num")
    private Long resultNum;

    /**
     * 查询开始时间
     */
    @Column(name = "query_start_time")
    private Date queryStartTime;

    /**
     * 查询结束时间
     */
    @Column(name = "query_end_time")
    private Date queryEndTime;

    /**
     * 核查SQL
     */
    @Column(name = "count_sql")
    private String countSql;

    /**
     * 核查开始时间
     */
    @Column(name = "check_begin_time")
    private Date checkBeginTime;

    /**
     * 核查完成时间
     */
    @Column(name = "check_finish_time")
    private Date checkFinishTime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取核查id
     *
     * @return check_id - 核查id
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置核查id
     *
     * @param checkId 核查id
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    /**
     * 获取节点id
     *
     * @return node_id - 节点id
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 设置节点id
     *
     * @param nodeId 节点id
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    /**
     * 获取节点类型
     *
     * @return node_type - 节点类型
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * 设置节点类型
     *
     * @param nodeType 节点类型
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    /**
     * 获取资源id
     *
     * @return resource_id - 资源id
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源id
     *
     * @param resourceId 资源id
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * 获取数据源id
     *
     * @return datasource_id - 数据源id
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    /**
     * 设置数据源id
     *
     * @param datasourceId 数据源id
     */
    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId == null ? null : datasourceId.trim();
    }

    /**
     * 获取表名或自定义SQL
     *
     * @return table_sql - 表名或自定义SQL
     */
    public String getTableSql() {
        return tableSql;
    }

    /**
     * 设置表名或自定义SQL
     *
     * @param tableSql 表名或自定义SQL
     */
    public void setTableSql(String tableSql) {
        this.tableSql = tableSql == null ? null : tableSql.trim();
    }

    /**
     * 获取增量字段
     *
     * @return update_column - 增量字段
     */
    public String getUpdateColumn() {
        return updateColumn;
    }

    /**
     * 设置增量字段
     *
     * @param updateColumn 增量字段
     */
    public void setUpdateColumn(String updateColumn) {
        this.updateColumn = updateColumn == null ? null : updateColumn.trim();
    }

    /**
     * 获取结果值
     *
     * @return result_num - 结果值
     */
    public Long getResultNum() {
        return resultNum;
    }

    /**
     * 设置结果值
     *
     * @param resultNum 结果值
     */
    public void setResultNum(Long resultNum) {
        this.resultNum = resultNum;
    }

    /**
     * 获取查询开始时间
     *
     * @return query_start_time - 查询开始时间
     */
    public Date getQueryStartTime() {
        return queryStartTime;
    }

    /**
     * 设置查询开始时间
     *
     * @param queryStartTime 查询开始时间
     */
    public void setQueryStartTime(Date queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    /**
     * 获取查询结束时间
     *
     * @return query_end_time - 查询结束时间
     */
    public Date getQueryEndTime() {
        return queryEndTime;
    }

    /**
     * 设置查询结束时间
     *
     * @param queryEndTime 查询结束时间
     */
    public void setQueryEndTime(Date queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    /**
     * 获取核查SQL
     *
     * @return count_sql - 核查SQL
     */
    public String getCountSql() {
        return countSql;
    }

    /**
     * 设置核查SQL
     *
     * @param countSql 核查SQL
     */
    public void setCountSql(String countSql) {
        this.countSql = countSql == null ? null : countSql.trim();
    }

    /**
     * 获取核查开始时间
     *
     * @return check_begin_time - 核查开始时间
     */
    public Date getCheckBeginTime() {
        return checkBeginTime;
    }

    /**
     * 设置核查开始时间
     *
     * @param checkBeginTime 核查开始时间
     */
    public void setCheckBeginTime(Date checkBeginTime) {
        this.checkBeginTime = checkBeginTime;
    }

    /**
     * 获取核查完成时间
     *
     * @return check_finish_time - 核查完成时间
     */
    public Date getCheckFinishTime() {
        return checkFinishTime;
    }

    /**
     * 设置核查完成时间
     *
     * @param checkFinishTime 核查完成时间
     */
    public void setCheckFinishTime(Date checkFinishTime) {
        this.checkFinishTime = checkFinishTime;
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