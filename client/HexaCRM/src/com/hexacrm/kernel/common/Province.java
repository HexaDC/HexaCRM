package com.hexacrm.kernel.common;

/**
 * HexaDC © COPYRIGHT NOTICE
 * 
 * This class is disponibilized as a part of the HexaDC's systems. 
 * All other kind of use out of the range of these company is prohibited.
 * 
 * @author William Oliveira
 * 
 * @version Benetnasch
 * 
 */

public class Province {
	
	private java.lang.String obj;
	private int idProvince;
	private java.lang.String uf;
	private java.lang.String province;
	
	public Province() {
		
		this.obj = "province";
		this.idProvince = 0;
		this.uf = "";
		this.province = "";
		
	}
	
	public java.lang.String getObj() {
		
		return this.obj;
		
	}

	public int getIdProvince() {
		
		return this.idProvince;
		
	}

	public void setIdProvince(int idProvince) {
		
		this.idProvince = idProvince;
		
	}
	
	public java.lang.String getUf() {
		
		return this.uf;
		
	}

	public void setUf(java.lang.String uf) {
		
		this.uf = uf;
		
	}

	public java.lang.String getProvince() {
		
		return this.province;
		
	}

	public void setProvince(java.lang.String province) {
		
		this.province = province;
		
	}

}
