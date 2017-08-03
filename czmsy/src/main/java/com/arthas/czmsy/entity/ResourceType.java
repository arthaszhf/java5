package com.arthas.czmsy.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
* @ClassName: ResourceType 
* @Description: 资源类型类
* @author yinqing
* @date 2017年8月2日 下午2:09:02 
*
 */

public class ResourceType {
	//id
	private int id;
	//类型名
	private String resourceTypeName;
	//与资源一对多关系
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
