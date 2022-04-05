package com.pi.mobile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechGiant {
	
	private String name;
	private String internationalPlayer;
	private String website;
	private String country;
	private int marketCap;
	private String loyaltyProgram;
	
	private static Map<String, String> latestDevice = new HashMap<>();
	
	static {
		latestDevice.put("Apple Corporation", "iPhone13");
		latestDevice.put("One Plus", "OnePlus10T");
		latestDevice.put("Oppo India", "OppoA53");
		latestDevice.put("Vivo Corporation", "Mi12");
		latestDevice.put("Samsung Corporation", "Smart11");
	}
	
	public TechGiant(final String name) {
		this.name = name;
	}

	public TechGiant(String name, String internationalPlayer, String website, String country, int marketCap,
			String loyaltyProgram) {
		super();
		this.name = name;
		this.internationalPlayer = internationalPlayer;
		this.website = website;
		this.country = country;
		this.marketCap = marketCap;
		this.loyaltyProgram = loyaltyProgram;
	}
	
	public String latestDevice() {
		return latestDevice.get(name);
	}
	
	public List<String> getSellingStations() throws Throwable {
		return sellingStations();
	}
	
	public List<String> sellingStations() throws Throwable{
		return new MobileSellingStations().lookupSellingStationForTechGiant(name);
	}

	public String getName() {
		return name;
	}

	public String getInternationalPlayer() {
		return internationalPlayer;
	}

	public String getWebsite() {
		return website;
	}

	public String getCountry() {
		return country;
	}

	public int getMarketCap() {
		return marketCap;
	}

	public String getLoyaltyProgram() {
		return loyaltyProgram;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInternationalPlayer(String internationalPlayer) {
		this.internationalPlayer = internationalPlayer;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setMarketCap(int marketCap) {
		this.marketCap = marketCap;
	}

	public void setLoyaltyProgram(String loyaltyProgram) {
		this.loyaltyProgram = loyaltyProgram;
	}

	@Override
	public String toString() {
		return "TechGiant [name=" + name + "]";
	}
	
}
