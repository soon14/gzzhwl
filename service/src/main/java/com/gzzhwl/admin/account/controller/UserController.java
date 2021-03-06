package com.gzzhwl.admin.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gzzhwl.admin.account.service.UserService;
import com.gzzhwl.core.page.Page;
import com.gzzhwl.rest.security.annotation.RequirePerm;
import com.gzzhwl.rest.security.utils.SecurityUtils;
import com.gzzhwl.rest.springmvc.annotation.Pagination;
import com.gzzhwl.rest.springmvc.model.PageParameter;
import com.gzzhwl.rest.springmvc.model.ResponseModel;
import com.gzzhwl.rest.springmvc.validate.ParamEmptyValidator;

@RestController
@RequestMapping("/admin/account")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 获取账号审核列表
	 * @param userName
	 * @param realName
	 * @param companyName
	 * @param checkStatus
	 * @param page
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/pageCheckList", method = { RequestMethod.GET })
	public ResponseModel pageCheckList(@RequestParam(required=false) String telphone,@RequestParam(required=false) String realName,@RequestParam(required=false) String companyName,@RequestParam(required=false) String status,@RequestParam(required=true) String queryType,@RequestParam(required=false)String queryContent, @Pagination PageParameter page) {
		Page<Map<String,Object>> result=userService.getCheckList(status, telphone, realName, companyName, queryType,queryContent,page);
		return new ResponseModel(result);
	}
	
	/**
	 * 账号详情
	 * @param accountId
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/getUserDetail", method = { RequestMethod.GET })
	public ResponseModel getUserDetail(@RequestParam String accountId) {
		ParamEmptyValidator.VALID_PARAM_EMPTY(accountId);
		Map<String,Object> result=userService.getUserDetail(accountId);
		return new ResponseModel(result);
	}
	
	/**
	 * 审核通过
	 * @param accountId
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/checkPass", method = { RequestMethod.POST })
	public ResponseModel checkPass(@RequestParam String accountId ) {
		userService.checkPass(accountId,SecurityUtils.getSubject().getStaffId());
		return new ResponseModel(null);
	}
	/**
	 * 审核未通过
	 * @param accountId
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/checkUnpass", method = { RequestMethod.POST })
	public ResponseModel checkUnpass(@RequestParam String accountId ) {
		userService.checkUnpass(accountId,SecurityUtils.getSubject().getStaffId());
		return new ResponseModel(null);
	}
	/**
	 * 获取注册账号列表
	 * @param userName
	 * @param realName
	 * @param status
	 * @param page
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/pageAccountList", method = { RequestMethod.GET })
	public ResponseModel pageAccountList(@RequestParam(required=false) String telphone,@RequestParam(required=false) String realName,@RequestParam(required=false) String status,@RequestParam(required=true) String queryType,@RequestParam(required=false) String queryContent,@Pagination PageParameter page) {
		Page<Map<String,Object>> result=userService.getAccountList(telphone, realName, status,queryType,queryContent,page);
		return new ResponseModel(result);
	}
	/**
	 * 冻结账号
	 * @param accountId
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/freezeAccount", method = { RequestMethod.POST })
	public ResponseModel freezeAccount(@RequestParam String accountId) {
		userService.freeze(accountId,SecurityUtils.getSubject().getStaffId());
		return new ResponseModel(null);
	}
	/**
	 * 账号解冻
	 * @param accountId
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/thawAccount", method = { RequestMethod.POST })
	public ResponseModel unfreezeAccount(@RequestParam String accountId ) {
		userService.thaw(accountId,SecurityUtils.getSubject().getStaffId());
		return new ResponseModel(null);
	}
	
	/**
	 * 账号下线路列表
	 * @param accountId
	 * @return
	 */
	@RequirePerm
	@RequestMapping(value = "/getLineList", method = { RequestMethod.GET })
	public ResponseModel getLineList(@RequestParam String accountId ) {
		List<Map<String, Object>> lines = userService.getLineList(accountId);
		return new ResponseModel(lines);
	}
	
	
	
	@RequirePerm
	@RequestMapping(value = "/getUserDetail2", method = { RequestMethod.GET })
	public ResponseModel getUserDetail2(@RequestParam String accountId) {
		ParamEmptyValidator.VALID_PARAM_EMPTY(accountId);
		Map<String,Object> result=userService.getUserDetail2(accountId);
		return new ResponseModel(result);
	}
	
	@RequirePerm
	@RequestMapping(value = "/getAccountDetail2", method = { RequestMethod.GET })
	public ResponseModel getAccountDetail2(@RequestParam String accountId) {
		ParamEmptyValidator.VALID_PARAM_EMPTY(accountId);
		Map<String,Object> result=userService.getAccountDetail2(accountId);
		return new ResponseModel(result);
	}

}
