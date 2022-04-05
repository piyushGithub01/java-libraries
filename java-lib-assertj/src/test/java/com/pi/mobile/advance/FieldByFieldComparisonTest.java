package com.pi.mobile.advance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.pi.mobile.MobileSeller;
import com.pi.mobile.TechGiant;

public class FieldByFieldComparisonTest {
	
	private final MobileSeller mobileSeller = new MobileSeller();
	
	@Test
	public void fieldByFiledComparison() {
		final TechGiant expectedApple = new TechGiant("Apple Corporation", "YES", "www.app.com", "USA", 40, "AppFamily");
		final TechGiant actualApple = mobileSeller.lookupTechGiant("Apple Corporation");
		assertThat(actualApple).isEqualToComparingFieldByField(expectedApple);
	}
	
	@Test
	public void fieldByFiledComparisonIgnoringNull() {
		final TechGiant expectedApple = new TechGiant("Apple Corporation", null, "www.app.com", null, 40, "AppFamily");
		final TechGiant actualApple = mobileSeller.lookupTechGiant("Apple Corporation");
		assertThat(actualApple).isEqualToIgnoringNullFields(expectedApple);
	}
	
	@Test
	public void fieldByFiledComparisonIgnoringGivenFields() {
		final TechGiant expectedApple = new TechGiant("Apple Corporation", "YES", "www.app.com", "USA", 40, "AppFamily");
		final TechGiant actualApple = mobileSeller.lookupTechGiant("Apple Corporation");
		assertThat(actualApple).isEqualToIgnoringGivenFields(expectedApple, "website");
	}

}
