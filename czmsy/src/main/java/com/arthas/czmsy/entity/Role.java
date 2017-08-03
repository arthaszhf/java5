package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
* @ClassName: Role 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yinqing
* @date 2017年7月31日 下午11:43:09 
*
 */

public class Role {
	//id
	private int id;
	//角色名
	private String roleName;
	//与菜单多对多关系
	private Set<Resource> resourceSet = new HashSet<Resource>();
	//与用户多对一
	private Set<User> userSet = new HashSet<User>();
	
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Resource> getResourceSet() {
		return resourceSet;
	}
	public void setResourceSet(Set<Resource> resourceSet) {
		this.resourceSet = resourceSet;
	}

	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", resourceSet=" + resourceSet + ", userSet=" + userSet
				+ "]";
	}

	
}
