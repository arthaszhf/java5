package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
* @ClassName: ResourceType 
* @Description: 资源类型类
* @author yinqing
* @date 2017年8月2日 下午2:09:02 
*
 */
@Entity
@Table(name="resourcetype")
public class ResourceType {
	//id
	@Id
	@GeneratedValue
	private int id;
	//类型名
	@Column(name="resourcetype_name")
	private String resourceTypeName;
	//与资源一对多关系
	@OneToMany(fetch=FetchType.LAZY)
	private Set<Resource> resourceSet = new HashSet<Resource>();
	
	/**
	* getset方法
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResourceTypeName() {
		return resourceTypeName;
	}
	public void setResourceTypeName(String resourceTypeName) {
		this.resourceTypeName = resourceTypeName;
	}
	public Set<Resource> getResourceSet() {
		return resourceSet;
	}
	public void setResourceSet(Set<Resource> resourceSet) {
		this.resourceSet = resourceSet;
	}
	
}
