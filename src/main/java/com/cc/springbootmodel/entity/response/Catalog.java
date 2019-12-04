package com.cc.springbootmodel.entity.response;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    // 数据目录唯一id
    private String catalogId;
    // 数据目录名称
    private String catalogName;
    // 数据目录层级
    private int catalogLevel;
    // 分组code
    private String catalogType;
    // 该目录下资源数数量
    private int resourceCount;
    // 父级目录id
    private String parentCatalogId;
    // 数据目录路径
    private String catalogPath;
    // 数据目录路径名称
    private String catalogPathName;
    // 子目录
    private List<Catalog> children;

    public Catalog(String catalogId, String catalogName, int catalogLevel, String catalogType, int resourceCount, String parentCatalogId, String catalogPath,
                   String catalogPathName){
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.catalogLevel = catalogLevel;
        this.catalogType = catalogType;
        this.resourceCount = resourceCount;
        this.parentCatalogId = parentCatalogId;
        this.catalogPath = catalogPath;
        this.catalogPathName = catalogPathName;
        children = new ArrayList<>();
    }

    public String getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public int getCatalogLevel() {
        return catalogLevel;
    }

    public String getCatalogType() {
        return catalogType;
    }

    public int getResourceCount() {
        return resourceCount;
    }

    public String getParentCatalogId() {
        return parentCatalogId;
    }

    public String getCatalogPath() {
        return catalogPath;
    }

    public String getCatalogPathName() {
        return catalogPathName;
    }

    public List<Catalog> getChildren() {
        return children;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setCatalogLevel(int catalogLevel) {
        this.catalogLevel = catalogLevel;
    }

    public void setCatalogType(String catalogType) {
        this.catalogType = catalogType;
    }

    public void setResourceCount(int resourceCount) {
        this.resourceCount = resourceCount;
    }

    public void setParentCatalogId(String parentCatalogId) {
        this.parentCatalogId = parentCatalogId;
    }

    public void setCatalogPath(String catalogPath) {
        this.catalogPath = catalogPath;
    }

    public void setCatalogPathName(String catalogPathName) {
        this.catalogPathName = catalogPathName;
    }

    public void setChildren(List<Catalog> children) {
        this.children = children;
    }
}
