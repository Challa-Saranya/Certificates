package com.cg.ums.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@TableGenerator(name="college", initialValue = 0,allocationSize = 100)
public class College {

@GeneratedValue(strategy = GenerationType.TABLE,generator = "college")
@Id
private Integer sno;

private String collegeCode;
private String collegeName;
private String collegeLocation;
@JsonFormat(pattern = "yyyy-MM-dd")
private Date affliatedDate;

public College(Integer sno, String collegeCode, String collegeName, String collegeLocation, Date affliatedDate) {
	super();
	this.sno = sno;
	this.collegeCode = collegeCode;
	this.collegeName = collegeName;
	this.collegeLocation = collegeLocation;
	this.affliatedDate = affliatedDate;
}

public Integer getSno() {
	return sno;
}

public void setSno(Integer sno) {
	this.sno = sno;
}

public College() {
	super();
	
}

public String getCollegeCode() {
	return collegeCode;
}

public void setCollegeCode(String collegeCode) {
	this.collegeCode = collegeCode;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

public String getCollegeLocation() {
	return collegeLocation;
}

public void setCollegeLocation(String collegeLocation) {
	this.collegeLocation = collegeLocation;
}

public Date getAffliatedDate() {
	return affliatedDate;
}

public void setAffliatedDate(Date affliatedDate) {
	this.affliatedDate = affliatedDate;
}

@Override
public String toString() {
	return "Univercity [sno=" + sno + ", collegeCode=" + collegeCode + ", collegeName=" + collegeName
			+ ", collegeLocation=" + collegeLocation + ", affliatedDate=" + affliatedDate + "]";

}
}
