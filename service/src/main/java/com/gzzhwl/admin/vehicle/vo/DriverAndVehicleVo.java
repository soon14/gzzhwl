package com.gzzhwl.admin.vehicle.vo;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.gzzhwl.core.constant.DataSource;
import com.gzzhwl.core.utils.ValidateUtils;
import com.gzzhwl.rest.springmvc.validate.ParamEmptyValidator;

public class DriverAndVehicleVo {
	
	private String vehicleInfoId;
	
	private String accountId;

	private List<String> driverInfoList;

	public String getVehicleInfoId() {
		return vehicleInfoId;
	}

	public void setVehicleInfoId(String vehicleInfoId) {
		this.vehicleInfoId = vehicleInfoId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	
	
	public List<String> getDriverInfoList() {
		return driverInfoList;
	}

	public void setDriverInfoList(List<String> driverInfoList) {
		this.driverInfoList = driverInfoList;
	}

	public Map<String, Object> getParam(){
		
		ParamEmptyValidator.VALID_PARAM_EMPTY(this.vehicleInfoId);
		ParamEmptyValidator.VALID_PARAM_EMPTY(this.accountId);
		Map<String, Object> params = Maps.newHashMap();
		
		params.put("vehicleInfoId", this.vehicleInfoId);
		params.put("source", DataSource.VLORRY.getCode());
		params.put("accountId", this.accountId);

		if(!ValidateUtils.isEmpty(driverInfoList)){
			params.put("driverList", driverInfoList);
		}
		
		return params;
	}
	
}
