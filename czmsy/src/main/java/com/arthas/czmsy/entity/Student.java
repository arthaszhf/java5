package com.arthas.czmsy.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
* @ClassName: Student 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:43:26 
*
 */
@Entity
@Table(name="student")
public class Student {
	//id
	@Id
	@GeneratedValue
	private int id;
	//学生姓名
	@Column(name="student_studentname")
	private String studentName;
	//性别
	@Column(name="student_sex")
	private String sex;
	//年龄
	@Column(name="student_age")
	private int age;
	//入学时间
	@Column(name="student_startdate")
	private Date startDate;
	//班级
	@ManyToOne(fetch=FetchType.LAZY)
	private Class clazz;
	//剩余课时
	@Column(name="student_remaintimes")
	private int remainTimes;
	//学校
	@Column(name="student_school")
	private String School;
	//课程记录
	@ManyToMany
	private Set<LessonRecord> lessonRecordSet= new HashSet<LessonRecord>();
	//家长信息
	@OneToMany
	private Set<ParentInfo> parentInfoSet = new HashSet<ParentInfo>();
	
	
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
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getRemainTimes() {
		return remainTimes;
	}
	public void setRemainTimes(int remainTimes) {
		this.remainTimes = remainTimes;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	public Set<ParentInfo> getParentInfoSet() {
		return parentInfoSet;
	}
	public void setParentInfoSet(Set<ParentInfo> parentInfoSet) {
		this.parentInfoSet = parentInfoSet;
	}
	public Set<LessonRecord> getLessonRecordSet() {
		return lessonRecordSet;
	}
	public void setLessonRecordSet(Set<LessonRecord> lessonRecordSet) {
		this.lessonRecordSet = lessonRecordSet;
	}
	
	
}
