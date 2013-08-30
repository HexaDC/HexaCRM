package com.hexacrm.kernel.core;

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

public class Customer {
	
	private java.lang.String obj;
	private long idCustomer;
	private long idProvince;
    private java.lang.String site;
    private java.lang.String email;
    private java.lang.String name;
    private java.lang.String phone1;
    private java.lang.String phone2;
    private java.lang.String contact;
    private java.lang.String address;
    private java.lang.String homeNumber;
    private java.lang.String district;
    private java.lang.String city;
    private java.lang.String postalCode;
    
    public Customer() {
    	
    	this.obj = "customer";
    	this.idCustomer = 0l;
    	this.idProvince = 0l;
    	this.site = "";
    	this.email = "";
    	this.name = "";
    	this.phone1 = "";
    	this.phone2 = "";
    	this.contact = "";
    	this.address = "";
    	this.homeNumber = "";
    	this.district = "";
    	this.city = "";
    	this.postalCode = "";
    	
    }
    
    public java.lang.String getObj() {
		
		return this.obj;
		
	}

	public long getIdCustomer() {
		
		return this.idCustomer;
		
	}

	public void setIdCustomer(long idCustomer) {
		
		this.idCustomer = idCustomer;
		
	}
	
	public long getIdProvince() {
		
		return this.idProvince;
		
	}

	public void setIdProvince(long idProvince) {
		
		this.idProvince = idProvince;
		
	}

	public java.lang.String getSite() {
		
		return this.site;
		
	}

	public void setSite(java.lang.String site) {
		
		this.site = site;
		
	}

	public java.lang.String getEmail() {
		
		return this.email;
		
	}

	public void setEmail(java.lang.String email) {
		
		this.email = email;
		
	}

	public java.lang.String getName() {
		
		return this.name;
		
	}

	public void setName(java.lang.String name) {
		
		this.name = name;
		
	}

	public java.lang.String getPhone1() {
		
		return this.phone1;
		
	}

	public void setPhone1(java.lang.String phone1) {
		
		this.phone1 = phone1;
		
	}

	public java.lang.String getPhone2() {
		
		return this.phone2;
		
	}

	public void setPhone2(java.lang.String phone2) {
		
		this.phone2 = phone2;
		
	}

	public java.lang.String getContact() {
		
		return this.contact;
		
	}

	public void setContact(java.lang.String contact) {
		
		this.contact = contact;
		
	}

	public java.lang.String getAddress() {
		
		return this.address;
		
	}

	public void setAddress(java.lang.String address) {
		
		this.address = address;
		
	}

	public java.lang.String getHomeNumber() {
		
		return this.homeNumber;
		
	}

	public void setHomeNumber(java.lang.String homeNumber) {
		
		this.homeNumber = homeNumber;
		
	}

	public java.lang.String getDistrict() {
		
		return this.district;
		
	}

	public void setDistrict(java.lang.String district) {
		
		this.district = district;
		
	}

	public java.lang.String getCity() {
		
		return this.city;
		
	}

	public void setCity(java.lang.String city) {
		
		this.city = city;
		
	}

	public java.lang.String getPostalCode() {
		
		return this.postalCode;
		
	}

	public void setPostalCode(java.lang.String postalCode) {
		
		this.postalCode = postalCode;
		
	}

}
