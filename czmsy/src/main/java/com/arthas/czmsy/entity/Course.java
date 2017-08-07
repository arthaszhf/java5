package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
* @ClassName: Course 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:42:53 
*
 */
@Entity
@Table(name="course")
public class Course {
	//id
	@Id
	@GeneratedValue
	@Column(name="course_id")
	private int id;
	//课程名
	@Column(name="course_coursename")
	private String courseName;	
	//剩余课时
	@Column(name="course_remaintimes")
	private int remainTimes;
	//课程类型
	@ManyToOne(fetch=FetchType.LAZY)
	private CourseType courseType;
	//班级多对一
	@OneToMany(fetch=FetchType.LAZY)
	private Set<Class> classSet = new HashSet<Class>();
	//价格
	@Column(name="coursetype_price")
	private int price;
	
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRemainTimes() {
		return remainTimes;
	}
	public void setRemainTimes(int remainTimes) {
		this.remainTimes = remainTimes;
	}
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
	public Set<Class> getClassSet() {
		return classSet;
	}
	public void setClassSet(Set<Class> classSet) {
		this.classSet = classSet;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
