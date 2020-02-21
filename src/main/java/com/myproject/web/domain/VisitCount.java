package com.myproject.web.domain;

public class VisitCount {
	private int visitCnt;
	private String visitIp;
	private String visitRefer;
	private String visitAgent;
	private String DateTime;

	public int getVisitCnt() {
		return this.visitCnt;
	}

	public String getVisitIp() {
		return this.visitIp;
	}

	public String getVisitRefer() {
		return this.visitRefer;
	}

	public String getVisitAgent() {
		return this.visitAgent;
	}

	public String getDateTime() {
		return this.DateTime;
	}

	public void setVisitCnt(int visitCnt) {
		this.visitCnt = visitCnt;
	}

	public void setVisitIp(String visitIp) {
		this.visitIp = visitIp;
	}

	public void setVisitRefer(String visitRefer) {
		this.visitRefer = visitRefer;
	}

	public void setVisitAgent(String visitAgent) {
		this.visitAgent = visitAgent;
	}

	public void setDateTime(String DateTime) {
		this.DateTime = DateTime;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof VisitCount))
			return false;
		VisitCount other = (VisitCount) o;
		if (!other.canEqual(this))
			return false;
		if (getVisitCnt() != other.getVisitCnt())
			return false;
		Object this$visitIp = getVisitIp();
		Object other$visitIp = other.getVisitIp();
		if (this$visitIp == null ? other$visitIp != null : !this$visitIp.equals(other$visitIp))
			return false;
		Object this$visitRefer = getVisitRefer();
		Object other$visitRefer = other.getVisitRefer();
		if (this$visitRefer == null ? other$visitRefer != null : !this$visitRefer.equals(other$visitRefer))
			return false;
		Object this$visitAgent = getVisitAgent();
		Object other$visitAgent = other.getVisitAgent();
		if (this$visitAgent == null ? other$visitAgent != null : !this$visitAgent.equals(other$visitAgent))
			return false;
		Object this$DateTime = getDateTime();
		Object other$DateTime = other.getDateTime();
		return this$DateTime == null ? other$DateTime == null : this$DateTime.equals(other$DateTime);
	}

	protected boolean canEqual(Object other) {
		return other instanceof VisitCount;
	}

	public int hashCode() {
		int PRIME = 59;
		int result = 1;
		result = result * 59 + getVisitCnt();
		Object $visitIp = getVisitIp();
		result = result * 59 + ($visitIp == null ? 43 : $visitIp.hashCode());
		Object $visitRefer = getVisitRefer();
		result = result * 59 + ($visitRefer == null ? 43 : $visitRefer.hashCode());
		Object $visitAgent = getVisitAgent();
		result = result * 59 + ($visitAgent == null ? 43 : $visitAgent.hashCode());
		Object $DateTime = getDateTime();
		result = result * 59 + ($DateTime == null ? 43 : $DateTime.hashCode());
		return result;
	}

	public String toString() {
		return "VisitCount(visitCnt=" + getVisitCnt() + ", visitIp=" + getVisitIp() + ", visitRefer=" + getVisitRefer()
				+ ", visitAgent=" + getVisitAgent() + ", DateTime=" + getDateTime() + ")";
	}

}