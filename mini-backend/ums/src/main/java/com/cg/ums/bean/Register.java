package com.cg.ums.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="signup_table")
public class Register {
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phonenumber")
	private String phnum;
	
	@Column(name="password")
	private String password;
	
	@Column(name="confirmPassword")
	private String confirmPassword;
	
	@Column(name="securityQuestion")
	private String securityQuestion;
	
	@Column(name="answer")
	private String answer;
	
	public Register() {
		// TODO Auto-generated constructor stub
	}

	public Register(String email, String firstname, String lastname, String gender, String phnum, String password,
			String confirmPassword, String securityQuestion, String answer) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phnum = phnum;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Register [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", phnum=" + phnum + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", securityQuestion=" + securityQuestion + ", answer=" + answer + "]";
	}
	

}
