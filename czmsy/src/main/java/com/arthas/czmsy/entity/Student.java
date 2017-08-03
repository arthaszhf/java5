package com.arthas.czmsy.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
* @ClassName: Student 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:43:26 
*
 */

public class Student {
	//id
	private int id;
	//学生姓名
	private String studentName;
	//性别
	private String sex;
	//年龄
	private int age;
	//入学时间
	private Date startDate;
	//班级
	private Class clazz;
	//剩余课时
	private int remainTimes;
	//学校
	private String School;
	//课程记录
	private Set<LessonRecord> lessonRecordSet= new HashSet<LessonRecord>();
	//家长信息
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
