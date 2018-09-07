package com.neo.framwork.interceptor.mybatis;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.awt.AppContext;

import com.neo.common.entity.MyBatisEntity;
import com.neo.framwork.util.DateUtil;

@Intercepts({ @Signature(method = "update", type = Executor.class, args = {
		MappedStatement.class, Object.class }) })
public class UpdateInterceptor implements Interceptor {

	private static final Logger log = LoggerFactory
			.getLogger(UpdateInterceptor.class);

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {

	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object intercept(Invocation invocation) throws Throwable {
		if (invocation.getTarget() instanceof StatementHandler) {// 控制SQL和查询总数的地方

			return invocation.proceed();
		} else { // 查询结果的地方

			// 设置真正的parameterObj
			invocation.getArgs()[1] = extractRealParameterObject(invocation
					.getArgs()[1]);

			Object resultObj = invocation.proceed(); // Executor.query(..)

			return resultObj;

		}
	}

	protected Object extractRealParameterObject(Object parameterObj) throws Exception {
		if (parameterObj instanceof MyBatisEntity) {
			MyBatisEntity entity = (MyBatisEntity) parameterObj;
			if (entity.getId() == 0) { // 新建时未设置id
				/*
				try {
					String seq = Sequence.next(entity.getSequenceName());
					entity.setId(Long.parseLong(seq));
				} catch (Exception e) {
					//20180512刘敬祖加上(由于以前处理方式是出现异常，则id获取一个无穷大的值，又没有打印异常日志，造成无法定位问题)
					log.error(e.getMessage(),e);
					entity.setIdIfNew();
				}*/
				///entity.setId(NewSequence.getNexSequence(entity.getSequenceName()));
			}
			try {
				//UserContext uc = AppContext.currentUser();
				/*long userId = uc == null ? 0 : uc.getUserAccount().getId();
				if (entity.getCreateUserId() <= 0)
					entity.setCreateUserId(userId);
				if(userId>0)entity.setUpdateUserId(userId);*///判断userId>0因为当对外接口时候，userId会是0，无法设置更新人
			} catch (Throwable t) {
				// 不在登陆上下文中，忽略此异常
			}
			entity.setCreateTimeIfNew();
			entity.setUpdateTime(DateUtil.currentTimestamp());
		}
		return parameterObj;
	}

}