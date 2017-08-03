package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
* @ClassName: resource 
* @Description: 资源文件
* @author yinqing
* @date 2017年7月31日 下午11:43:01 
*
 */

public class Resource {
	//id
	private int id;
	//菜单名
	private String resourceName;
	//父id
	private int parentId;
	//URL
	private String url;
	//资源类型 多对一关系
	private ResourceType resouceType;
	//与角色多对多
	private Set<Role> rolesSet = new HashSet<Role>();
	
	
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
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ResourceType getResouceType() {
		return resouceType;
	}
	public void setResouceType(ResourceType resouceType) {
		this.resouceType = resouceType;
	}
	public Set<Role> getRolesSet() {
		return rolesSet;
	}
	public void setRolesSet(Set<Role> rolesSet) {
		this.rolesSet = rolesSet;
	}
}
