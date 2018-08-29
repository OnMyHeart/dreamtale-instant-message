package com.dreamtale.instant.message.web.service;

import com.alibaba.fastjson.JSONArray;
import com.dreamtale.instant.message.api.entity.ck.json.*;
import com.dreamtale.instant.message.api.entity.ck.param.*;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkDistrict;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkOrder;
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

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
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

    public boolean delOrder(Long id){
        CkOrder ckOrder = new CkOrder();
        ckOrder.setStatus(2);
        ckOrder.setId(id);
        int optNum = ckOrderMapper.updateByPrimaryKeySelective(ckOrder);
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

    public Boolean delDistrict(Long id){
        CkDistrict ckDistrict = new CkDistrict();
        ckDistrict.setId(id);
        ckDistrict.setStatus(2);
        int optNum = ckDistrictMapper.updateByPrimaryKeySelective(ckDistrict);
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

    public boolean delUser(Long id){
        CkUser ckUser = new CkUser();
        ckUser.setId(id);
        ckUser.setStatus(2);
        int optNum = ckUserMapper.updateByPrimaryKeySelective(ckUser);
        return optNum>0;
    }

    public boolean addProduct(CkProduct ckProduct){
        int optNum = ckProductMapper.insert(ckProduct);
        return optNum>0;
    }

    public boolean delProduct(Long id){
        CkProduct ckProduct = new CkProduct();
        ckProduct.setId(id);
        ckProduct.setStatus(2);
        int optNum = ckProductMapper.updateByPrimaryKeySelective(ckProduct);
        return optNum>0;
    }

    public CkStatisticsJson queryStatisticsInfo(){
        CkStatisticsQueryParam ckStatisticsQueryParam = new CkStatisticsQueryParam();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        //查月度
        Date startDate = calendar.getTime();
        calendar.add(Calendar.MONTH, 1);
        Date endDate = calendar.getTime();
        ckStatisticsQueryParam.setStartDate(startDate);
        ckStatisticsQueryParam.setEndDate(endDate);
        List<CkSalesMoneyJson> salesMoneyOfMonth = ckOrderMapper.salesMoneyByDate(ckStatisticsQueryParam);
        List<CkSalesRankingJson> salesRankingOfMonth = ckOrderMapper.salesRankingByDate(ckStatisticsQueryParam);
        //查年度
        calendar.set(Calendar.MONTH, 0);
        startDate = calendar.getTime();
        calendar.add(Calendar.YEAR, 1);
        endDate = calendar.getTime();
        ckStatisticsQueryParam.setStartDate(startDate);
        ckStatisticsQueryParam.setEndDate(endDate);
        List<CkSalesMoneyJson> salesMoneyOfYear = ckOrderMapper.salesMoneyByDate(ckStatisticsQueryParam);
        List<CkSalesRankingJson> salesRankingOfYear = ckOrderMapper.salesRankingByDate(ckStatisticsQueryParam);

        //计算销售总额和销售总量
        BigDecimal amountOfMonth = new BigDecimal(0.00);
        for (CkSalesMoneyJson ckSalesMoneyJson : salesMoneyOfMonth){
            amountOfMonth = amountOfMonth.add(ckSalesMoneyJson.getAmount());
        }

        BigDecimal amountOfYear = new BigDecimal(0.00);
        for (CkSalesMoneyJson ckSalesMoneyJson : salesMoneyOfYear){
            amountOfYear = amountOfYear.add(ckSalesMoneyJson.getAmount());
        }

        Long countOfMonth = 0L;
        for (CkSalesRankingJson ckSalesRankingJson : salesRankingOfMonth){
            countOfMonth += ckSalesRankingJson.getProductCount();
        }

        Long countOfYear = 0L;
        for (CkSalesRankingJson ckSalesRankingJson : salesRankingOfYear){
            countOfMonth += ckSalesRankingJson.getProductCount();
        }

        CkStatisticsJson ckStatisticsJson = new CkStatisticsJson();
        ckStatisticsJson.setSalesMoneyOfMonth(salesMoneyOfMonth);
        ckStatisticsJson.setSalesMoneyOfYear(salesMoneyOfYear);
        ckStatisticsJson.setSalesRankingOfMonth(salesRankingOfMonth);
        ckStatisticsJson.setSalesRankingOfYear(salesRankingOfYear);
        ckStatisticsJson.setStarsProductOfMonth(salesRankingOfMonth.get(0));
        ckStatisticsJson.setStarsProductOfYear(salesRankingOfYear.get(0));
        ckStatisticsJson.setStarsSalesmanOfMonth(salesMoneyOfMonth.get(0));
        ckStatisticsJson.setStarsSalesmanOfYear(salesMoneyOfYear.get(0));
        ckStatisticsJson.setCountOfMonth(countOfMonth);
        ckStatisticsJson.setCountOfYear(countOfYear);
        ckStatisticsJson.setAmountOfMonth(amountOfMonth);
        ckStatisticsJson.setAmountOfYear(amountOfYear);
        return ckStatisticsJson;
    }

}
