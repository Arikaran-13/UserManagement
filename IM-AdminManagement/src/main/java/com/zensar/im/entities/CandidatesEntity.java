package com.zensar.im.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="candidates")
public class CandidatesEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="InterviewId")
	private int Id;
	private int candidateId;
	private int techRating;
	private String techComments;
	private int hrRating;
	private String hrComments;
	private String startTime;
	
	
	
	public CandidatesEntity(int interviewID, int candidateId, int techRating, String techComments, int hrRating,
			String hrComments, String startTime, String sts) {
		super();
		this.Id = interviewID;
		this.candidateId = candidateId;
		this.techRating = techRating;
		this.techComments = techComments;
		this.hrRating = hrRating;
		this.hrComments = hrComments;
		this.startTime = startTime;
		this.sts = sts;
	}
	@Override
	public String toString() {
		return "CandidatesEntity [interviewID=" + Id + ", candidateId=" + candidateId + ", techRating="
				+ techRating + ", techComments=" + techComments + ", hrRating=" + hrRating + ", hrComments="
				+ hrComments + ", startTime=" + startTime + ", sts=" + sts + "]";
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}
	@Column(name="status")
	private String sts;
	
	public String getHrComments() {
		return hrComments;
	}
	public void setHrComments(String hrComments) {
		this.hrComments = hrComments;
	}
	
	
	

	public int getCandidateId() {
		return candidateId;
	}
	
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getTechRating() {
		return techRating;
	}
	public void setTechRating(int techRating) {
		this.techRating = techRating;
	}   
	public String getTechComments() {
		return techComments;
	}
	public void setTechComments(String techComments) {
		this.techComments = techComments;
	}
	public int getHrRating() {
		return hrRating;
	}
	public void setHrRating(int hrRating) {
		this.hrRating = hrRating;
	}
	public String getStatus() {
		return sts;
	}
	public void setStatus(String status) {
		this.sts = status;
	}
	
	
	

}
