package com.gzzhwl.core.data.extdao;

import java.util.Map;

import com.gzzhwl.core.data.model.LoadElecreceipt;

public interface LoadElecreceiptExtDao {
    public final static String PREFIX = LoadElecreceiptExtDao.class.getName();
	public LoadElecreceipt getElecreceipt(Map<String, Object> params);
	
	public Map<String,Object> getCurrentElecreceipt(String loadId);
}
