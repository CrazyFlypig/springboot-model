package com.cc.springbootmodel.entity.response;

public class DataList {

    private String resourceName;
    private String orgType;
    private String updateCycle;
    private int dataRecords;
    private int dataDayCycle;
    private double dataSize;

    public String getResourceName() {
        return resourceName;
    }

    public String getOrgType() {
        return orgType;
    }

    public String getUpdateCycle() {
        return updateCycle;
    }

    public int getDataRecords() {
        return dataRecords;
    }

    public int getDataDayCycle() {
        return dataDayCycle;
    }

    public double getDataSize() {
        return dataSize;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle;
    }

    public void setDataRecords(int dataRecords) {
        this.dataRecords = dataRecords;
    }

    public void setDataDayCycle(int dataDayCycle) {
        this.dataDayCycle = dataDayCycle;
    }

    public void setDataSize(double dataSize) {
        this.dataSize = dataSize;
    }
}
