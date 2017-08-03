package com.arthas.czmsy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: CourseType
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yinqing
 * @date 2017年7月31日 下午11:42:57
 *
 */
@Entity
@Table(name = "coursetype")
public class CourseType {

	// id
	@Id
	@GeneratedValue
	private int id;
	// 课程类型名

	@Column(name = "coursetype_name")
	private String typeName;
	// 课程时长
	@Column(name = "coursetype_name")
	private int minutes;

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

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
