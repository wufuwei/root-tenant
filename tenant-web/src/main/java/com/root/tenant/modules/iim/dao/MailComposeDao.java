/**
 * Copyright &copy; 2015-2020 <a href="http://www.wusyx.com/">wusyx</a> All rights reserved.
 */
package com.root.tenant.modules.iim.dao;

import com.root.tenant.common.persistence.CrudDao;
import com.root.tenant.common.persistence.annotation.MyBatisDao;
import com.root.tenant.modules.iim.entity.MailCompose;

/**
 * 发件箱DAO接口
 * @author tenant
 * @version 2015-11-15
 */
@MyBatisDao
public interface MailComposeDao extends CrudDao<MailCompose> {
	public int getCount(MailCompose entity);
}