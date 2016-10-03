package in.co.irctc.test;

import in.co.irctc.IReservation;
import in.co.irctc.IReservationImpl;
import in.co.irctc.JourneyInfo;
import in.co.irctc.PassengerInfo;
import in.co.irctc.Ticket;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		PassengerInfo pInfo1=new PassengerInfo();
		pInfo1.setFirstName("Sunil");
		pInfo1.setLastName("Kumar");
		pInfo1.setGender("M");
		pInfo1.setAge(23);
		
		PassengerInfo pInfo2=new PassengerInfo();
		pInfo2.setFirstName("Seema");
		pInfo2.setLastName("s");
		pInfo2.setGender("F");
		pInfo2.setAge(21);
		
		JourneyInfo jInfo=new JourneyInfo();
		jInfo.setSource("Banglore");
		jInfo.setDest("Hydrabad");
		jInfo.setjDate(new Date());
		
		IReservation res=new IReservationImpl();
		
		Ticket ticket=res.bookTicket(new PassengerInfo[] {pInfo1,pInfo2}, jInfo);
		System.out.println(ticket.getPnrNo());
		System.out.println(ticket.getTicketNo());
		System.out.println(ticket.getStatus());
		

	}

}
