package com.pi.mobile.iterable;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.assertj.core.api.iterable.Extractor;
import org.junit.Test;

import com.pi.mobile.MobileSeller;
import com.pi.mobile.TechGiant;

public class ExtractedPropertiesTest {
	
	private final MobileSeller mobileSeller = new MobileSeller();
	
	@Test
	public void allSellerAreFound() {
		final List<TechGiant> techGiants = mobileSeller.lookupAllTechGiants();
		assertThat(techGiants).extracting("name").contains("Apple Corporation","One Plus","Oppo India","Vivo Corporation","Samsung Corporation");
	}
	
	@Test
	public void allSellingStationsAreFound() {
		final List<TechGiant> techGiants = mobileSeller.lookupAllTechGiants();
		
		assertThat(techGiants)
		.flatExtracting("sellingStations")
		.contains("NewYork","London","Mumbai","Tokyo","Bangalore","Delhi");
		
		assertThat(techGiants)
		.flatExtracting(new SellingStationExtractor())
		.contains("NewYork","London","Mumbai","Tokyo","Bangalore","Delhi");
	}
	
	class SellingStationExtractor implements Extractor<TechGiant, List<String>> {
		@Override
		public List<String> extract(final TechGiant giant) {
			try {
				return giant.sellingStations();
			} catch (final Throwable e) {
				return new ArrayList<String>();
			}
		}
	}

}
