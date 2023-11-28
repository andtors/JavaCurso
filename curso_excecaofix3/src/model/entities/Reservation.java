package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		if (!checkOut.after(checkIn)) {
			/*Se a data de checkOut não for posterior a data de checkIn irá aparecer a seguinte mensagem*/
			throw new DomainException("Error reservation: Check-out date must be after check-in date");
		}
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
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		//Estamos puxando a data de agora para comparar com as datas do checkIn e checkOut abaixo
		if(checkIn.before(now) || checkOut.before(now)) {
			/*Se o checkIn for antes de hoje (now) e (||) checkOut antes de hoje (now) irá aparecer a seguinte mensagem de erro:*/
			throw new DomainException("Error in reservation: Reservation dates for updates must be future dates");
			//O texto que colocamos aqui será o que vai ser salvo na variavel String msg em DomainException
			//IllegalArgumentException é uma exceção para dizer que o nosso argumento (linha 40) não é verdadeiro
		}
		if (!checkOut.after(checkIn)) {
			/*Se a data de checkOut não for posterior a data de checkIn irá aparecer a seguinte mensagem*/
			throw new DomainException("Error reservation: Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		//usamos o this para dizer que o checkin e checkout que inputamos no programa vão ser sobrescritos pelo que está já armazenado anteriormente
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
