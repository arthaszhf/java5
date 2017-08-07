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
import javax.persistence.Table;

/**
 * 
* @ClassName: LessonRecord 
* @Description: 上课记录
* @author yinqing
* @date 2017年8月1日 上午10:24:21 
*
 */
@Entity
@Table(name="lessonrecord")
public class LessonRecord {
	
	//记录的班级
	@Id
	@GeneratedValue
	@Column(name="lessonrecord_id")
	private int id;
	//上课日期
	@Column(name="lessonrecord_date")
	private Date date;
	//班级
	@ManyToOne(fetch=FetchType.LAZY)
	private Class clazz;
	//上课的学生
	@ManyToMany(fetch=FetchType.LAZY)
	private Set<Student> StudentSet = new HashSet<Student>();
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	public Set<Student> getStudentSet() {
		return StudentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		StudentSet = studentSet;
	}

	
	
	
}
