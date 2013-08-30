package com.hexacrm.util;

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

public class JsonManager {
	
	public JsonManager() {
		
		
		
	}
	
	public String parseJson(com.hexacrm.kernel.common.Province province) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(province);
        
    }
	
	public String parseJson(com.hexacrm.kernel.core.Customer customer) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(customer);
        
    }
	
	public String parseJsonListProvince(java.util.List<com.hexacrm.kernel.common.Province> provinces) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(provinces);
        
    }
	
	public String parseJsonListCustomer(java.util.List<com.hexacrm.kernel.core.Customer> customers) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(customers);
        
    }
	
	public com.hexacrm.kernel.common.Province parseProvince(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.kernel.common.Province.class);
        
    }
	
	public com.hexacrm.kernel.core.Customer parseCustomer(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.kernel.core.Customer.class);
        
    }
	
	public java.util.List<com.hexacrm.kernel.common.Province> parseListProvince(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.kernel.common.Province>>() {});
        
    }
	
	public java.util.List<com.hexacrm.kernel.core.Customer> parseListCustomer(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.kernel.core.Customer>>() {});
        
    }

}
