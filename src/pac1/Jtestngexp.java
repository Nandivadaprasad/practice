package pac1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Jtestngexp {

	@Test(dataProvider="TestFeed")
	public void prasad(String ename) {
		System.out.println("name : " +ename);
	}

	@Test(priority = 5)
	public void ex() {
		System.out.println("Table");
	}

	@Test(priority = 2)
	public void irasad() {
		System.out.println("Good");
	}

	@Test
	public void zex() {
		System.out.println("come to me");
	}

	@Test(priority = 1)
	public void rasad() {
		System.out.println("Run Again");
	}

	@Test(priority = 3)
	public void sad() {
		System.out.println("Run me");
	}

	@Test
	public void aad() {
		System.out.println("Run Run");
	}

	@Test(priority = 8)
	public void wrasad() {
		System.out.println("Run Again");
	}

	@BeforeClass
	public void xfy() {
		System.out.println("start");
	}

	@AfterClass
	public void jsrsyx() {
		System.out.println("End");
	}
	
	@DataProvider
	public Object[][] TestFeed(){
	
	Object ya[][]=new Object[1][1];
	ya[0][0]= "ram";
	ya[0][1]= "seeta";
	return ya;
			
	}
	

}
