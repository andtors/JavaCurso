package entities.services;

public interface OnlinePaymentService {
	public Double paymentFee(Double amout);
	public Double interest(Double amount, Integer months);
	
}	

