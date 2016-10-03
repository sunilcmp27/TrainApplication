package in.co.irctc;

public class Ticket {
	
	private String pnrNo;
	private String ticketNo;
	private String status;
	
	public Ticket() {
	
	}

	public Ticket(String pnrNo, String ticketNo, String status) {
		this.pnrNo = pnrNo;
		this.ticketNo = ticketNo;
		this.status = status;
	}

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
