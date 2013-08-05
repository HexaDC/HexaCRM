package com.hexacrm.access;

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

public class Privilege {
	
	private java.lang.String obj;
	private int idPrivilege;
	private java.lang.String type;
	
	public Privilege() {
		
		this.obj = "privilege";
		this.idPrivilege = 0;
		this.type = "";
		
	}
	
	public java.lang.String getObj() {
		
		return this.obj;
		
	}

	public int getIdPrivilege() {
		
		return this.idPrivilege;
		
	}

	public void setIdPrivilege(int idPrivilege) {
		
		this.idPrivilege = idPrivilege;
		
	}

	public java.lang.String getType() {
		
		return this.type;
		
	}

	public void setType(java.lang.String type) {
		
		this.type = type;
		
	}

}
