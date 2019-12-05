package com.cc.springbootmodel.entity.response;

public class CountData {
    private int resourceNumAll = 0;
    private int resourceNumOrg = 0;
    private int resourceNumUnOrg = 0;
    private String resourceNumUnit = "种";
    private int dataCountAll = 0;
    private int dataCountOrg = 0;
    private int dataCountUnOrg = 0;
    private String dataCountUnit = "万条";
    private int dataSizeAll = 0;
    private int dataSizeOrg = 0;
    private int dataSizeUnOrg = 0;
    private String dataSizeUnit = "GB";
    private int speedAll = 0;
    private int speedOrg = 0;
    private int speedUnOrg = 0;
    private String speedUnit = "万条/天";

    public void setResourceNumAll(int resourceNumAll) {
        this.resourceNumAll = resourceNumAll;
    }

    public void setResourceNumOrg(int resourceNumOrg) {
        this.resourceNumOrg = resourceNumOrg;
    }

    public void setResourceNumUnOrg(int resourceNumUnOrg) {
        this.resourceNumUnOrg = resourceNumUnOrg;
    }

    public void setResourceNumUnit(String resourceNumUnit) {
        this.resourceNumUnit = resourceNumUnit;
    }

    public void setDataCountAll(int dataCountAll) {
        this.dataCountAll = dataCountAll;
    }

    public void setDataCountOrg(int dataCountOrg) {
        this.dataCountOrg = dataCountOrg;
    }

    public void setDataCountUnOrg(int dataCountUnOrg) {
        this.dataCountUnOrg = dataCountUnOrg;
    }

    public void setDataCountUnit(String dataCountUnit) {
        this.dataCountUnit = dataCountUnit;
    }

    public void setDataSizeAll(int dataSizeAll) {
        this.dataSizeAll = dataSizeAll;
    }

    public void setDataSizeOrg(int dataSizeOrg) {
        this.dataSizeOrg = dataSizeOrg;
    }

    public void setDataSizeUnOrg(int dataSizeUnOrg) {
        this.dataSizeUnOrg = dataSizeUnOrg;
    }

    public void setDataSizeUnit(String dataSizeUnit) {
        this.dataSizeUnit = dataSizeUnit;
    }

    public void setSpeedAll(int speedAll) {
        this.speedAll = speedAll;
    }

    public void setSpeedOrg(int speedOrg) {
        this.speedOrg = speedOrg;
    }

    public void setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
    }

    public void setSpeedUnOrg(int speedUnOrg) {
        this.speedUnOrg = speedUnOrg;
    }

    public String getData() {
        String data = "[{\n" +
                "  children: [\n" +
                "    { title: \"资源数量\", value: " + resourceNumAll + ", unit: '" + resourceNumUnit + "' },\n" +
                "    { title: \"总记录数\", value: " + dataCountAll + ", unit: '" + dataCountUnit + "' },\n" +
                "    { title: \"存储规模\", value: " + dataSizeAll + ", unit: '" + dataSizeUnit + "' },\n" +
                "    { title: \"数据增速\", value: " + speedAll + ", unit: '" + speedUnit + "' },\n" +
                "  ]\n" +
                "}, {\n" +
                "  title: \"结构化数据\", children: [\n" +
                "    { title: \"资源数量\", value: " + resourceNumOrg + ", unit: '" + resourceNumUnit + "' },\n" +
                "    { title: \"总记录数\", value: " + dataCountOrg + ", unit: '"+ dataCountUnit +"' },\n" +
                "    { title: \"存储规模\", value: " + dataSizeOrg + ", unit: '" + dataSizeUnit + "' },\n" +
                "    { title: \"数据增速\", value: " + speedOrg + ", unit: '" + speedUnit + "' },\n" +
                "  ]\n" +
                "}, {\n" +
                "  title: \"非结构化数据\", children: [\n" +
                "    { title: \"资源数量\", value: " + resourceNumUnOrg + ", unit: '" + resourceNumUnit + "' },\n" +
                "    { title: \"总记录数\", value: " + dataCountUnOrg + ", unit: '"+ dataCountUnit +"' },\n" +
                "    { title: \"存储规模\", value: " + dataSizeUnOrg + ", unit: '" + dataSizeUnit + "' },\n" +
                "    { title: \"数据增速\", value: " + speedUnOrg + ", unit: '" + speedUnit + "' },\n" +
                "  ]\n" +
                "}]";
        return data;
    }
}