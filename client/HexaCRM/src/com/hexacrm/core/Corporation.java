package com.hexacrm.core;

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

public class Corporation {
	
	private java.lang.String obj;
	private int idCorporation;
    private java.lang.String name;
    private java.lang.String contact;
    private java.lang.String corpName;
    private java.lang.String cnpj;
    
    public Corporation() {
    	
    	this.obj = "corporation";
    	this.idCorporation = 0;
    	this.name = "";
    	this.contact = "";
    	this.corpName = "";
    	this.cnpj = "";
    	
    }
    
    public java.lang.String getObj() {
		
		return this.obj;
		
	}

	public int getIdCorporation() {
		
		return this.idCorporation;
		
	}

	public void setIdCorporation(int idCorporation) {
		
		this.idCorporation = idCorporation;
		
	}

	public java.lang.String getName() {
		
		return this.name;
		
	}

	public void setName(java.lang.String name) {
		
		this.name = name;
		
	}

	public java.lang.String getContact() {
		
		return this.contact;
		
	}

	public void setContact(java.lang.String contact) {
		
		this.contact = contact;
		
	}

	public java.lang.String getCorpName() {
		
		return this.corpName;
		
	}

	public void setCorpName(java.lang.String corpName) {
		
		this.corpName = corpName;
		
	}

	public java.lang.String getCnpj() {
		
		return this.cnpj;
		
	}

	public void setCnpj(java.lang.String cnpj) {
		
		this.cnpj = cnpj;
		
	}

}
