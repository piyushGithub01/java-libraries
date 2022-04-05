package com.pi.mobile.advance;

import org.assertj.core.api.AbstractAssert;

import com.pi.mobile.TechGiant;

public class MobileCustomAssert extends AbstractAssert<MobileCustomAssert, TechGiant>{
	
	public MobileCustomAssert(final TechGiant actualTechGiant) {
		super(actualTechGiant, MobileCustomAssert.class);
	}
	
	//this provides entry point to your custom assert
	public static MobileCustomAssert assertThat(final TechGiant actualTechGiant) {
		return new MobileCustomAssert(actualTechGiant);
	}
	
	public MobileCustomAssert hasMarketCapSize(final Integer expectedMarketCapSize) {
		isNotNull();
		final String errorMessage = "\nExcepted market size to be <%d> but was <%d>";
		final int actualMarketCap = actual.getMarketCap();
		if(actualMarketCap != expectedMarketCapSize) {
			failWithMessage(errorMessage, expectedMarketCapSize, actualMarketCap);
		}
		return myself;
	}
	
	public MobileCustomAssert hasLoyaltyProgram(final String expectedLoyaltyProgram) {
		isNotNull();
		final String errorMessage = "\nExcepted loyalty program to be <%s> but was <%s>";
		final String actualLoyaltyProgram = actual.getLoyaltyProgram();
		if(actualLoyaltyProgram == null || !actualLoyaltyProgram.equals(expectedLoyaltyProgram)) {
			failWithMessage(errorMessage, expectedLoyaltyProgram, actualLoyaltyProgram);
		}
		return myself;
	}
	
}
