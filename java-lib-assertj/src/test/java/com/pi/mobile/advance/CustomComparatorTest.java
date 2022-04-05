package com.pi.mobile.advance;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Comparator;
import org.junit.Test;
import com.pi.mobile.MobileDevice;

public class CustomComparatorTest {
	
	PriceComparator priceComparator = new PriceComparator();
	
	@Test
	public void devicePrice() {
		final MobileDevice iPhone13 = new MobileDevice("Apple Corporation", "iPhone13", "60000");
		final MobileDevice onePlus10T = new MobileDevice("One Plus", "OnePlus10T", "60000");
		final MobileDevice oppoA53 = new MobileDevice("Oppo India", "OppoA53", "15000");
		
		assertThat(iPhone13).usingComparator(priceComparator).isEqualTo(onePlus10T);
		assertThat(iPhone13).usingComparator(priceComparator).isNotEqualTo(oppoA53);
	}

	class PriceComparator implements Comparator<MobileDevice> {
		@Override
		public int compare(final MobileDevice device1, final MobileDevice device2) {
			return device1.getPrice().compareTo(device2.getPrice());
		}
	}
}
