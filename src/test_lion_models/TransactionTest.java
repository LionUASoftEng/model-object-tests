package test_lion_models;

import java.util.UUID;

import org.npc.models.Transaction;
import org.npc.models.repositories.TransactionRepository;


public class TransactionTest {

	public static void main(String[] args) {
		
		Transaction aTransaction = new Transaction();
		aTransaction.setCashierId((UUID.fromString("fd6c0fce-9090-470b-9993-2c9ed8ec22fa")));
		aTransaction.SetTransactionType("sale");
		aTransaction.setParentid(UUID.fromString("d4ebd1d9-244f-4f51-8e2c-bf0fb3b5186e"));
		aTransaction.setAmount(18.88);
		aTransaction.save();
		
		Transaction bTransaction = new Transaction();
		bTransaction.setCashierId((UUID.fromString("0748eaad-96d7-41a9-8349-a5c3c15596a6")));
		bTransaction.SetTransactionType("return");
		bTransaction.setParentid(UUID.fromString("35d2e979-9fa7-4a1f-866c-5d26c3e19d1c"));
		bTransaction.setAmount(11.00);
		
		Transaction inputTransaction = (new TransactionRepository()).
				get(UUID.fromString("35fcd2dd-1fbd-473a-998b-c91ea1a93da7"));
		
		System.out.println("Transaction ID: " + inputTransaction.getId().toString());
		System.out.println("Cashier ID: " + inputTransaction.getCashierid());
		System.out.println("Transaction amount: " + inputTransaction.getAmount());
		System.out.println("Transaction type: " + inputTransaction.getTransactionType());
		System.out.println("ParentID: " + inputTransaction.getParentid());
		System.out.println("Transaction Date: " + inputTransaction.getTransactionDate());
	}
}
