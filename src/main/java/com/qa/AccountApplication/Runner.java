package com.qa.AccountApplication;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Runner {

	
	public static void main(String[] args) {
		
		Service printaccount = new Service();
		
		HashMap<Integer, Account> accountmap = printaccount.getAccountmap();

		
		printaccount.addanaccount("fozia", "khan", "1234");
		printaccount.addanaccount("chris", "perrins","1235");		
		printaccount.addanaccount("chris", "perrins","1235");
		printaccount.addanaccount("chris", "perrins","1235");
		printaccount.addanaccount("bob", "bin", "1243");
		
		
//		printaccount.retrieveaccount(1);
//		
//		GsonBuilder gsonMapBuilder = new GsonBuilder();
//		
//		Gson gsonObject = gsonMapBuilder.create();
//		String JSONObject = gsonObject.toJson(accountmap);
//		
//		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
//		
//		String prettyJson = prettyGson.toJson(accountmap);
//		System.out.println("\nPretty JSONObject ==> " + prettyJson);
		
		
		System.out.println(printaccount.findfirstname("chris"));
	
		

	}

}
