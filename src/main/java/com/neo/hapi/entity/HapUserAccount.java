package com.neo.hapi.entity;

import com.neo.common.entity.MyBatisEntity;

public class HapUserAccount extends MyBatisEntity {

	//是否启用，0:禁用；1:启用
	private java.lang.String enable;
	//登陆账号
	private java.lang.String account;
	//登陆口令
	private java.lang.String password;
	//账号生效起始时间
	private java.sql.Timestamp starttime;
	//账号失效时间
	private java.sql.Timestamp endtime;
	//账号类型，1:管理账号；2:普通账号
	private java.lang.String accountType;
	//上次登陆时间
	private java.sql.Timestamp lastlogindate;
	//上次登陆IP
	private java.lang.String lastloginip;
	//密码提示问题
	private java.lang.String passquestion;
	//密码提示问题答案
	private java.lang.String passanswer;
	//删除标记，0:已删除；1:未删除
	private java.lang.String delflag;
	private long createorgid;
	private java.lang.String memo;
	private java.lang.String temp1;
	private java.lang.String temp2;

	/**
	 * @return 是否启用，0:禁用；1:启用
	 */
	public java.lang.String getEnable() {
		return enable;
	}
	
	/**
	 * @param enable 是否启用，0:禁用；1:启用
	 */
	public void setEnable(java.lang.String enable){ 
        this.enable = enable;
    }
	/**
	 * @return 登陆账号
	 */
	public java.lang.String getAccount() {
		return account;
	}
	
	/**
	 * @param account 登陆账号
	 */
	public void setAccount(java.lang.String account){ 
        this.account = account;
    }
	/**
	 * @return 登陆口令
	 */
	public java.lang.String getPassword() {
		return password;
	}
	
	/**
	 * @param password 登陆口令
	 */
	public void setPassword(java.lang.String password){ 
        this.password = password;
    }
	/**
	 * @return 账号生效起始时间
	 */
	public java.sql.Timestamp getStarttime() {
		return starttime;
	}
	
	/**
	 * @param starttime 账号生效起始时间
	 */
	public void setStarttime(java.sql.Timestamp starttime){ 
        this.starttime = starttime;
    }
	/**
	 * @return 账号失效时间
	 */
	public java.sql.Timestamp getEndtime() {
		return endtime;
	}
	
	/**
	 * @param endtime 账号失效时间
	 */
	public void setEndtime(java.sql.Timestamp endtime){ 
        this.endtime = endtime;
    }
	/**
	 * @return 账号类型，1:管理账号；2:普通账号
	 */
	public java.lang.String getAccountType() {
		return accountType;
	}
	
	/**
	 * @param accountType 账号类型，1:管理账号；2:普通账号
	 */
	public void setAccountType(java.lang.String accountType){ 
        this.accountType = accountType;
    }
	/**
	 * @return 上次登陆时间
	 */
	public java.sql.Timestamp getLastlogindate() {
		return lastlogindate;
	}
	
	/**
	 * @param lastlogindate 上次登陆时间
	 */
	public void setLastlogindate(java.sql.Timestamp lastlogindate){ 
        this.lastlogindate = lastlogindate;
    }
	/**
	 * @return 上次登陆IP
	 */
	public java.lang.String getLastloginip() {
		return lastloginip;
	}
	
	/**
	 * @param lastloginip 上次登陆IP
	 */
	public void setLastloginip(java.lang.String lastloginip){ 
        this.lastloginip = lastloginip;
    }
	/**
	 * @return 密码提示问题
	 */
	public java.lang.String getPassquestion() {
		return passquestion;
	}
	
	/**
	 * @param passquestion 密码提示问题
	 */
	public void setPassquestion(java.lang.String passquestion){ 
        this.passquestion = passquestion;
    }
	/**
	 * @return 密码提示问题答案
	 */
	public java.lang.String getPassanswer() {
		return passanswer;
	}
	
	/**
	 * @param passanswer 密码提示问题答案
	 */
	public void setPassanswer(java.lang.String passanswer){ 
        this.passanswer = passanswer;
    }
	/**
	 * @return 删除标记，0:已删除；1:未删除
	 */
	public java.lang.String getDelflag() {
		return delflag;
	}
	
	/**
	 * @param delflag 删除标记，0:已删除；1:未删除
	 */
	public void setDelflag(java.lang.String delflag){ 
        this.delflag = delflag;
    }
	public long getCreateorgid() {
		return createorgid;
	}
	
	public void setCreateorgid(long createorgid){ 
        this.createorgid = createorgid;
    }
	public java.lang.String getMemo() {
		return memo;
	}
	
	public void setMemo(java.lang.String memo){ 
        this.memo = memo;
    }
	public java.lang.String getTemp1() {
		return temp1;
	}
	
	public void setTemp1(java.lang.String temp1){ 
        this.temp1 = temp1;
    }
	public java.lang.String getTemp2() {
		return temp2;
	}
	
	public void setTemp2(java.lang.String temp2){ 
        this.temp2 = temp2;
    }

}