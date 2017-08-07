package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @ClassName: Role
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yinqing
 * @date 2017年7月31日 下午11:43:09
 *
 */
@Entity
@Table(name = "role")
public class Role {
	// id
	@Id
	@GeneratedValue
	@Column(name = "role_id")
	private int id;
	// 角色名
	@Column(name = "role_rolename")
	private String roleName;
	// 与菜单多对多关系
	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Resource> resourceSet = new HashSet<Resource>();
	// 与用户多对一
	@OneToMany(fetch = FetchType.LAZY)
	private Set<User> userSet = new HashSet<User>();

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
