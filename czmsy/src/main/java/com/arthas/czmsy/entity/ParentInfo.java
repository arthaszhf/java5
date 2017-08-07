package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/**
 * 
* @ClassName: ParentInfo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:43:04 
*
 */
@Entity
@Table(name="parentinfo")
public class ParentInfo {
	// id
	@Id
	@GeneratedValue
	@Column(name="parentinfo_id")
	private int id;
	// 家长姓名
	@Column(name="parentinfo_parentname")
	private String parentName;
	// 电话号码
	@Column(name="parentinfo_phonenumber")
	private String phoneNumber;
	// 地址
	@Column(name="parentinfo_address")
	private String address;
	// 和学生多对多关系
	@ManyToMany(fetch=FetchType.LAZY)
	private Set<Student> studentSet = new HashSet<Student>();

	/**
	 * get set 方法
	 * 
	 * @Description：封装属性
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Set<Student> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}

}
