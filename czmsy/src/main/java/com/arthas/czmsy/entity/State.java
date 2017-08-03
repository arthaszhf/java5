package com.arthas.czmsy.entity;


/**
 * 
* @ClassName: State 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:43:20 
*
 */

public class State {
	//id
	private int id;
	//员工类型
	private String statename;
	
	
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

	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}

	
	
}
