package test_lion_models;

import java.util.UUID;

import org.npc.models.TenderEntry;
import org.npc.models.repositories.TenderEntryRepository;

public class TenderEntryTest {
	
	public static void main(String[] args) {
		
		TenderEntry data1 = new TenderEntry();
		data1.settransID(UUID.fromString("35fcd2dd-1fbd-473a-998b-c91ea1a93da7"));
		data1.settendertype("cash");
		data1.setamount(18.88);
		data1.save();
		
		TenderEntry inputData = (new TenderEntryRepository().
				get(UUID.fromString("5a00eacf-5bbc-4f11-8e3e-6cb792db6d75")));
		System.out.println("TenderEntry ID: " + inputData.getId().toString());
		System.out.println("TenderType: " + inputData.gettendertype());
		System.out.println("Amount: " + inputData.getamount());
		System.out.println("Created On: " + inputData.getCreatedOn());
	}
	
}
