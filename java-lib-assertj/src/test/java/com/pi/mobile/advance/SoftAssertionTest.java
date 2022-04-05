package com.pi.mobile.advance;

import org.junit.Test;
import org.junit.Rule;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.JUnitSoftAssertions;

import com.pi.mobile.TechGiant;

public class SoftAssertionTest {
	
	final TechGiant apple = new TechGiant("Apple Corporation");
	final TechGiant onePlus = new TechGiant("One Plus");
	final TechGiant oppo = new TechGiant("Oppo India");
	final TechGiant vivo = new TechGiant("Vivo Corporation");
	final TechGiant samsung = new TechGiant("Samsung Corporation");
	
	@Test
	public void techGiantWithLatestDevide() {
		final SoftAssertions soft = new SoftAssertions();
		soft.assertThat(apple.latestDevice()).as("Apple Corporation").isEqualTo("iPhone13");
		soft.assertThat(onePlus.latestDevice()).as("One Plus").isEqualTo("OnePlus10T");
		soft.assertThat(oppo.latestDevice()).as("Oppo India").isEqualTo("OppoA53");
		soft.assertThat(vivo.latestDevice()).as("Vivo Corporation").isEqualTo("Mi12");
		soft.assertThat(samsung.latestDevice()).as("Samsung Corporation").isEqualTo("Smart11");
		soft.assertAll();
	}
	
	@Rule
	public final JUnitSoftAssertions softly = new JUnitSoftAssertions();
	
	@Test
	public void techGiantWithLatestDevide_usingJUnitRule() {
		softly.assertThat(apple.latestDevice()).as("Apple Corporation").isEqualTo("iPhone13");
		softly.assertThat(onePlus.latestDevice()).as("One Plus").isEqualTo("OnePlus10T");
		softly.assertThat(oppo.latestDevice()).as("Oppo India").isEqualTo("OppoA53");
		softly.assertThat(vivo.latestDevice()).as("Vivo Corporation").isEqualTo("Mi12");
		softly.assertThat(samsung.latestDevice()).as("Samsung Corporation").isEqualTo("Smart11");
	}

	@Test
	public void techGiantWithLatestDevide_usingJava8Rule() {
		SoftAssertions.assertSoftly( s -> {
			s.assertThat(apple.latestDevice()).as("Apple Corporation").isEqualTo("iPhone13");
			s.assertThat(onePlus.latestDevice()).as("One Plus").isEqualTo("OnePlus10T");
			s.assertThat(oppo.latestDevice()).as("Oppo India").isEqualTo("OppoA53");
			s.assertThat(vivo.latestDevice()).as("Vivo Corporation").isEqualTo("Mi12");
			s.assertThat(samsung.latestDevice()).as("Samsung Corporation").isEqualTo("Smart11");
		});
	}
}
