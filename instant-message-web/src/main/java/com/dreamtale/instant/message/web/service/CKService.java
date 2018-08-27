package com.dreamtale.instant.message.web.service;

import com.alibaba.fastjson.JSONArray;
import com.dreamtale.instant.message.api.entity.ck.json.CkOrderListJson;
import com.dreamtale.instant.message.api.entity.ck.json.CkUserListJson;
import com.dreamtale.instant.message.api.entity.ck.param.*;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkDistrict;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkProduct;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkUser;
import com.dreamtale.instant.message.api.mapper.ck.CkDistrictMapper;
import com.dreamtale.instant.message.api.mapper.ck.CkOrderMapper;
import com.dreamtale.instant.message.api.mapper.ck.CkProductMapper;
import com.dreamtale.instant.message.api.mapper.ck.CkUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 仓库业务处理
 * @author  dream
 */
@Service
public class CKService {

    @Autowired
    CkDistrictMapper ckDistrictMapper;

    @Autowired
    CkUserMapper ckUserMapper;

    @Autowired
    CkProductMapper ckProductMapper;

    @Autowired
    CkOrderMapper ckOrderMapper;

    public PageInfo<CkOrderListJson> queryOrderList(CkOrderListQueryParam ckOrderListQueryParam) {
        PageInfo<CkOrderListJson> pageInfo = PageHelper.offsetPage(
                ckOrderListQueryParam.getOffset(),
                ckOrderListQueryParam.getLimit()
        ).doSelectPageInfo(()->ckOrderMapper.queryCkOrderList(ckOrderListQueryParam));
        return pageInfo;
    }

    public boolean batchAddOrder(String orderListStr){
        List<CkOrderInsertParam> orderList = (List<CkOrderInsertParam>)JSONArray.parse(orderListStr);
        int  optNum = ckOrderMapper.batchInsert(orderList);
        return optNum>0;
    }

    public PageInfo<CkProduct> queryProductList(CkProductListQueryParam ckProductListQueryParam) {
        PageInfo<CkProduct> pageInfo = PageHelper.offsetPage(
                ckProductListQueryParam.getOffset(),
                ckProductListQueryParam.getLimit()
        ).doSelectPageInfo(()->ckProductMapper.queryProductList(ckProductListQueryParam));
        return pageInfo;
    }

    public PageInfo<CkDistrict> queryDistrictList(CkDistrictListQueryParam ckDistrictListQueryParam) {
        PageInfo<CkDistrict> pageInfo = PageHelper.offsetPage(
                ckDistrictListQueryParam.getOffset(),
                ckDistrictListQueryParam.getLimit()
        ).doSelectPageInfo(()->ckDistrictMapper.queryDistrictList(ckDistrictListQueryParam));
        return pageInfo;
    }

    public PageInfo<CkUserListJson> queryUserList(CkUserListQueryParam ckUserListQueryParam) {
        PageInfo<CkUserListJson> pageInfo = PageHelper.offsetPage(
                ckUserListQueryParam.getOffset(),
                ckUserListQueryParam.getLimit()
        ).doSelectPageInfo(()->ckUserMapper.queryUserList(ckUserListQueryParam));
        return pageInfo;
    }

    public boolean addDistrict(String name){
        int optNum = ckDistrictMapper.addDistrict(name);
        return optNum>0;
    }

    public boolean addUser(CkUserInsertParam ckUserInsertParam){
        CkUser ckUser = new CkUser();
        ckUser.setName(ckUserInsertParam.getName());
        ckUser.setDistrictNo(ckUserInsertParam.getDistrictNo());
        ckUser.setPhone(ckUserInsertParam.getPhone());
        int optNum = ckUserMapper.insert(ckUser);
        return optNum>0;
    }

    public boolean addProduct(CkProduct ckProduct){
        int optNum = ckProductMapper.insert(ckProduct);
        return optNum>0;
    }

}
