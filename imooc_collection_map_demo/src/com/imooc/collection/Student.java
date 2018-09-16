package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

/*
 * 学生类
 */

/*
 * comparable本身也是泛型
 */

public class Student implements Comparable<Student>{
	
	public String id;
	public String name;
	
	public Set<Course> courses;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		
		this.courses = new HashSet<Course>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.id.compareTo(o.id);
		/*
		 * 当前ID和参数ID进行比较返回结果
		 */
	}
}