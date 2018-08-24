package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.api.common.ResultJson;
import com.dreamtale.instant.message.api.entity.ck.json.CkOrderListJson;
import com.dreamtale.instant.message.api.entity.ck.json.CkUserListJson;
import com.dreamtale.instant.message.api.entity.ck.param.*;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkDistrict;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkProduct;
import com.dreamtale.instant.message.api.entity.common.PageResult;
import com.dreamtale.instant.message.web.service.CKService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 仓库业务
 * @author  dream
 */
@RestController
@RequestMapping("/admin/ck")
@Produces(MediaType.APPLICATION_JSON)
public class CKResource {

    @Autowired
    CKService ckService;

    @GetMapping("/order/queryOrderList")
    public PageResult<CkOrderListJson> queryOrderList(CkOrderListQueryParam ckOrderListQueryParam) {
        PageInfo<CkOrderListJson> pageInfo = ckService.queryOrderList(ckOrderListQueryParam);
        PageResult<CkOrderListJson> pageResult = new PageResult<>();
        if(pageInfo!=null){
            pageResult.setPage(new Long(pageInfo.getPages()));
            pageResult.setTotal(pageInfo.getTotal());
            pageResult.setRows(pageInfo.getList());
        }
        return pageResult;
    }

    @GetMapping("/product/queryProductList")
    public PageResult<CkProduct> queryProductList(CkProductListQueryParam ckProductListQueryParam) {
        PageInfo<CkProduct> pageInfo = ckService.queryProductList(ckProductListQueryParam);
        PageResult<CkProduct> pageResult = new PageResult<>();
        if(pageInfo!=null){
            pageResult.setPage(new Long(pageInfo.getPages()));
            pageResult.setTotal(pageInfo.getTotal());
            pageResult.setRows(pageInfo.getList());
        }
        return pageResult;
    }

    @GetMapping("/district/queryDistrictList")
    public PageResult<CkDistrict> queryDistrictList(CkDistrictListQueryParam ckDistrictListQueryParam) {
        PageInfo<CkDistrict> pageInfo = ckService.queryDistrictList(ckDistrictListQueryParam);
        PageResult<CkDistrict> pageResult = new PageResult<>();
        if(pageInfo!=null){
            pageResult.setPage(new Long(pageInfo.getPages()));
            pageResult.setTotal(pageInfo.getTotal());
            pageResult.setRows(pageInfo.getList());
        }
        return pageResult;
    }

    @GetMapping("/user/queryUserList")
    public PageResult<CkUserListJson> queryUserList(CkUserListQueryParam ckUserListQueryParam) {
        PageInfo<CkUserListJson> pageInfo = ckService.queryUserList(ckUserListQueryParam);
        PageResult<CkUserListJson> pageResult = new PageResult<>();
        if(pageInfo!=null){
            pageResult.setPage(new Long(pageInfo.getPages()));
            pageResult.setTotal(pageInfo.getTotal());
            pageResult.setRows(pageInfo.getList());
        }
        return pageResult;
    }

    @PostMapping("/district/add")
    public ResultJson<Boolean> addDistrict(String name){
        ResultJson resultJson = new ResultJson();
        if(StringUtils.isNotBlank(name)){
            resultJson.setData(ckService.addDistrict(name));
        } else {
            resultJson.setData(false);
        }
        return resultJson;
    }

    @PostMapping("/user/add")
    public ResultJson<Boolean> addUser(CkUserInsertParam ckUserInsertParam) {
        ResultJson resultJson = new ResultJson();
        try {
            resultJson.setData(ckService.addUser(ckUserInsertParam));
        } catch (Exception e){
            resultJson.setData(false);
        }
        return resultJson;
    }

    @PostMapping("/product/add")
    public ResultJson<Boolean> addProduct(CkProduct ckProduct) {
        ResultJson resultJson = new ResultJson();
        try {
            resultJson.setData(ckService.addProduct(ckProduct));
        } catch (Exception e){
            resultJson.setData(false);
        }
        return resultJson;
    }

}
