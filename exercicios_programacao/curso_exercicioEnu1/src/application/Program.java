package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc =  new Scanner (System.in);
		OrdemItem ordemitem = new OrdemItem();
		Product product = new Product ();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss");
		Order order = new Order ();
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/SYYYY): ");
		Date clientDate = sdf.parse(sc.next());
		Client client = new Client (clientName, clientEmail, clientDate);
		System.out.println("Enter order Data: ");
		System.out.printf("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
	
		
		System.out.printf("How many items to this order? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #" + i +" item data:");
			
			System.out.print("Product name: ");
			sc.next();
			String productName = sc.nextLine();
			System.out.printf("Product price:");
			Double productPrice = sc.nextDouble();
			product = new Product (productName, productPrice);
			System.out.printf("Quantity:");
			Integer productQuantity = sc.nextInt();
			ordemitem = new OrdemItem(productQuantity, productPrice);
			System.out.println(ordemitem.subTotal());
			order.addProduct(ordemitem);
		}
		
		System.out.println("ORDER SUMMARY:");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("Order moment: " + dtf.format(now));
		System.out.println("Order status: " + status);
		System.out.println(client.toString());
		System.out.println("Order items: " );
		System.out.println(product.toString() + ", $" + product.getPrice() + ", Quantity " + ordemitem.getQusantity() + ", Subtotal: $" + ordemitem.subTotal());
		System.out.println("Total price: $"+ order.total());
		
		
		
		
		sc.close();

	}

}
