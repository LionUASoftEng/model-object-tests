package test_lion_models;

import java.util.UUID;

import org.npc.models.Product;
import org.npc.models.repositories.ProductRepository;

public class ProductTest {

	public static void main(String[] args) {

		Product varName = new Product();		
		varName.setDescription("Prod 60 Desc");
		varName.setItemLookupCode("Prod 60");
		varName.setPrice(60.00);
		varName.setItemType(0);
		varName.setCost(32.50);
		varName.setQuantity(19);
		varName.setReorderPoint(12);
		varName.setRestockLevel(24);
		varName.setExtendedDescription("Product Number 60");
		varName.setInactive(true);
		varName.setMSRP(85.96);		
		varName.save();

		Product varName01 = new Product();		
		varName01.setDescription("Prod 61 Desc");
		varName01.setItemLookupCode("Prod 61");
		varName01.setPrice(5.97);
		varName01.setItemType(1);
		varName01.setCost(3.50);
		varName01.setQuantity(35);
		varName01.setReorderPoint(24);
		varName01.setRestockLevel(48);
		// you have to put a valid UUID from your database for the parent item.
		varName01.setParentItem(UUID.fromString("94f170a7-75d3-43bf-877f-8268a2ac02e1"));
		varName01.setExtendedDescription("Product Number 61");
		varName01.setInactive(false);
		varName01.setMSRP(10.00);		
		varName01.save();
		
		Product varName02 = new Product();		
		varName02.setDescription("Prod 62 Desc");
		varName02.setItemLookupCode("Prod 62");
		varName02.setPrice(9.99);
		varName02.setItemType(0);
		varName02.setCost(6.00);
		varName02.setQuantity(10);
		varName02.setReorderPoint(5);
		varName02.setRestockLevel(18);
		// you have to put a valid UUID from your database for the parent item.
		varName02.setParentItem(UUID.fromString("94f170a7-75d3-43bf-877f-8268a2ac02e1"));
		varName02.setExtendedDescription("Product Number 62");
		varName02.setInactive(false);
		varName02.setMSRP(15.00);		
		varName02.save();
	
		//Getting info from table
		Product inputProduct = (new ProductRepository()).byItemLookupCode("Prod 20");
		
		System.out.println("Product ID: " + inputProduct.getId().toString());
		System.out.println("Description: " + inputProduct.getDescription());
		System.out.println("ItemLookupCode: " + inputProduct.getItemLookupCode());
		System.out.println("Price: " + inputProduct.getPrice());
		System.out.println("ItemType: " + inputProduct.getItemType());
		System.out.println("Cost: " + inputProduct.getCost());
		System.out.println("Quantity: " + inputProduct.getQuantity());
		System.out.println("ReorderPoint: " + inputProduct.getReorderPoint());
		System.out.println("RestockLevel: " + inputProduct.getRestockLevel());
		System.out.println("ParentItem: " + inputProduct.getParentItem());
		System.out.println("ExtendedDescription: " + inputProduct.getExtendedDescription());
		System.out.println("Inactive: " + inputProduct.getInactive());
		System.out.println("MSRP: " + inputProduct.getMSRP());
		System.out.println("Date Created: " + inputProduct.getDateCreated());
				
	}
}
