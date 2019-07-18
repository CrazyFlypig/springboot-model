package com.cc.springbootmodel.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "node_info")
public class NodeInfo {
    /**
     * 核查id 核查id，外键
     */
    @Column(name = "check_id")
    private String checkId;

    /**
     * 节点id 节点id，主键
     */
    @Id
    @Column(name = "node_id")
    private String nodeId;

    /**
     * 节点类型 节点类型，包括database,s3
     */
    @Column(name = "node_type")
    private String nodeType;

    /**
     * 资源ID 资源ID
     */
    @Column(name = "resource_id")
    private String resourceId;

    /**
     * 数据源id 数据源ID
     */
    @Column(name = "datasource_id")
    private String datasourceId;

    /**
     * 数据表类型 数据表类型，包括：hive，spark，Oracle，mysql
     */
    @Column(name = "table_type")
    private String tableType;

    /**
     * 表名或自定义SQL 表名或自定义SQL
     */
    private String tables;

    /**
     * 增量字段 增量字段
     */
    @Column(name = "update_column")
    private String updateColumn;

    /**
     * 获取核查id 核查id，外键
     *
     * @return check_id - 核查id 核查id，外键
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置核查id 核查id，外键
     *
     * @param checkId 核查id 核查id，外键
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    /**
     * 获取节点id 节点id，主键
     *
     * @return node_id - 节点id 节点id，主键
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 设置节点id 节点id，主键
     *
     * @param nodeId 节点id 节点id，主键
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    /**
     * 获取节点类型 节点类型，包括database,s3
     *
     * @return node_type - 节点类型 节点类型，包括database,s3
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * 设置节点类型 节点类型，包括database,s3
     *
     * @param nodeType 节点类型 节点类型，包括database,s3
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    /**
     * 获取资源ID 资源ID
     *
     * @return resource_id - 资源ID 资源ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源ID 资源ID
     *
     * @param resourceId 资源ID 资源ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * 获取数据源id 数据源ID
     *
     * @return datasource_id - 数据源id 数据源ID
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    /**
     * 设置数据源id 数据源ID
     *
     * @param datasourceId 数据源id 数据源ID
     */
    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId == null ? null : datasourceId.trim();
    }

    /**
     * 获取数据表类型 数据表类型，包括：hive，spark，Oracle，mysql
     *
     * @return table_type - 数据表类型 数据表类型，包括：hive，spark，Oracle，mysql
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * 设置数据表类型 数据表类型，包括：hive，spark，Oracle，mysql
     *
     * @param tableType 数据表类型 数据表类型，包括：hive，spark，Oracle，mysql
     */
    public void setTableType(String tableType) {
        this.tableType = tableType == null ? null : tableType.trim();
    }

    /**
     * 获取表名或自定义SQL 表名或自定义SQL
     *
     * @return tables - 表名或自定义SQL 表名或自定义SQL
     */
    public String getTables() {
        return tables;
    }

    /**
     * 设置表名或自定义SQL 表名或自定义SQL
     *
     * @param tables 表名或自定义SQL 表名或自定义SQL
     */
    public void setTables(String tables) {
        this.tables = tables == null ? null : tables.trim();
    }

    /**
     * 获取增量字段 增量字段
     *
     * @return update_column - 增量字段 增量字段
     */
    public String getUpdateColumn() {
        return updateColumn;
    }

    /**
     * 设置增量字段 增量字段
     *
     * @param updateColumn 增量字段 增量字段
     */
    public void setUpdateColumn(String updateColumn) {
        this.updateColumn = updateColumn == null ? null : updateColumn.trim();
    }
}