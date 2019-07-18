package com.cc.springbootmodel.service.impl;

import com.cc.springbootmodel.core.universal.AbstractService;
import com.cc.springbootmodel.dao.NodeInfoMapper;
import com.cc.springbootmodel.entity.NodeInfo;
import com.cc.springbootmodel.service.NodeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: NodeInfoService接口实现类
* @author cc
* @date 2019/07/18 10:43
*/
@Service
public class NodeInfoServiceImpl extends AbstractService<NodeInfo> implements NodeInfoService {

    @Resource
    private NodeInfoMapper nodeInfoMapper;

}