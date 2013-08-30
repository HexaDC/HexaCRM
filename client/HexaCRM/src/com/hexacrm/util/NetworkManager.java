package com.hexacrm.util;

public class NetworkManager {
	
	public NetworkManager() {
		
		
		
	}
	
	public String readStream(java.io.InputStream in) {
		
		java.io.BufferedReader reader = null;
		
		try {
			
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));
		    String line = "";
		    String content = "";
		    
		    while ((line = reader.readLine()) != null) {
		      content += line;
		    }
		    
		    return content;
		    
		} catch (java.io.IOException e) {
			
			e.printStackTrace();
			return "";
			
		} finally {
			
			if (reader != null) {
				
				try {
					
					reader.close();
					
				} catch (java.io.IOException e) {
					
					e.printStackTrace();
					
		        }
				
		    }
			
		}
		
	}

}
