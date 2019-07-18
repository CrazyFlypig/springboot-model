package com.cc.springbootmodel.controller;

import com.cc.springbootmodel.core.ret.RetResponse;
import com.cc.springbootmodel.core.ret.RetResult;
import com.cc.springbootmodel.core.utils.ApplicationUtils;
import com.cc.springbootmodel.entity.NodeInfo;
import com.cc.springbootmodel.service.NodeInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: NodeInfoController类
* @author cc
* @date 2019/07/18 10:43
*/
@RestController
@RequestMapping("/nodeInfo")
@Api(tags = {"节点信息表操作接口"}, description = "NodeInfoController")
public class NodeInfoController {

    @Resource
    private NodeInfoService nodeInfoService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(NodeInfo nodeInfo) throws Exception{
        nodeInfo.setNodeId(ApplicationUtils.getUUID());
        Integer state = nodeInfoService.insert(nodeInfo);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = nodeInfoService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(NodeInfo nodeInfo) throws Exception {
        Integer state = nodeInfoService.update(nodeInfo);
        return RetResponse.makeOKRsp(state);
    }

    @GetMapping("/selectById")
    public RetResult<NodeInfo> selectById(@RequestParam String id) throws Exception {
        NodeInfo nodeInfo = nodeInfoService.selectById(id);
        return RetResponse.makeOKRsp(nodeInfo);
    }

    /**
    * @Description: 分页查询
    * @param pageNum 页码
    * @param pageSize 每页条数
    * @Reutrn RetResult<PageInfo<NodeInfo>>
    */
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "Integer", paramType = "query"),
        @ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/list")
    public RetResult<PageInfo<NodeInfo>> list(@RequestParam(defaultValue="0") Integer pageNum,@RequestParam(defaultValue ="0") Integer pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<NodeInfo> list = nodeInfoService.selectAll();
        PageInfo<NodeInfo> pageInfo = new PageInfo<NodeInfo>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}