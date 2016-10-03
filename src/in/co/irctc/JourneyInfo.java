package in.co.irctc;

import java.util.Date;

public class JourneyInfo {
	
	private String source;
	private String dest;
	private Date jDate;
	
	public JourneyInfo() {
	
	}

	public JourneyInfo(String source, String dest, Date jDate) {
		super();
		this.source = source;
		this.dest = dest;
		this.jDate = jDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Date getjDate() {
		return jDate;
	}

	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}
	
}
