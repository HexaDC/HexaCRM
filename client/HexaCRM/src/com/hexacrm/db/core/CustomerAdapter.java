package com.hexacrm.db.core;

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

public class CustomerAdapter {
	
	private android.database.sqlite.SQLiteDatabase database;
	private com.hexacrm.db.DBHelper dbHelper;
	private android.database.sqlite.SQLiteStatement stmt;
	
	private String[] customerColumns = {
			com.hexacrm.db.DBHelper.CUSTOMER_ID, 
			com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE,
			com.hexacrm.db.DBHelper.CUSTOMER_EMAIL,
			com.hexacrm.db.DBHelper.CUSTOMER_NAME,
			com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1,
			com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2,
			com.hexacrm.db.DBHelper.CUSTOMER_CONTACT,
			com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS,
			com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER,
			com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT,
			com.hexacrm.db.DBHelper.CUSTOMER_CITY,
			com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE,
			com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
	};
	
	/**
	 * Constructor method.
	 * 
	 * @param context
	 * 				The parent context.
	 */
	public CustomerAdapter(android.content.Context context) {
		
		dbHelper = new com.hexacrm.db.DBHelper(context);
		
	}
	
	public long insertCustomer(com.hexacrm.kernel.core.Customer obj) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("INSERT INTO " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + " (" 
					+ com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE 
					+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			stmt.bindLong(1, obj.getIdCustomer());
			stmt.bindString(2, obj.getSite());
			stmt.bindString(3, obj.getEmail());
			stmt.bindString(4, obj.getName());
			stmt.bindString(5, obj.getPhone1());
			stmt.bindString(6, obj.getPhone2());
			stmt.bindString(7, obj.getContact());
			stmt.bindString(8, obj.getAddress());
			stmt.bindString(9, obj.getHomeNumber());
			stmt.bindString(10, obj.getDistrict());
			stmt.bindString(11, obj.getCity());
			stmt.bindString(12, obj.getPostalCode());
			stmt.bindLong(13, obj.getIdProvince());
			
			return stmt.executeInsert();
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível inserir os dados dos clientes no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public com.hexacrm.kernel.core.Customer searchCustomersByWebsite(String search, long index) {
		
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS
					+ " WHERE " + com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE
					+ " LIKE '%" + search + "%'"
					+ " ORDER BY " + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIMIT " + index + ", 1";
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos clientes que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public com.hexacrm.kernel.core.Customer searchCustomersByEmail(String search, long index) {
		
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS
					+ " WHERE " + com.hexacrm.db.DBHelper.CUSTOMER_EMAIL
					+ " LIKE '%" + search + "%'"
					+ " ORDER BY " + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIMIT " + index + ", 1";
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos clientes que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public com.hexacrm.kernel.core.Customer searchCustomersByName(String search, long index) {
		
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS
					+ " WHERE " + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIKE '%" + search + "%'" 
					+ " ORDER BY " + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIMIT " + index + ", 1";
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos clientes que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public com.hexacrm.kernel.core.Customer searchCustomersByDistrict(String search, long index) {
		
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS
					+ " WHERE " + com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT
					+ " LIKE '%" + search + "%'"
					+ " ORDER BY " + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIMIT " + index + ", 1";
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos clientes que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}

	public com.hexacrm.kernel.core.Customer searchCustomersByCity(String search, long index) {
	
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS
					+ " WHERE " + com.hexacrm.db.DBHelper.CUSTOMER_CITY
					+ " LIKE '%" + search + "%'"
					+ " ORDER BY " + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIMIT " + index + ", 1";
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos clientes que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public com.hexacrm.kernel.core.Customer searchCustomersByProvince(String search, long index) {
		
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_ID + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_EMAIL + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_NAME + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_PHONE_1 + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_PHONE_2 + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_CONTACT + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_ADDRESS + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_HOME_NUMBER + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_CITY + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_POSTAL_CODE + ", "
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS
					+ " INNER JOIN " + com.hexacrm.db.DBHelper.TABLE_PROVINCES
					+ " ON " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE
					+ " = " + com.hexacrm.db.DBHelper.TABLE_PROVINCES + "." + com.hexacrm.db.DBHelper.PROVINCE_ID
					+ " WHERE " + com.hexacrm.db.DBHelper.TABLE_PROVINCES + "." + com.hexacrm.db.DBHelper.PROVINCE_NAME 
					+ " LIKE '%" + search + "%'"
					+ " ORDER BY " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_NAME
					+ " LIMIT " + index + ", 1";
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos clientes que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long countCustomers() {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " + com.hexacrm.db.DBHelper.TABLE_CUSTOMERS);
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}

	public long countCustomersByName(String search) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS 
					+ " WHERE " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_NAME 
					+ " LIKE '%" + search + "%'");
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long countCustomersByEmail(String search) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS 
					+ " WHERE " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_EMAIL 
					+ " LIKE '%" + search + "%'");
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long countCustomersByWebsite(String search) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS 
					+ " WHERE " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_WEBSITE 
					+ " LIKE '%" + search + "%'");
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long countCustomersByDistrict(String search) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS 
					+ " WHERE " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_DISTRICT 
					+ " LIKE '%" + search + "%'");
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long countCustomersByCity(String search) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS 
					+ " WHERE " 
					+ com.hexacrm.db.DBHelper.CUSTOMER_CITY 
					+ " LIKE '%" + search + "%'");
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long countCustomersByProvince(String search) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("SELECT COUNT(*) FROM " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS 
					+ " INNER JOIN " + com.hexacrm.db.DBHelper.TABLE_PROVINCES 
					+ " ON " 
					+ com.hexacrm.db.DBHelper.TABLE_CUSTOMERS + "." + com.hexacrm.db.DBHelper.CUSTOMER_PROVINCE 
					+ " = "
					+ com.hexacrm.db.DBHelper.TABLE_PROVINCES + "." + com.hexacrm.db.DBHelper.PROVINCE_ID  
					+ " WHERE " 
					+ com.hexacrm.db.DBHelper.TABLE_PROVINCES + "." + com.hexacrm.db.DBHelper.PROVINCE_NAME 
					+ " LIKE '%" + search + "%'");
			
			return stmt.simpleQueryForLong();
		
		} catch (android.database.SQLException ex) {
			
			throw new android.database.SQLException("Não foi possível verificar quantas empresas existem no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}

	public long deleteCustomers() {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			return database.delete(com.hexacrm.db.DBHelper.TABLE_CUSTOMERS, null, null);
		
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível excluir os dados dos clientes do sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}

	private com.hexacrm.kernel.core.Customer select(android.database.Cursor cursor) 
			throws android.database.SQLException {
		
		com.hexacrm.kernel.core.Customer customer = new com.hexacrm.kernel.core.Customer();
		
		if (cursor.moveToFirst()) {
				
			customer.setIdCustomer(cursor.getInt(0));
			customer.setSite(cursor.getString(1));
			customer.setEmail(cursor.getString(2));
			customer.setName(cursor.getString(3));
			customer.setPhone1(cursor.getString(4));
			customer.setPhone2(cursor.getString(5));
			customer.setContact(cursor.getString(6));
			customer.setAddress(cursor.getString(7));
			customer.setHomeNumber(cursor.getString(8));
			customer.setDistrict(cursor.getString(9));
			customer.setCity(cursor.getString(10));
			customer.setPostalCode(cursor.getString(11));
			customer.setIdProvince(cursor.getLong(12));
			
		}
		
		if (cursor != null && ! cursor.isClosed()) {
			
			cursor.close();
			
		}
		
		return customer;
		
	}

}
