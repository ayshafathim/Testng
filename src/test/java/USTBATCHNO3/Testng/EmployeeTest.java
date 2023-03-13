package USTBATCHNO3.Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;
public class EmployeeTest {
	@Test
	public void testforEmployee()
	{
		Employee e=new Employee("Aysha",23,"IT");
		Assert.assertEquals(e.getName(),"Aysha");
	}
}