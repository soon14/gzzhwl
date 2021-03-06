package com.gzzhwl.api.quoted.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gzzhwl.admin.quoted.service.QuotedManageService;
import com.gzzhwl.api.quoted.service.QuotedService;
import com.gzzhwl.api.quoted.vo.FinishQuotedVo;
import com.gzzhwl.core.data.model.AccountInfo;
import com.gzzhwl.core.data.model.QuotedInfo;
import com.gzzhwl.core.page.Page;
import com.gzzhwl.rest.springmvc.annotation.Authorization;
import com.gzzhwl.rest.springmvc.annotation.Pagination;
import com.gzzhwl.rest.springmvc.model.PageParameter;
import com.gzzhwl.rest.springmvc.model.ResponseModel;

@RestController
@RequestMapping("/api/quoted")
public class QuotedController {
	
	@Autowired
	private QuotedService quotedService;
	
	@Autowired
	private QuotedManageService quotedManageService;
	
	
	/**
	 * 新增报价
	 * @param sourceId
	 * @param price
	 * @param remark
	 * @param accountInfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/addQuotedInfo", method = RequestMethod.POST)
	private ResponseModel addQuotedInfo(@RequestParam(required=true)String sourceId,@RequestParam(required=true)String price,@RequestParam(required=false)String remark, @Authorization AccountInfo accountInfo) throws ParseException {
		
		String quotedInfoId = quotedService.addQuoted(accountInfo.getAccountId(), sourceId, price, remark);
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("quotedInfoId", quotedInfoId);
		
		return new ResponseModel(resMap);
	}
	
	/**
	 * 完成报价
	 * @param quotedId
	 * @param accountInfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/finishQuotedInfo", method = RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE})
	private ResponseModel finishQuotedInfo(@RequestBody FinishQuotedVo finishQuotedVo, @Authorization AccountInfo accountInfo) throws ParseException {
		
		String quotedInfoId = quotedService.finishQuoted(finishQuotedVo, accountInfo.getAccountId());
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("quotedInfoId", quotedInfoId);
		
		return new ResponseModel(resMap);
	}
	
	/**
	 * 关闭报价
	 * @param quotedId
	 * @param accountInfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/closeQuotedInfo", method = RequestMethod.POST)
	private ResponseModel closeQuotedInfo(@RequestParam(required=true)String sourceId, @Authorization AccountInfo accountInfo) throws ParseException {
		
		String quotedInfoId = quotedService.closeQuotedInfo(sourceId, accountInfo.getAccountId());
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("quotedInfoId", quotedInfoId);
		
		return new ResponseModel(resMap);
	}
	
	/**
	 * 报价作废
	 * @param quotedId
	 * @param accountInfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/invalidTheBid", method = RequestMethod.POST)
	private ResponseModel invalidTheBid(@RequestParam(required=true)String sourceId, @Authorization AccountInfo accountInfo) throws ParseException {
		
		String quotedInfoId = quotedService.invalidTheBid(sourceId, accountInfo.getAccountId());
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("quotedInfoId", quotedInfoId);
		
		return new ResponseModel(resMap);
	}
	
	@RequestMapping(value = "/getQuotedInfo", method = RequestMethod.GET)
	private ResponseModel getQuotedInfo(@RequestParam(required=true)String sourceId,@Authorization AccountInfo accountInfo) throws ParseException {
		
		QuotedInfo quotedInfo = quotedService.getMyQuoted(sourceId, accountInfo.getAccountId());
		
		return new ResponseModel(quotedInfo);
	}
	
	@RequestMapping(value = "/getQuotedOrderList", method = RequestMethod.GET)
	private ResponseModel getQuotedOrderList(@RequestParam(required=true)String sourceType,@Authorization AccountInfo accountInfo,@Pagination PageParameter page) throws ParseException {
		
		Page<Map<String, Object>> resPage = quotedService.getQuotedOrderList(sourceType, accountInfo.getAccountId(), page.getPageIndex(), page.getPageSize());
		
		return new ResponseModel(resPage);
	}
	
	@RequestMapping(value = "/getQuotedOrderDetail", method = RequestMethod.GET)
	private ResponseModel getQuotedOrderDetail(@RequestParam(required=true)String quotedId,@Authorization AccountInfo accountInfo) throws ParseException {
		
		Map<String, Object> resMap = quotedService.getQuotedOrderDetail(quotedId, accountInfo.getAccountId());
		
		return new ResponseModel(resMap);
	}
	
	/**
	 * 获取运输车辆信息
	 * @param sourceId
	 * @param status
	 * @param page
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/getBidVehicleInfo", method = RequestMethod.GET)
	private ResponseModel getBidVehicleInfo(@RequestParam(required=true)String sourceId,@Authorization AccountInfo accountInfo) throws ParseException {
		
		Map<String,Object> paraMap = quotedManageService.getBidVehicleInfo(sourceId);

		return new ResponseModel(paraMap);
	}
	
	
	/**
	 * 获取我的订单数量
	 * @param accountInfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/getOrderCount", method = RequestMethod.GET)
	private ResponseModel getOrderCount(@Authorization AccountInfo accountInfo) throws ParseException {
		
		Map<String,Object> resMap = quotedService.getOrderCount(accountInfo.getAccountId());

		return new ResponseModel(resMap);
	}

	
	/**
	 * 获取提货单详情
	 * @param accountInfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/getLoadBillByQuotedId", method = RequestMethod.GET)
	private ResponseModel getLoadBillByQuotedId(@RequestParam(required=true)String quotedId,@Authorization AccountInfo accountInfo) throws ParseException {
		
		Map<String,Object> paraMap = quotedService.getLoadBillByQuotedId(quotedId);

		return new ResponseModel(paraMap);
	}
	
	
}
