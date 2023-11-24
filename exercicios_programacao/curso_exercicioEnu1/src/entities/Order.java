package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	public Order () {
		
	}
	
	private OrdemItem ordemItem;
	private Product product;
	private Client client;
	
	private List<OrdemItem> products = new ArrayList<>();

	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public OrdemItem getOrdemItem() {
		return ordemItem;
	}
	public void setOrdemItem(OrdemItem ordemItem) {
		this.ordemItem = ordemItem;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrdemItem> getProducts() {
		return products;
	}
	public Order(Date moment, OrderStatus status, OrdemItem ordemItem, Product product, Client client) {
		this.moment = moment;
		this.status = status;
		this.ordemItem = ordemItem;
		this.product = product;
		this.client = client;
	}
	
	public void addProduct(OrdemItem product) {
		products.add(product);
	}
	public void removeProduct(OrdemItem product) {
		products.remove(product);
	}
	
	public double total() {
		double sumTotal = 0;
		for (OrdemItem p : products) {
			sumTotal += p.subTotal();
		}
		return sumTotal;		
	}
	
	
	
}
