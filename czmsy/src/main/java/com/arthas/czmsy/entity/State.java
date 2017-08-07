package com.arthas.czmsy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: State
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yinqing
 * @date 2017年7月31日 下午11:43:20
 *
 */
@Entity
@Table(name = "state")
public class State {
	// id
	@Id
	@GeneratedValue
	@Column(name = "state_id")
	private int id;
	// 员工类型
	@Column(name = "state_statename")
	private String statename;

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

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

}
