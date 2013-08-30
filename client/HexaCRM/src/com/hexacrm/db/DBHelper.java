package com.hexacrm.db;

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

public class DBHelper extends android.database.sqlite.SQLiteOpenHelper {
	
	// Database data
	private static final String DB_NAME = "touchlist.db";
	private static final int DB_VERSION = 1;
	
	// Fields which contains the tables name.
	public static final String TABLE_ANDROID_METADATA = "android_metadata";
	public static final String TABLE_PROVINCES = "provinces";
	public static final String TABLE_CUSTOMERS = "customers";
	
	// Fields to be used with android_metadata's table on database
	public static final String LOCALE = "locale";
	
	// Fields to be used with provinces's table on database
	public static final String PROVINCE_ID = "id";
	public static final String PROVINCE_UF = "uf";
	public static final String PROVINCE_NAME = "name";
	
	// Fields to be used with customers's table on database
	public static final String CUSTOMER_ID = "id";
	public static final String CUSTOMER_WEBSITE = "website";
	public static final String CUSTOMER_EMAIL = "email";
	public static final String CUSTOMER_NAME = "name";
	public static final String CUSTOMER_PHONE_1 = "phone_1";
	public static final String CUSTOMER_PHONE_2 = "phone_2";
	public static final String CUSTOMER_CONTACT = "contact";
	public static final String CUSTOMER_ADDRESS = "address";
	public static final String CUSTOMER_HOME_NUMBER = "home_number";
	public static final String CUSTOMER_DISTRICT = "district";
	public static final String CUSTOMER_CITY = "city";
	public static final String CUSTOMER_POSTAL_CODE = "postal_code";
	public static final String CUSTOMER_PROVINCE = "id_province";
	
	// This fields is responsible to create the tables into database file
	private static final String CREATE_TABLE_ANDROID_METADATA = "CREATE TABLE IF NOT EXISTS " + TABLE_ANDROID_METADATA + " ( "
			+ LOCALE + " TEXT DEFAULT 'pt_BR');";
	
	private static final String CREATE_TABLE_PROVINCES = "CREATE TABLE IF NOT EXISTS " + TABLE_PROVINCES + " ( "
			+ PROVINCE_ID + " INTEGER NOT NULL PRIMARY KEY, "
			+ PROVINCE_UF + " VARCHAR(10) NOT NULL DEFAULT '', "
			+ PROVINCE_NAME + " VARCHAR(40) NOT NULL DEFAULT '');";
	
	private static final String CREATE_TABLE_CUSTOMERS = "CREATE TABLE IF NOT EXISTS " + TABLE_CUSTOMERS + " ( "
			+ CUSTOMER_ID + " INTEGER NOT NULL PRIMARY KEY, "
			+ CUSTOMER_WEBSITE + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_EMAIL + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_NAME + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_PHONE_1 + " VARCHAR(15) NULL DEFAULT '', "
			+ CUSTOMER_PHONE_2 + " VARCHAR(15) NULL DEFAULT '', "
			+ CUSTOMER_CONTACT + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_ADDRESS + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_HOME_NUMBER + " VARCHAR(80) NULL DEFAULT '', "
			+ CUSTOMER_DISTRICT + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_CITY + " VARCHAR(100) NULL DEFAULT '', "
			+ CUSTOMER_POSTAL_CODE + " VARCHAR(14) NULL DEFAULT '', "
			+ CUSTOMER_PROVINCE + " INTEGER NULL, "
			+ " FOREIGN KEY(" + CUSTOMER_PROVINCE + ") "
			+ " REFERENCES " + TABLE_PROVINCES + "(" + PROVINCE_ID + ") "
			+ " ON DELETE CASCADE "
			+ " ON UPDATE CASCADE);";
	
	/**
	 * This is the constructor method of the current class.
	 * 
	 * @param context
	 */
	public DBHelper(android.content.Context context) { 
		
		super(context, DB_NAME, null, DB_VERSION);
		
	}
	
	@Override
	public void onCreate(android.database.sqlite.SQLiteDatabase db) {
		
		// This commands executes the queries to create the tables into database file
		db.execSQL(CREATE_TABLE_ANDROID_METADATA);
		db.execSQL(CREATE_TABLE_PROVINCES);
		db.execSQL(CREATE_TABLE_CUSTOMERS);
		
	}
	
	@Override
	public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
		
		// This commands delete the previous table if exists
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_ANDROID_METADATA);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_PROVINCES);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_CUSTOMERS);
		
		// This command calls the onCreate method to it creates the new version of the database
		onCreate(db);
		
	}

}
