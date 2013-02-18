package org.hanfeng.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student", catalog = "studentinfo")
public class Student extends AbstractStudent implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 5493573372988763352L;

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String SName, String SAddress, double gpa, String SGender,
			Set<Reserve> reserves) {
		super(SName, SAddress, gpa, SGender, reserves);
	}

}
