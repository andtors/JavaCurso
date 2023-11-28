package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		//Estamos puxando a data de agora para comparar com as datas do checkIn e checkOut abaixo
		if(checkIn.before(now) || checkOut.before(now)) {
			/*Se o checkIn for antes de hoje (now) e (||) checkOut antes de hoje (now) irá aparecer a seguinte mensagem de erro:*/
			return "Error in reservation: Reservation dates for updates must be future dates";
		}
		if (!checkOut.after(checkIn)) {
			/*Se a data de checkOut não for posterior a data de checkIn irá aparecer a seguinte mensagem*/
			return "Error reservation: Check-out date must be after check-in date";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
		//se retornar nulo, é que tudo está ok
	}
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in "
				+ sdf.format(checkIn)
				+ ", check-out "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
}
