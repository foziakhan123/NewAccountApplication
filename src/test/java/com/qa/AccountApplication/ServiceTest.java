package com.qa.AccountApplication;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ServiceTest {
	
	@Test
	public void ServiceTest() {
		
		Service serviceclass = new Service();
		
		serviceclass.addanaccount("fozia", "khan", "1234");
		
		
		Assert.assertEquals(1, serviceclass.findfirstname("fozia"));
		
		
		
	}
	
	

}
