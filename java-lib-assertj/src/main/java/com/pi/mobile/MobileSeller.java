package com.pi.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileSeller {
	
	private static Map<String, TechGiant> sellers = new HashMap<>();
	//String name, String internationalPlayer, String website, String country, int marketCap,	String loyaltyProgram
	static {
		sellers.put("Apple Corporation", new TechGiant("Apple Corporation", "YES", "www.app.com", "USA", 40, "AppFamily"));
		sellers.put("One Plus", new TechGiant("One Plus", "YES", "www.onep.com", "KOREA", 30, "onePriviledge"));
		sellers.put("Oppo India", new TechGiant("Oppo India", "NO", "www.opp.com", "INDIA", 10, "OppoHi"));
		sellers.put("Vivo Corporation", new TechGiant("Vivo Corporation", "NO", "www.vivoo.com", "INDIA", 5, "VivFamily"));
		sellers.put("Samsung Corporation", new TechGiant("Samsung Corporation", "YES", "www.sam.com", "KOREA", 40, "SamGroup"));
	}
	
	public TechGiant lookupTechGiant(final String name) {
		return sellers.get(name);
	}
	
	public List<TechGiant> lookupAllTechGiants() {
		final ArrayList<TechGiant> allTechGiants = new ArrayList<>();
		allTechGiants.addAll(sellers.values());
		return allTechGiants;
	}

}
