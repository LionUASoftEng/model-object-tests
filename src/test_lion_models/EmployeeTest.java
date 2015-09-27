package test_lion_models;

import org.npc.dataaccess.model.BaseModel;
import org.npc.models.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee test = new Employee();
		test.setFirstName("Donald");
		test.setLastName("Trump");
		test.setEmployeeId("asdf123");
		test.setIsActive(true);
		test.setPassword("yourefired");
		test.setClassification("sm");
		
		test.save();
		
		Employee test1 = new Employee();
		test1.setFirstName("Bernie");
		test1.setLastName("Sanders");
		test1.setEmployeeId("1234567asdfgh");
		test1.setIsActive(true);
		test1.setPassword("feelthebern");
		test1.setClassification("gm");
		
		test1.save();
		
		Employee test2 = new Employee();
		test2.setFirstName("Hilldog");
		test2.setLastName("Clinton");
		test2.setEmployeeId("abc987");
		test2.setIsActive(true);
		test2.setPassword("bill");
		test2.setClassification("cash");
		
		test2.save();
		
//Not sure how to load a record from the db
//		Employee test3 = new Employee();
//		test3.load(rs);

	}

}
