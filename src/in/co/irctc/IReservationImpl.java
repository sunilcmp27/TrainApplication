package in.co.irctc;

public class IReservationImpl  implements IReservation{

	public Ticket bookTicket(PassengerInfo[] pInfo, JourneyInfo jInfo) {
		Ticket ticket=null;

		pInfo=new PassengerInfo[6];
		ticket=new Ticket();
		if(pInfo!=null && pInfo.length!=0)
		{
			for(int i=0; i<pInfo.length;i++)
			{
				ticket.setTicketNo(jInfo.getSource()+"-"+jInfo.getDest()+"_"+System.currentTimeMillis());
				ticket.setPnrNo("PNR"+System.currentTimeMillis());
				ticket.setStatus("CNF");
			}
		}	
		return ticket;
	}


}
