package com.cg.ums.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Placements {

	@Id
	private Integer companyId;
	private String companyName;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date visitedOnDate;
	private Integer noOfPlacements;
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public Integer getNoOfPlacements() {
		return noOfPlacements;
	}
	public void setNoOfPlacements(Integer noOfPlacements) {
		this.noOfPlacements = noOfPlacements;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getVisitedOnDate() {
		return visitedOnDate;
	}
	public void setVisitedOnDate(Date visitedOnDate) {
		this.visitedOnDate = visitedOnDate;
	}
	@Override
	public String toString() {
		return "Placements [companyId=" + companyId + ", companyName=" + companyName + ", visitedOnDate="
				+ visitedOnDate + "]";
	}
	
	public Placements(Integer companyId, String companyName, Date visitedOnDate, Integer noOfPlacements) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.visitedOnDate = visitedOnDate;
		this.noOfPlacements = noOfPlacements;
	}
	public Placements() {
		super();
	}
	
}
