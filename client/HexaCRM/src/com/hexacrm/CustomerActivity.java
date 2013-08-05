package com.hexacrm;

public class CustomerActivity extends android.app.Activity {

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customer);
		initComponents();
		
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.customer, menu);
		return true;
		
	}
	
	private void initComponents() {
		
		tabHost = (android.widget.TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();
		
		android.widget.TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("tag1");
		tabSpec1.setContent(R.id.scrollSearch);
		tabSpec1.setIndicator("Pesquisa");
		tabHost.addTab(tabSpec1);
		
		android.widget.TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tag2");
		tabSpec2.setContent(R.id.scrollPersonalData);
		tabSpec2.setIndicator("Dados Pessoais");
		tabHost.addTab(tabSpec2);
		
		android.widget.TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tag3");
		tabSpec3.setContent(R.id.scrollAddressData);
		tabSpec3.setIndicator("Endereço");
		tabHost.addTab(tabSpec3);
		
	}
	
	private android.widget.TabHost tabHost;

}
