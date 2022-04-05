package com.pi.mobile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileSellingStations {
	
	private static Map<String, List<String>> sellingStations = new HashMap<>();
	
//	sellers.put("Apple Corporation", new TechGiant("Apple Corporation", "YES", "www.app.com", "USA", 40, "AppFamily"));
//	sellers.put("One Plus", new TechGiant("One Plus", "YES", "www.onep.com", "KOREA", 30, "onePriviledge"));
//	sellers.put("Oppo India", new TechGiant("Oppo India", "NO", "www.opp.com", "INDIA", 10, "OppoHi"));
//	sellers.put("Vivo Corporation", new TechGiant("Vivo Corporation", "NO", "www.vivoo.com", "INDIA", 5, "VivFamily"));
//	sellers.put("Samsung Corporation", new TechGiant("Samsung Corporation", "YES", "www.sam.com", "KOREA", 40, "SamGroup"));
	
	static {
		sellingStations.put("Apple Corporation", Arrays.asList("NewYork","London","Mumbai","Tokyo"));
		sellingStations.put("One Plus", Arrays.asList("NewYork","London","Mumbai","Tokyo"));
		sellingStations.put("Oppo India", Arrays.asList("Mumbai","Bangalore"));
		sellingStations.put("Vivo Corporation", Arrays.asList("Mumbai","Delhi"));
		sellingStations.put("Samsung Corporation", Arrays.asList("Mumbai","Delhi","Bangalore"));
	}
	
	public List<String> lookupSellingStationForTechGiant(final String techGiantName) throws Throwable {
		final List<String> stations = sellingStations.get(techGiantName);
		if(stations == null) {
			throw new SellingStationNotFoundException("Selling station could not be found for TechGiant " + techGiantName, 
					new Exception());
		}
		return stations;
	}
}
