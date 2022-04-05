package com.pi.mobile.advance;

import static com.pi.mobile.advance.MobileCustomAssert.assertThat;
import org.junit.Test;

import com.pi.mobile.MobileSeller;
import com.pi.mobile.TechGiant;

public class MobileCutomAssertTest {
	
	@Test
	public void techGiantInformationCorret() {
		final TechGiant apple = new MobileSeller().lookupTechGiant("Apple Corporation");
		assertThat(apple)
		.hasLoyaltyProgram("AppFamily")
		.hasMarketCapSize(40);
	}

}
