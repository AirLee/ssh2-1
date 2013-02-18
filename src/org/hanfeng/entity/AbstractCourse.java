package org.hanfeng.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * AbstractCourse entity provides the base persistence definition of the Course
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractCourse implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7576207800477894871L;
	private Integer CId;
	private String CName;
	private String CType;
	private Set<Reserve> reserves = new HashSet<Reserve>(0);

	// Constructors

	/** default constructor */
	public AbstractCourse() {
	}

	/** full constructor */
	public AbstractCourse(String CName, String CType, Set<Reserve> reserves) {
		this.CName = CName;
		this.CType = CType;
		this.reserves = reserves;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "c_id", unique = true, nullable = false)
	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	@Column(name = "c_name", length = 40)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "c_type", length = 10)
	public String getCType() {
		return this.CType;
	}

	public void setCType(String CType) {
		this.CType = CType;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "course")
	public Set<Reserve> getReserves() {
		return this.reserves;
	}

	public void setReserves(Set<Reserve> reserves) {
		this.reserves = reserves;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CId == null) ? 0 : CId.hashCode());
		result = prime * result + ((CName == null) ? 0 : CName.hashCode());
		result = prime * result + ((CType == null) ? 0 : CType.hashCode());
		result = prime * result
				+ ((reserves == null) ? 0 : reserves.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractCourse other = (AbstractCourse) obj;
		if (CId == null) {
			if (other.CId != null)
				return false;
		} else if (!CId.equals(other.CId))
			return false;
		if (CName == null) {
			if (other.CName != null)
				return false;
		} else if (!CName.equals(other.CName))
			return false;
		if (CType == null) {
			if (other.CType != null)
				return false;
		} else if (!CType.equals(other.CType))
			return false;
		if (reserves == null) {
			if (other.reserves != null)
				return false;
		} else if (!reserves.equals(other.reserves))
			return false;
		return true;
	}

}