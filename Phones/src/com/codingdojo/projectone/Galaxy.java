package com.codingdojo.projectone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring() {
        // your code here
    	return "Galaxy ".concat(this.getVersionNumber().concat(" says ".concat(this.getRingTone())));
    }
    
    public String unlock() {
        // your code here
    	return "Unlocking via fingerprint";
    }
    
    public void displayInfo() {
        // your code here   
    	System.out.println("Galaxy ".concat(this.getVersionNumber().concat(" from ".concat(this.getCarrier()))));
    }
    
    public String getCarrier() {
		return "Test Carrier";
	}
}
