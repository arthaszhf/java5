package com.arthas.czmsy.entity;

/**
 * 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:43:48 
*
 */

public class User {
	//id
	private int id;
	//用户名
	private String userName;
	//登录名
	private String loginName;
	//密码
	private String password;
	//角色
	private Role role;
	
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", loginName=" + loginName + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	
}
