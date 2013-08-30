package com.hexacrm.db.common;

public class ProvinceAdapter {
	
	private android.database.sqlite.SQLiteDatabase database;
	private com.hexacrm.db.DBHelper dbHelper;
	private android.database.sqlite.SQLiteStatement stmt;
	
	private String[] provinceColumns = {
			com.hexacrm.db.DBHelper.PROVINCE_ID, 
			com.hexacrm.db.DBHelper.PROVINCE_UF, 
			com.hexacrm.db.DBHelper.PROVINCE_NAME
	};
	
	/**
	 * Constructor method.
	 * 
	 * @param context
	 * 				The parent context.
	 */
	public ProvinceAdapter(android.content.Context context) {
		
		dbHelper = new com.hexacrm.db.DBHelper(context);
		
	}
	
	public long insertProvince(com.hexacrm.kernel.common.Province obj) {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			stmt = database.compileStatement("INSERT INTO " + com.hexacrm.db.DBHelper.TABLE_PROVINCES + " (" 
					+ com.hexacrm.db.DBHelper.PROVINCE_ID + ", "
					+ com.hexacrm.db.DBHelper.PROVINCE_UF + ", "
					+ com.hexacrm.db.DBHelper.PROVINCE_NAME
					+ ") VALUES (?, ?, ?)");
			
			stmt.bindLong(1, obj.getIdProvince());
			stmt.bindString(2, obj.getUf());
			stmt.bindString(3, obj.getProvince());
			
			return stmt.executeInsert();
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível inserir os dados dos estados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public com.hexacrm.kernel.common.Province searchProvinceByID(long id) {
		
		database = dbHelper.getReadableDatabase();
		
		try {
			
			String sql = "SELECT " 
					+ com.hexacrm.db.DBHelper.PROVINCE_ID + ", "
					+ com.hexacrm.db.DBHelper.PROVINCE_UF + ", "
					+ com.hexacrm.db.DBHelper.PROVINCE_NAME
					+ " FROM " + com.hexacrm.db.DBHelper.TABLE_PROVINCES
					+ " WHERE " + com.hexacrm.db.DBHelper.PROVINCE_ID
					+ " = " + id;
			
			android.database.Cursor cursor = database.rawQuery(sql, null);
			
			return select(cursor);
			
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível obter os dados dos estados que estão cadastrados no sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	public long deleteProvinces() {
		
		database = dbHelper.getWritableDatabase();
		
		try {
			
			return database.delete(com.hexacrm.db.DBHelper.TABLE_PROVINCES, null, null);
		
		} catch (android.database.SQLException ex) {
			
			android.util.Log.e("BD Error => ", ex.getMessage());
			throw new android.database.SQLException("Não foi possível excluir os dados dos estados do sistema!");
			
		} finally {
			
			database.close();
			dbHelper.close();
			
		}
		
	}
	
	private com.hexacrm.kernel.common.Province select(android.database.Cursor cursor) 
			throws android.database.SQLException {
		
		com.hexacrm.kernel.common.Province province = new com.hexacrm.kernel.common.Province();
		
		if (cursor.moveToFirst()) {
				
			province.setIdProvince(cursor.getInt(0));
			province.setUf(cursor.getString(1));
			province.setProvince(cursor.getString(2));
			
		}
		
		if (cursor != null && ! cursor.isClosed()) {
			
			cursor.close();
			
		}
		
		return province;
		
	}

}
