package com.pi.mobile.iterable;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Condition;

import org.junit.Test;

import com.pi.mobile.MobileSeller;
import com.pi.mobile.TechGiant;

public class FilterPropertiesTest {
	
	final MobileSeller mobileSeller = new MobileSeller();
	final TechGiant apple = mobileSeller.lookupTechGiant("Apple Corporation");
	final TechGiant onePlus = mobileSeller.lookupTechGiant("One Plus");
	final TechGiant oppo = mobileSeller.lookupTechGiant("Oppo India");
	final TechGiant vivo = mobileSeller.lookupTechGiant("Vivo Corporation");
	final TechGiant samsung = mobileSeller.lookupTechGiant("Samsung Corporation");
	
	@Test
	public void findTechGiantWithCountryUSAPredicate() {
		assertThat(mobileSeller.lookupAllTechGiants())
		.filteredOn(techGiant -> techGiant.getCountry().equals("USA"))
		.containsOnly(apple)
		.doesNotContain(vivo);
	}
	
	@Test
	public void findTechGiantWithCountryUSAPropertyName() {
		assertThat(mobileSeller.lookupAllTechGiants())
		.filteredOn("country","USA")
		.containsOnly(apple)
		.doesNotContain(vivo);
	}
	
	@Test
	public void findTechGiantWithSmallCap() {
		final Condition<TechGiant> marketCap = new Condition<TechGiant>() {
			@Override
			public boolean matches(final TechGiant giant) {
				return giant.getMarketCap() < 8;
			}
		};
		assertThat(mobileSeller.lookupAllTechGiants()).filteredOn(marketCap).containsOnly(vivo);
	}
}
