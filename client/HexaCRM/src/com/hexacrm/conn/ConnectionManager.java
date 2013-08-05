package com.hexacrm.conn;

public class ConnectionManager {
	
	public static String url = "";
	
	public ConnectionManager() {
		
		
		
	}
	
	public static java.lang.Object connect(String urlConnection, String output) 
            throws java.net.MalformedURLException, java.io.IOException, java.net.ConnectException {
		
		java.net.URL url = new java.net.URL(com.hexacrm.util.Settings.URL + urlConnection);  
        java.net.URLConnection urlConn = url.openConnection();  
        urlConn.setDoInput(true);  
        urlConn.setDoOutput(true);  
        urlConn.setUseCaches(false);
        urlConn.setDefaultUseCaches(false);
        urlConn.setRequestProperty("content-type", "text/plain");
        
        java.io.OutputStreamWriter outStream = new java.io.OutputStreamWriter(urlConn.getOutputStream());
        outStream.write(output);
        outStream.flush();  
        outStream.close();
        
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(urlConn.getInputStream()));  
        java.io.DataInputStream inStream = new java.io.DataInputStream(urlConn.getInputStream());
        String objectReceived = inStream.readLine();
        inStream.close();
        
        com.hexacrm.util.JsonManager jsonMgr = new com.hexacrm.util.JsonManager();
        
        if (objectReceived.contains("\"obj\":\"privilege\"")) {
            
            if (objectReceived.contains("[") && objectReceived.contains("]"))
                return jsonMgr.parseListPrivilege(objectReceived);
            else
                return jsonMgr.parsePrivilege(objectReceived);
            
        }
        
        if (objectReceived.contains("\"obj\":\"user\"")) {
            
            if (objectReceived.contains("[") && objectReceived.contains("]"))
                return jsonMgr.parseListUser(objectReceived);
            else
                return jsonMgr.parseUser(objectReceived);
            
        }
        
        if (objectReceived.contains("\"obj\":\"province\"")) {
            
            if (objectReceived.contains("[") && objectReceived.contains("]"))
                return jsonMgr.parseListProvince(objectReceived);
            else
                return jsonMgr.parseProvince(objectReceived);
            
        }
        
        if (objectReceived.contains("\"obj\":\"corporation\"")) {
            
            if (objectReceived.contains("[") && objectReceived.contains("]"))
                return jsonMgr.parseListCorporation(objectReceived);
            else
                return jsonMgr.parseCorporation(objectReceived);
            
        }
        
        if (objectReceived.contains("\"obj\":\"customer\"")) {
            
            if (objectReceived.contains("[") && objectReceived.contains("]"))
                return jsonMgr.parseListCustomer(objectReceived);
            else
                return jsonMgr.parseCustomer(objectReceived);
            
        }
        
        return null;
		
	}

}
