package com.arthas.czmsy.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
* 
* @ClassName: Teacher 
* @Description: 老师实体 
* @author yinqing
* @date 2017年7月31日 下午11:43:37 
* 
*/

public class Teacher {
	// id
	private int id;
	// 名字
	private String name;
	// 电话
	private String phoneNumber;
	// 入职时间
	private Date entryDate;
	// 工龄
	private int seniority;
	// 家庭住址
	private String address;
	// 目前状态
	private State state;
	// 教师工资
	private TeacherWage teacherWage;
	// 老师与班级一对多
	private Set<Class> classSet = new HashSet<Class>();

	
	/**
	 * get set 方法
	* @Description：封装属性
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public int getSeniority() {
		return seniority;
	}
	
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public TeacherWage getTeacherWage() {
		return teacherWage;
	}

	public void setTeacherWage(TeacherWage teacherWage) {
		this.teacherWage = teacherWage;
	}

	public Set<Class> getClassSet() {
		return classSet;
	}

	public void setClassSet(Set<Class> classSet) {
		this.classSet = classSet;
	}

}
