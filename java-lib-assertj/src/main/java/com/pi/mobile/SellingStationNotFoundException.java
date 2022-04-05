package com.pi.mobile;

public class SellingStationNotFoundException extends Exception {
	
	private static final long serialVersionUID = 2L;
	
	public SellingStationNotFoundException(final String string, final Exception exception) {
		super(string, exception);
	}

}
