package Model;
import java.util.Date;
public class Offers {
	private String jobTitle;
	private int offerId;
	public Offers()
	{
		
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	private Date startDate;
	private int numberOfApplications;
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getNumberOfApplications() {
		return numberOfApplications;
	}
	public void setNumberOfApplications(int numberOfApplications) {
		this.numberOfApplications = numberOfApplications;
	}
	public Offers(String jobTitle, int offerId, Date startDate, int numberOfApplications) {
		super();
		this.jobTitle = jobTitle;
		this.offerId = offerId;
		this.startDate = startDate;
		this.numberOfApplications = numberOfApplications;
	}
	
	
}
