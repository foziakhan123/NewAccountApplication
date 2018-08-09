package com.qa.AccountApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;




		public class Service {
		private int newid=0;
		private HashMap<Integer, Account> accountmap = new HashMap<>();
		
		
		public HashMap<Integer, Account> getAccountmap() {
			return accountmap;
		}

		
		
		public void setAccountmap(HashMap<Integer, Account> accountmap) {
			this.accountmap = accountmap;
		}
		

		public void addanaccount(String firstname, String lastname, String accountnumber) {
			
			Account accountobject;
			accountobject = new Account(firstname, lastname, accountnumber);
						
			
			accountmap.put(newid, accountobject);
			
			
			newid++;
		
		}
		
		public void retrieveaccount (int id) {
			
		
			
			//System.out.println(accountmap.get(id).getFirstname());
			//System.out.println(accountmap.get(id).getLastname());
			//System.out.println(accountmap.get(id).getAccountnumber());
			
			
			
		}
		
		public int findfirstname(String name) {
			
			int count = 0;
			Iterator<Entry<Integer, Account>> it= accountmap.entrySet().iterator();
			
			while (it.hasNext()) {
				Entry<Integer, Account> entry = it.next();
				
			
				//System.out.println(entry.getValue().getFirstname());
				
			//	String name = "chris";
				
				
				if (name == entry.getValue().getFirstname()) {
					
					count++;
			
					} 
				
			}
			return count;
			
			
			
		}
		
		
		
			
		}
		
		
		
	


	


