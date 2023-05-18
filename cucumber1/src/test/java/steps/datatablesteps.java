package steps;

import java.util.List;
import java.util.Map;



import io.cucumber.java.en.And;

public class datatablesteps {

@And("user enters firstname and lastname")
public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
	
	for(Map<String,String> data: dataTable.asMaps(String.class, String.class)) {
		
		
		System.out.println("FirstName is : "+data.get("FirstName")+" LastName is : "+data.get("LastName"));
	}
	
	
	/*
	List<Map<String, String>> map = dataTable.asMaps();
	
	System.out.println(map.get(0).get("FirstName")+"---LastName is "+map.get(0).get("LastName"));
	System.out.println(map.get(1).get("FirstName")+"---LastName is "+map.get(1).get("LastName"));
	
	*/
    /*
	List<List<String>> data = dataTable.asLists();
	
	System.out.println("First Name is : "+data.get(0).get(0)+" Last Name is : "+data.get(0).get(1));
	System.out.println("First Name is : "+data.get(1).get(0)+" Last Name is : "+data.get(1).get(1));
}
*/
}
}
