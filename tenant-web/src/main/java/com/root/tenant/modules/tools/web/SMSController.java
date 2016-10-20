/**
 * Copyright &copy; 2015-2020 <a href="http://www.wusyx.com/">wusyx</a> All rights reserved.
 */
package com.root.tenant.modules.tools.web;

import com.root.tenant.common.sms.SMSUtils;
import com.root.tenant.common.web.BaseController;
import com.root.tenant.modules.sys.entity.SystemConfig;
import com.root.tenant.modules.sys.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 发送短信
 * @author lgf
 * @version 2016-01-07
 */
@Controller
@RequestMapping(value = "${adminPath}/tools/sms")
public class SMSController extends BaseController {

	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 打开短信页面
	 */
	@RequestMapping(value = {"index", ""})
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "modules/tools/sendSMS";
	}

	/**
	 * 发送短信
	 */
	@RequestMapping("send")
	public String send(String tels, HttpServletResponse response, String content, Model model) throws Exception {
		SystemConfig config = systemConfigService.get("1");
		String result = "";
		try{
				String resultCode = SMSUtils.send(config.getSmsName(),config.getSmsPassword(), tels, content);
				if (!resultCode.equals("100")) {
					
					result = "短信发送失败，错误代码："+resultCode+"，请 联系管理员。";
				
				}else{
					result = "短信发送成功";
				}
			} catch (IOException e) {
				result = "因未知原因导致短信发送失败，请联系管理员。";
			}
			
			model.addAttribute("result", result);
			return "modules/tools/sendSMSResult";
	}
		
}