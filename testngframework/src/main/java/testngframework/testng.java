package testngframework;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import io.cucumber.java.en.Given;

public class testng  {
	@Test(priority =0 )
	@Given("verify the set pripority")
	public void verify_the_set_pripority() {
	   
		System.out.println("test1"); 
	
	   
	}
    @Test(priority = 1,enabled =false )
	@Given("verify the skip test case")
	public void verify_the_skip_test_case() {
		   System.out.println("test2"); 
		  
	}
    @BeforeSuite
	@Given("verify the test suite")
	public void verify_the_test_suite() {
		   System.out.println("test3"); 
		   
	}
	@Test(dependsOnMethods ="verify_the_test_suite" )
	@Given("verify the handle dependencies")
	public void verify_the_handle_dependencies() {
		   System.out.println("test4"); 
		  
	}
   @Test(groups = {"lion"})
	@Given("verify the group testing")
	public void verify_the_group_testing() {
		   System.out.println("test1"); 
		   
		   
	}
    @Parameters("name")
	@Given("verify the prameterization test")
	public void verify_the_prameterization_test(String name) {
		   System.out.println(name); 
		   
	}

	@Given("verify the parallal test")
	public void verify_the_parallal_test() {
		   System.out.println("test6"); 
		  
	}

	@Given("verify the assertion test")
	public void verify_the_assertion_test() {
		   System.out.println("test7"); 
		   System.out.println("before ");
		 Assert.fail();

		 System.out.println("the");
		 SoftAssert soft= new SoftAssert();
		 soft.fail();
		 System.out.println("may");
	   
	}

	@Given("verify the annotion order")
	public void verify_the_annotion_order() {
		   System.out.println("test8"); 
		  
		   
		   
	}

	@Given("verify the listener")
	public void verify_the_listener() {
		   System.out.println("test9"); 
		  
	}
	
}
