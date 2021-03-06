package com.arthas.czmsy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 
* @ClassName: TeacherWage 
* @Description:  
* @author yinqing
* @date 2017年7月31日 下午11:43:43 
*
*/
@Entity
@Table(name="teacherwage")
public class TeacherWage {
	// id
	@Id
	@GeneratedValue
	@Column(name="teacherwage_id")
	private int id;
	// 工资月份
	@Column(name="teacherwage_wagedate")
	private Date wageDate;
	// 基本工资
	@Column(name="teacherwage_basicwage")
	private long basicWage;
	//上的课时数
	@Column(name="teacherwage_classtimes")
	private int classTimes;
	//样课
	@Column(name="teacherwage_democlasstimes")
	private int demoClassTimes;
	// 课耗绩效
	@Column(name="teacherwage_timesoutperformance")
	private double timesOutPerformance;
	// 满班绩效
	@Column(name="teacherwage_fullclassperformance")
	private double fullClassPerformance;
	// 教学服务绩效
	@Column(name="teacherwage_serviceperformance")
	private double servicePerformance;
	// 续费/转介绍
	@Column(name="teacherwage_renew")
	private int renew;
	// 阶段奖励
	@Column(name="teacherwage_award")
	private int award;
	// 退费学生个数（负激励）
	@Column(name="teacherwage_refundtimes")
	private int refundTimes;

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

	public Date getWageDate() {
		return wageDate;
	}

	public void setWageDate(Date wageDate) {
		this.wageDate = wageDate;
	}

	public long getBasicWage() {
		return basicWage;
	}

	public void setBasicWage(long basicWage) {
		this.basicWage = basicWage;
	}

	public int getClassTimes() {
		return classTimes;
	}

	public void setClassTimes(int classTimes) {
		this.classTimes = classTimes;
	}

	public int getDemoClassTimes() {
		return demoClassTimes;
	}

	public void setDemoClassTimes(int demoClassTimes) {
		this.demoClassTimes = demoClassTimes;
	}

	public double getTimesOutPerformance() {
		return timesOutPerformance;
	}

	public void setTimesOutPerformance(double timesOutPerformance) {
		this.timesOutPerformance = timesOutPerformance;
	}

	public double getFullClassPerformance() {
		return fullClassPerformance;
	}

	public void setFullClassPerformance(double fullClassPerformance) {
		this.fullClassPerformance = fullClassPerformance;
	}

	public double getServicePerformance() {
		return servicePerformance;
	}

	public void setServicePerformance(double servicePerformance) {
		this.servicePerformance = servicePerformance;
	}

	public int getRenew() {
		return renew;
	}
	
	public void setRenew(int renew) {
		this.renew = renew;
	}

	public int getAward() {
		return award;
	}
	
	public void setAward(int award) {
		this.award = award;
	}

	public int getRefundTimes() {
		return refundTimes;
	}
	
	public void setRefundTimes(int refundTimes) {
		this.refundTimes = refundTimes;
	}

}
