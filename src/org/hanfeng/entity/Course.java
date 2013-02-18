package org.hanfeng.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "course", catalog = "studentinfo")
public class Course extends AbstractCourse implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = -9048384351376333939L;

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(String CName, String CType, Set<Reserve> reserves) {
		super(CName, CType, reserves);
	}

}
