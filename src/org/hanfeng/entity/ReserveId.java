package org.hanfeng.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReserveId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ReserveId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8233412836735557945L;
	private Integer SId;
	private Integer CId;
	private Date startDate;

	// Constructors

	/** default constructor */
	public ReserveId() {
	}

	/** full constructor */
	public ReserveId(Integer SId, Integer CId, Date startDate) {
		this.SId = SId;
		this.CId = CId;
		this.startDate = startDate;
	}

	// Property accessors

	@Column(name = "s_id", nullable = false)
	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	@Column(name = "c_id", nullable = false)
	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	@Column(name = "start_date", nullable = false, length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReserveId))
			return false;
		ReserveId castOther = (ReserveId) other;

		return ((this.getSId() == castOther.getSId()) || (this.getSId() != null
				&& castOther.getSId() != null && this.getSId().equals(
				castOther.getSId())))
				&& ((this.getCId() == castOther.getCId()) || (this.getCId() != null
						&& castOther.getCId() != null && this.getCId().equals(
						castOther.getCId())))
				&& ((this.getStartDate() == castOther.getStartDate()) || (this
						.getStartDate() != null
						&& castOther.getStartDate() != null && this
						.getStartDate().equals(castOther.getStartDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSId() == null ? 0 : this.getSId().hashCode());
		result = 37 * result
				+ (getCId() == null ? 0 : this.getCId().hashCode());
		result = 37 * result
				+ (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		return result;
	}

}