package com.cjc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Entity
public class TypeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srNo;
	private String statusName;
	private String type_Remark;
	//@Column(nullable = false, columnDefinition = "BIT default 1",length = 1)
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	@ColumnDefault("0")
	private int status;
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getType_Remark() {
		return type_Remark;
	}
	public void setType_Remark(String type_Remark) {
		this.type_Remark = type_Remark;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	

}
