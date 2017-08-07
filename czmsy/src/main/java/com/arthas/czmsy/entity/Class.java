package com.arthas.czmsy.entity;

import java.util.Date;
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
 * @ClassName: Class
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yinqing
 * @date 2017年7月31日 下午11:42:45
 *
 */
@Entity
@Table(name = "clss")
public class Class {
	// id
	@Id
	@GeneratedValue
	@Column(name="class_id")
	private int id;
	// 班级名
	@Column(name = "class_classname")
	private String className;
	// 开班时间
	@Column(name = "class_createdate")
	private Date createDate;
	// 上课时间
	@Column(name = "class_classtime")
	private Date classTime;
	// 教师
	@ManyToOne(fetch = FetchType.LAZY)
	private Teacher teacher;
	// 学生
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Student> studentSet = new HashSet<Student>();
	// 课程
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;
	// 上课记录
	@OneToMany(fetch = FetchType.LAZY)
	private Set<LessonRecord> lessonRecordSet = new HashSet<LessonRecord>();

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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getClassTime() {
		return classTime;
	}

	public void setClassTime(Date classTime) {
		this.classTime = classTime;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Set<Student> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Set<LessonRecord> getLessonRecordSet() {
		return lessonRecordSet;
	}

	public void setLessonRecordSet(Set<LessonRecord> lessonRecordSet) {
		this.lessonRecordSet = lessonRecordSet;
	}

}
