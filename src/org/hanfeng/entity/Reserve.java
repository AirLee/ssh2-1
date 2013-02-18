package org.hanfeng.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Reserve entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "reserve", catalog = "studentinfo")
public class Reserve extends AbstractReserve implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 2192903699370102677L;

	/** default constructor */
	public Reserve() {
	}

	/** full constructor */
	public Reserve(ReserveId id, Course course, Student student) {
		super(id, course, student);
	}

}
