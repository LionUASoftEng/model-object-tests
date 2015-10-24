package test_lion_models;

import java.util.UUID;

import org.npc.models.TransactionEntry;
import org.npc.models.repositories.TransactionEntryRepository;

public class TransactionEntryTest {

	public static void main(String[] args) {
		
		TransactionEntry newEntry01 = new TransactionEntry();
		newEntry01.setTransactionId(UUID.fromString("35fcd2dd-1fbd-473a-998b-c91ea1a93da7"));
		newEntry01.setProductId(UUID.fromString("b47cef2e-c0be-4973-8079-2ad2a51b7697"));
		newEntry01.setPrice(8.88);
		newEntry01.setQuantity(2);
		newEntry01.save();
		
		//Getting info from table
		//TransactionEntry dataIn = (new TransactionEntryRepository().byTransactionId(UUID.fromString("03e978e9-4424-476b-bf43-38e88409b08a")));
		TransactionEntry dataIn = (new TransactionEntryRepository().get((UUID.fromString("0ba962fa-910b-415c-a44f-245165318ef4"))));
		System.out.println("TransactionEntry ID: " + dataIn.getId().toString());
		System.out.println("Transaction ID: " + dataIn.getTransactionId().toString());
		System.out.println("Product ID: " + dataIn.getProductId().toString());
		System.out.println("Price: " + dataIn.getPrice());
		System.out.println("Quantity: " + dataIn.getQuantity());
		
	}
}
