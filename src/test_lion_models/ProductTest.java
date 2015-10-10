package producttest;

import java.util.UUID;

import org.npc.models.Product;
import org.npc.models.repositories.ProductRepository;

public class ProductTest {

	public static void main(String[] args) {

		Product varName = new Product();		
		varName.setDescription("Prod 00 Desc");
		varName.setItemLookupCode("Prod 00");
		varName.setPrice(2200);
		varName.setItemType(0);
		varName.setCost(1844);
		varName.setQuantity(1000);
		varName.setReorderPoint(500);
		varName.setRestockLevel(1500);
		varName.setExtendedDescription("Product Number 00");
		varName.setInactive(true);
		varName.setMSRP(2500);		
		varName.save();

		Product varName01 = new Product();		
		varName01.setDescription("Prod 01 Desc");
		varName01.setItemLookupCode("Prod 01");
		varName01.setPrice(33);
		varName01.setItemType(0);
		varName01.setCost(22);
		varName01.setQuantity(6);
		varName01.setReorderPoint(5);
		varName01.setRestockLevel(12);
		// you have to put a valid UUID from your database for the parent item.
		varName01.setParentItem(UUID.fromString("94f170a7-75d3-43bf-877f-8268a2ac02e1"));
		varName01.setExtendedDescription("Product Number 01");
		varName01.setInactive(false);
		varName01.setMSRP(34);		
		varName01.save();
		
		Product varName02 = new Product();		
		varName02.setDescription("Prod 02 Desc");
		varName02.setItemLookupCode("Prod 02");
		varName02.setPrice(33);
		varName02.setItemType(0);
		varName02.setCost(22);
		varName02.setQuantity(6);
		varName02.setReorderPoint(5);
		varName02.setRestockLevel(12);
		// you have to put a valid UUID from your database for the parent item.
		varName02.setParentItem(UUID.fromString("94f170a7-75d3-43bf-877f-8268a2ac02e1"));
		varName02.setExtendedDescription("Product Number 02");
		varName02.setInactive(false);
		varName02.setMSRP(34);		
		varName02.save();
		
		//Getting info from table
		Product inputProduct = (new ProductRepository()).get((UUID.fromString("57551c8d-160f-47d7-acd8-b01c4026d6eb")));
				
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
				
	}
}
