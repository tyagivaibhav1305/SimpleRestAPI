package Model;

public class Application {
	String related_offer;
	String candidate_email;
	String resume_text;
	enum applicationStatus {APPLIED, INVITED, REJECTED, HIRED}
	public String getRelated_offer() {
		return related_offer;
	}
	public void setRelated_offer(String related_offer) {
		this.related_offer = related_offer;
	}
	public String getCandidate_email() {
		return candidate_email;
	}
	public void setCandidate_email(String candidate_email) {
		this.candidate_email = candidate_email;
	}
	public String getResume_text() {
		return resume_text;
	}
	public void setResume_text(String resume_text) {
		this.resume_text = resume_text;
	}
	public Application(String related_offer, String candidate_email, String resume_text) {
		super();
		this.related_offer = related_offer;
		this.candidate_email = candidate_email;
		this.resume_text = resume_text;
	};
}
