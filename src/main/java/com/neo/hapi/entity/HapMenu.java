package com.neo.hapi.entity;

import com.neo.common.entity.MyBatisEntity;

public class HapMenu extends MyBatisEntity {

	private java.lang.String menuname;
	private long parentid;
	private int menulevel;
	private java.lang.String levelcode;
	private int menuorder;
	private java.lang.String navurl;
	private java.lang.String iconurl;

	public java.lang.String getMenuname() {
		return menuname;
	}
	
	public void setMenuname(java.lang.String menuname){ 
        this.menuname = menuname;
    }
	public long getParentid() {
		return parentid;
	}
	
	public void setParentid(long parentid){ 
        this.parentid = parentid;
    }
	public int getMenulevel() {
		return menulevel;
	}
	
	public void setMenulevel(int menulevel){ 
        this.menulevel = menulevel;
    }
	public java.lang.String getLevelcode() {
		return levelcode;
	}
	
	public void setLevelcode(java.lang.String levelcode){ 
        this.levelcode = levelcode;
    }
	public int getMenuorder() {
		return menuorder;
	}
	
	public void setMenuorder(int menuorder){ 
        this.menuorder = menuorder;
    }
	public java.lang.String getNavurl() {
		return navurl;
	}
	
	public void setNavurl(java.lang.String navurl){ 
        this.navurl = navurl;
    }
	public java.lang.String getIconurl() {
		return iconurl;
	}
	
	public void setIconurl(java.lang.String iconurl){ 
        this.iconurl = iconurl;
    }

}