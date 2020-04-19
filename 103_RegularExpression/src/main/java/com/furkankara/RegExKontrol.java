package com.furkankara;

public class RegExKontrol {
	private String regEx;
	private String regExSonuc;
	
	@Override
	public String toString() {
		return "\nGirdiginiz e-posta adresi"+getRegExSonuc();
	}
	public String getRegEx() {
		return regEx;
	}
	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}
	public String getRegExSonuc() {
		return regExSonuc;
	}
	public void setRegExSonuc(String regExSonuc) {
		this.regExSonuc = regExSonuc;
	}
	
	
}
