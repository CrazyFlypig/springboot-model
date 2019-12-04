package com.cc.springbootmodel.entity;

import javax.persistence.*;

@Table(name = "data_dir")
public class DataDir {
    @Id
    private String id;

    /**
     * 资源名称
     */
    @Column(name = "resource_name")
    private String resourceName;

    /**
     * 要素一级分类
     */
    @Column(name = "key_first")
    private String keyFirst;

    /**
     * 要素二级分类
     */
    @Column(name = "key_second")
    private String keySecond;

    /**
     * 要素细目分类
     */
    @Column(name = "key_class")
    private String keyClass;

    /**
     * 属性分类
     */
    @Column(name = "attr_class")
    private String attrClass;

    /**
     * 结构化类型
     */
    @Column(name = "org_type")
    private String orgType;

    /**
     * 数据记录数
     */
    @Column(name = "data_records")
    private Integer dataRecords;

    /**
     * 数据存储量
     */
    @Column(name = "data_size")
    private Double dataSize;

    /**
     * 更新周期
     */
    @Column(name = "update_cycle")
    private String updateCycle;

    /**
     * 每天增量记录数
     */
    @Column(name = "data_day_increase_num")
    private Integer dataDayIncreaseNum;

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
     * 获取资源名称
     *
     * @return resource_name - 资源名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置资源名称
     *
     * @param resourceName 资源名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * 获取要素一级分类
     *
     * @return key_first - 要素一级分类
     */
    public String getKeyFirst() {
        return keyFirst;
    }

    /**
     * 设置要素一级分类
     *
     * @param keyFirst 要素一级分类
     */
    public void setKeyFirst(String keyFirst) {
        this.keyFirst = keyFirst == null ? null : keyFirst.trim();
    }

    /**
     * 获取要素二级分类
     *
     * @return key_second - 要素二级分类
     */
    public String getKeySecond() {
        return keySecond;
    }

    /**
     * 设置要素二级分类
     *
     * @param keySecond 要素二级分类
     */
    public void setKeySecond(String keySecond) {
        this.keySecond = keySecond == null ? null : keySecond.trim();
    }

    /**
     * 获取要素细目分类
     *
     * @return key_class - 要素细目分类
     */
    public String getKeyClass() {
        return keyClass;
    }

    /**
     * 设置要素细目分类
     *
     * @param keyClass 要素细目分类
     */
    public void setKeyClass(String keyClass) {
        this.keyClass = keyClass == null ? null : keyClass.trim();
    }

    /**
     * 获取属性分类
     *
     * @return attr_class - 属性分类
     */
    public String getAttrClass() {
        return attrClass;
    }

    /**
     * 设置属性分类
     *
     * @param attrClass 属性分类
     */
    public void setAttrClass(String attrClass) {
        this.attrClass = attrClass == null ? null : attrClass.trim();
    }

    /**
     * 获取结构化类型
     *
     * @return org_type - 结构化类型
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 设置结构化类型
     *
     * @param orgType 结构化类型
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * 获取数据记录数
     *
     * @return data_records - 数据记录数
     */
    public Integer getDataRecords() {
        return dataRecords;
    }

    /**
     * 设置数据记录数
     *
     * @param dataRecords 数据记录数
     */
    public void setDataRecords(Integer dataRecords) {
        this.dataRecords = dataRecords;
    }

    /**
     * 获取数据存储量
     *
     * @return data_size - 数据存储量
     */
    public Double getDataSize() {
        return dataSize;
    }

    /**
     * 设置数据存储量
     *
     * @param dataSize 数据存储量
     */
    public void setDataSize(Double dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * 获取更新周期
     *
     * @return update_cycle - 更新周期
     */
    public String getUpdateCycle() {
        return updateCycle;
    }

    /**
     * 设置更新周期
     *
     * @param updateCycle 更新周期
     */
    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle == null ? null : updateCycle.trim();
    }

    /**
     * 获取每天增量记录数
     *
     * @return data_day_increase_num - 每天增量记录数
     */
    public Integer getDataDayIncreaseNum() {
        return dataDayIncreaseNum;
    }

    /**
     * 设置每天增量记录数
     *
     * @param dataDayIncreaseNum 每天增量记录数
     */
    public void setDataDayIncreaseNum(Integer dataDayIncreaseNum) {
        this.dataDayIncreaseNum = dataDayIncreaseNum;
    }
}