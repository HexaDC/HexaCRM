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

public class User {
	
	private java.lang.String obj;
	private int idUser;
    private int idCorporation;
    private java.lang.String name;
    private java.lang.String username;
    private java.lang.String phone;
    private java.lang.String password;
    private java.lang.String access;
    private int type;
    private java.lang.String token;
    private java.lang.String userKey;
    
    public User() {
    	
    	this.obj = "user";
    	this.idUser = 0;
    	this.idCorporation = 0;
    	this.name = "";
    	this.username = "";
    	this.phone = "";
    	this.password = "";
    	this.access = "";
    	this.type = 0;
    	this.token = "";
    	this.userKey = "";
    	
    }
    
    public java.lang.String getObj() {
		
		return this.obj;
		
	}
    
    public int getIdUser()
    {
        
        return this.idUser;
        
    }
    
    public void setIdUser(int idUser)
    {
        
    	this.idUser = idUser;
        
    }
    
    public int getIdCorporation()
    {
        
        return this.idCorporation;
        
    }
    
    public void setIdCorporation(int idCorporation)
    {
        
    	this.idCorporation = idCorporation;
        
    }
    
    public java.lang.String getName()
    {
        
        return this.name;
        
    }
    
    public void setName(java.lang.String name)
    {
        
    	this.name = name;
        
    }
    
    public java.lang.String getUsername()
    {
        
        return this.username;
        
    }
    
    public void setUsername(java.lang.String username)
    {
        
    	this.username = username;
        
    }
    
    public java.lang.String getPhone()
    {
        
        return this.phone;
        
    }
    
    public void setPhone(java.lang.String phone)
    {
        
    	this.phone = phone;
        
    }
    
    public java.lang.String getPassword()
    {
        
        return this.password;
        
    }
    
    public void setPassword(java.lang.String password)
    {
        
    	this.password = password;
        
    }
    
    public java.lang.String getAccess()
    {
        
        return this.access;
        
    }
    
    public void setAccess(java.lang.String access)
    {
        
    	this.access = access;
        
    }
    
    public int getType()
    {
        
        return this.type;
        
    }
    
    public void setType(int type)
    {
        
    	this.type = type;
        
    }
    
    public java.lang.String getToken()
    {
        
        return this.token;
        
    }
    
    public void setToken(java.lang.String token)
    {
        
    	this.token = token;
        
    }
    
    public java.lang.String getUserKey()
    {
        
        return this.userKey;
        
    }
    
    public void setUserKey(java.lang.String userKey)
    {
        
    	this.userKey = userKey;
        
    }

}
