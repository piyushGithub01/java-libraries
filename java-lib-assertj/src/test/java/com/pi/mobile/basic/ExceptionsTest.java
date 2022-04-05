package com.pi.mobile.basic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.Test;

import com.pi.mobile.SellingStationNotFoundException;
import com.pi.mobile.TechGiant;

public class ExceptionsTest {
	
	private final TechGiant mi = new TechGiant("Mi", "NO", "www.mi.com", "INDIA", 5, "None");

	@Test
	public void techGiantWithNoSellingStation() {
		assertThatExceptionOfType(SellingStationNotFoundException.class)
		.isThrownBy(() -> {
			mi.sellingStations();
		})
		.withMessage("Selling station could not be found for TechGiant Mi")
		.withCauseExactlyInstanceOf(Exception.class)
		.withStackTraceContaining("SellingStationNotFoundException");
	}
	
	@Test
	public void techGiantWithNoSellingStationBDDStyle() {
		final Throwable expectedException = catchThrowable(() -> {
			mi.sellingStations();
		});
		assertThat(expectedException)
		.isInstanceOf(SellingStationNotFoundException.class)
		.hasMessage("Selling station could not be found for TechGiant Mi")
		.hasCauseExactlyInstanceOf(Exception.class)
		.hasStackTraceContaining("SellingStationNotFoundException");
	}
}
