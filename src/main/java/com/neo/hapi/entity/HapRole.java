package com.neo.hapi.entity;

import com.neo.common.entity.MyBatisEntity;

public class HapRole extends MyBatisEntity {

	private java.lang.String rolename;
	private java.lang.String description;
	private java.sql.Timestamp effectStart;
	private java.sql.Timestamp effectEnd;
	private java.lang.String rolecode;
	private java.lang.String status;
	private long scenarioId;
	private long createorgid;

	public java.lang.String getRolename() {
		return rolename;
	}
	
	public void setRolename(java.lang.String rolename){ 
        this.rolename = rolename;
    }
	public java.lang.String getDescription() {
		return description;
	}
	
	public void setDescription(java.lang.String description){ 
        this.description = description;
    }
	public java.sql.Timestamp getEffectStart() {
		return effectStart;
	}
	
	public void setEffectStart(java.sql.Timestamp effectStart){ 
        this.effectStart = effectStart;
    }
	public java.sql.Timestamp getEffectEnd() {
		return effectEnd;
	}
	
	public void setEffectEnd(java.sql.Timestamp effectEnd){ 
        this.effectEnd = effectEnd;
    }
	public java.lang.String getRolecode() {
		return rolecode;
	}
	
	public void setRolecode(java.lang.String rolecode){ 
        this.rolecode = rolecode;
    }
	public java.lang.String getStatus() {
		return status;
	}
	
	public void setStatus(java.lang.String status){ 
        this.status = status;
    }
	public long getScenarioId() {
		return scenarioId;
	}
	
	public void setScenarioId(long scenarioId){ 
        this.scenarioId = scenarioId;
    }
	public long getCreateorgid() {
		return createorgid;
	}
	
	public void setCreateorgid(long createorgid){ 
        this.createorgid = createorgid;
    }

}