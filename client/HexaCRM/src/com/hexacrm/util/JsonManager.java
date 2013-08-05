package com.hexacrm.util;

public class JsonManager {
	
	public JsonManager() {
		
		
		
	}
	
	public String parseJson(com.hexacrm.access.Privilege privilege) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(privilege);
        
    }
	
	public String parseJson(com.hexacrm.access.User user) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(user);
        
    }
	
	public String parseJson(com.hexacrm.common.Province province) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(province);
        
    }
	
	public String parseJson(com.hexacrm.core.Corporation corporation) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(corporation);
        
    }
	
	public String parseJson(com.hexacrm.core.Customer customer) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(customer);
        
    }
	
	public String parseJsonListPrivilege(java.util.List<com.hexacrm.access.Privilege> privileges) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(privileges);
        
    }
	
	public String parseJsonListUser(java.util.List<com.hexacrm.access.User> users) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(users);
        
    }
	
	public String parseJsonListProvince(java.util.List<com.hexacrm.common.Province> provinces) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(provinces);
        
    }
	
	public String parseJsonListCorporation(java.util.List<com.hexacrm.core.Corporation> corporations) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(corporations);
        
    }
	
	public String parseJsonListCustomer(java.util.List<com.hexacrm.core.Customer> customers) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(customers);
        
    }
	
	public com.hexacrm.access.Privilege parsePrivilege(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.access.Privilege.class);
        
    }
	
	public com.hexacrm.access.User parseUser(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.access.User.class);
        
    }
	
	public com.hexacrm.common.Province parseProvince(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.common.Province.class);
        
    }
	
	public com.hexacrm.core.Corporation parseCorporation(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.core.Corporation.class);
        
    }
	
	public com.hexacrm.core.Customer parseCustomer(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, com.hexacrm.core.Customer.class);
        
    }
	
	public java.util.List<com.hexacrm.access.Privilege> parseListPrivilege(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.access.Privilege>>() {});
        
    }
	
	public java.util.List<com.hexacrm.access.User> parseListUser(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.access.User>>() {});
        
    }
	
	public java.util.List<com.hexacrm.common.Province> parseListProvince(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.common.Province>>() {});
        
    }
	
	public java.util.List<com.hexacrm.core.Corporation> parseListCorporation(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.core.Corporation>>() {});
        
    }
	
	public java.util.List<com.hexacrm.core.Customer> parseListCustomer(String json) 
            throws com.fasterxml.jackson.core.JsonGenerationException, 
            com.fasterxml.jackson.databind.JsonMappingException, 
            java.io.IOException {
        
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.hexacrm.core.Customer>>() {});
        
    }

}
