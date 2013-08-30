package com.hexacrm;

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
	
	@Override
	protected android.app.Dialog onCreateDialog(int id) {
		
		switch (id) {
		
			case 1:
				android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
				builder.setMessage("Deseja realmente sair do Touch List?");
				builder.setCancelable(true);
				builder.setPositiveButton("Sim", new android.content.DialogInterface.OnClickListener() {
					@Override
					public void onClick(android.content.DialogInterface dialog, int which) {
						CustomerActivity.this.finish();
					}
				});
				
				builder.setNegativeButton("Não", new android.content.DialogInterface.OnClickListener() {
					@Override
					public void onClick(android.content.DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});
				
				android.app.AlertDialog dialog = builder.create();
				dialog.show();
				break;
				
			case 2:
				android.app.AlertDialog.Builder builder2 = new android.app.AlertDialog.Builder(this);
				builder2.setMessage("Deseja sincronizar o HexaCRM Mobile com os dados do servidor on-line?");
				builder2.setCancelable(true);
				builder2.setPositiveButton("Sim", new android.content.DialogInterface.OnClickListener() {
					@Override
					public void onClick(android.content.DialogInterface dialog, int which) {
		    					
		    			android.os.AsyncTask<Void, Void, Void> task = new android.os.AsyncTask<Void, Void, Void>() {
		    				
		                    private android.app.ProgressDialog pd;

		                    @Override
		                    protected void onPreExecute() {

		                    	pd = new android.app.ProgressDialog(com.hexacrm.CustomerActivity.this);
		                        pd.setTitle("Sincronizando...");
		                        pd.setMessage("Por favor aguarde!\nQuando a sincronização estiver concluída esta janela se fechará automaticamente.");
		                        pd.setCancelable(false);
		                        pd.setIndeterminate(true);
		                        pd.show();

		                    }
		                    
		                    @Override
		                    protected Void doInBackground(Void... arg0) {

		                    	sync();
		                    	return null;

		                    }
		                    
		                    @Override

		                    protected void onPostExecute(Void result) {

		                        pd.dismiss();

		                    }
		    				
		    			};
		    			
		    			task.execute((Void[])null);
		    			dialog.cancel();
						
					}
					
				});
				
				builder2.setNegativeButton("Não", new android.content.DialogInterface.OnClickListener() {
					@Override
					public void onClick(android.content.DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});
				
				android.app.AlertDialog dialog2 = builder2.create();
				dialog2.show();
				break;
		
		}
		
		return super.onCreateDialog(id);
		
	}
	
	@Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
    	
    	switch (item.getItemId()) {
    	
    		case R.id.menuSynchronization: showDialog(2);
    			return true;
    		
    		default: 
    			return false;
    	
    	}
    	
    }
	
	@Override
	public void onBackPressed() {
		
		showDialog(1);
		
	}
	
	private void initComponents() {
		
		editAddress = (android.widget.EditText) findViewById(R.id.editAddress);
		editCity = (android.widget.EditText) findViewById(R.id.editCity);
		editContact = (android.widget.EditText) findViewById(R.id.editContact);
		editDistrict = (android.widget.EditText) findViewById(R.id.editDistrict);
		editEmail = (android.widget.EditText) findViewById(R.id.editEmail);
		editCorporate = (android.widget.EditText) findViewById(R.id.editCorporate);
		editNumber = (android.widget.EditText) findViewById(R.id.editNumber);
		editPhone1 = (android.widget.EditText) findViewById(R.id.editPhone1);
		editPhone2 = (android.widget.EditText) findViewById(R.id.editPhone2);
		editPostalCode = (android.widget.EditText) findViewById(R.id.editPostalCode);
		editProvince = (android.widget.EditText) findViewById(R.id.editProvince);
		editSearch = (android.widget.EditText) findViewById(R.id.editSearch);
		editWebsite = (android.widget.EditText) findViewById(R.id.editWebsite);
		
		spinnerFilter = (android.widget.Spinner) findViewById(R.id.spinnerFilter);
		
		imageBack = (android.widget.ImageView) findViewById(R.id.imageBack);
		imageBack.setOnClickListener(new android.view.View.OnClickListener() {
			
			@Override
			public void onClick(android.view.View v) {
				
				moveCursorBack();
				
			}
			
		});
		
		imageForward = (android.widget.ImageView) findViewById(R.id.imageForward);
		imageForward.setOnClickListener(new android.view.View.OnClickListener() {
			
			@Override
			public void onClick(android.view.View v) {
				
				moveCursorForward();
				
			}
			
		});
		
		imageSearch = (android.widget.ImageView) findViewById(R.id.imageSearch);
		imageSearch.setOnClickListener(new android.view.View.OnClickListener() {
			
			@Override
			public void onClick(android.view.View v) {
				
				search();
				
			}
			
		});
		
		tabHost = (android.widget.TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();
		
		android.widget.TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("tag1");
		tabSpec1.setContent(R.id.scrollSearch);
		tabSpec1.setIndicator("Pesquisa", getResources().getDrawable(R.drawable.search));
		tabHost.addTab(tabSpec1);
		
		android.widget.TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tag2");
		tabSpec2.setContent(R.id.scrollPersonalData);
		tabSpec2.setIndicator("Dados Pessoais", getResources().getDrawable(R.drawable.identity));
		tabHost.addTab(tabSpec2);
		
		android.widget.TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tag3");
		tabSpec3.setContent(R.id.scrollAddressData);
		tabSpec3.setIndicator("Localização", getResources().getDrawable(R.drawable.address));
		tabHost.addTab(tabSpec3);
		
		fillupFilter();
		count();
		toogleBackButtons();
		toogleForwardButtons();
		
	}
	
	private void fillupFilter() {
		
		// It creates a new ArrayAdapter object and sets it item list mode
		android.widget.ArrayAdapter<String> adapter = new android.widget.ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
		// It sets the spinner drop down mode
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// It adds a default item to the ArrayAdapter object
		adapter.add("Nome");
		adapter.add("E-mail");
		adapter.add("Website");
		adapter.add("Bairro");
		adapter.add("Cidade");
		adapter.add("Estado");
		
		// It sets the source items of the spinner widget using the ArrayAdapter object
		spinnerFilter.setAdapter(adapter);
		
	}
	
	private void search() {
		
		java.lang.String search = editSearch.getText().toString();
		
		if (! search.isEmpty()) {
			
			com.hexacrm.db.core.CustomerAdapter adapter = new com.hexacrm.db.core.CustomerAdapter(this);
			
			java.lang.String filter = spinnerFilter.getSelectedItem().toString();
			
			if (filter.equals("Nome")) {
				
				customer = adapter.searchCustomersByName(search, currentIndex);
				quantity = adapter.countCustomersByName(search) - 1;
				
			} else if (filter.equals("E-mail")) {
				
				customer = adapter.searchCustomersByEmail(search, currentIndex);
				quantity = adapter.countCustomersByEmail(search) - 1;
				
			} else if (filter.equals("Website")) {
				
				customer = adapter.searchCustomersByWebsite(search, currentIndex);
				quantity = adapter.countCustomersByWebsite(search) - 1;
				
			} else if (filter.equals("Bairro")) {
				
				customer = adapter.searchCustomersByDistrict(search, currentIndex);
				quantity = adapter.countCustomersByDistrict(search) - 1;
				
			} else if (filter.equals("Cidade")) {
				
				customer = adapter.searchCustomersByCity(search, currentIndex);
				quantity = adapter.countCustomersByCity(search) - 1;
				
			} else if (filter.equals("Estado")) {
				
				customer = adapter.searchCustomersByProvince(search, currentIndex);
				quantity = adapter.countCustomersByProvince(search) - 1;
				
			}
			
			if (customer.getIdCustomer() > 0) {
			
				fillUpFields();
				
				com.hexacrm.db.common.ProvinceAdapter pAdapter = new com.hexacrm.db.common.ProvinceAdapter(this);
				com.hexacrm.kernel.common.Province province = pAdapter.searchProvinceByID(customer.getIdProvince());
				
				if (province.getIdProvince() > 0)
					editProvince.setText(province.getProvince());
				
				toogleBackButtons();
				toogleForwardButtons();
				tabHost.setCurrentTab(1);
			
			} else {
				
				android.widget.Toast.makeText(this, "Não foi encontrada nenhuma empresa que corresponda com a pesquisa!", android.widget.Toast.LENGTH_LONG).show();
				
			}
			
		} else {
			
			android.widget.Toast.makeText(this, "Digite alguma palavra para realizar a pesquisa!", android.widget.Toast.LENGTH_LONG).show();
			
		}
		
	}
	
	private void count() {
		
		com.hexacrm.db.core.CustomerAdapter adapter = new com.hexacrm.db.core.CustomerAdapter(this);
		adapter.countCustomers();
		
	}
	
	private void sync() {
		
		try {
			
			syncProvince();
			syncCustomer();
			
		} catch (java.net.MalformedURLException ex) {
			
			android.util.Log.e("UI Error => ", ex.getMessage());
			
		} catch (java.io.IOException ex) {
			
			android.util.Log.e("UI Error => ", ex.getMessage());
			
		} catch (android.database.sqlite.SQLiteException ex) {
			
			android.util.Log.e("DB Error => ", ex.getMessage());
			
		}
		
	}
	
	private void syncProvince() 
			throws java.net.MalformedURLException, java.io.IOException {
		
		com.hexacrm.util.NetworkManager net = new com.hexacrm.util.NetworkManager();
		
		java.net.URL url = new java.net.URL(com.hexacrm.util.Settings.URL + "/province_import.ctrl.php");
		java.net.HttpURLConnection con = (java.net.HttpURLConnection) url.openConnection();
		
		String response = net.readStream(con.getInputStream());
		
		if (response.contains("\"obj\":\"province\"")) {
			
			com.hexacrm.util.JsonManager jsonMgr = new com.hexacrm.util.JsonManager();
            
            if (response.contains("[") && response.contains("]")) {
            	
                 java.util.List<com.hexacrm.kernel.common.Province> provinces = jsonMgr.parseListProvince(response);
                 
                 if (provinces.size() > 0) {
                	 
                	 com.hexacrm.db.common.ProvinceAdapter adapter = new com.hexacrm.db.common.ProvinceAdapter(this);
                	 adapter.deleteProvinces();
                	 
                	 for (com.hexacrm.kernel.common.Province cursor: provinces) {
                		 
                		 adapter.insertProvince(cursor);
                		 
                	 }
                	 
                 }
                 
            }
        }
		
	}
	
	private void syncCustomer() 
			throws java.net.MalformedURLException, java.io.IOException {
		
		com.hexacrm.util.NetworkManager net = new com.hexacrm.util.NetworkManager();
		
		java.net.URL url = new java.net.URL(com.hexacrm.util.Settings.URL + "/customer_import.ctrl.php");
		java.net.HttpURLConnection con = (java.net.HttpURLConnection) url.openConnection();
		String response = net.readStream(con.getInputStream());
		
		if (response.contains("\"obj\":\"customer\"")) {
			
			com.hexacrm.util.JsonManager jsonMgr = new com.hexacrm.util.JsonManager();
            
            if (response.contains("[") && response.contains("]")) {
            	
                 java.util.List<com.hexacrm.kernel.core.Customer> customers = jsonMgr.parseListCustomer(response);
                 
                 if (customers.size() > 0) {
                	 
                	 com.hexacrm.db.core.CustomerAdapter adapter = new com.hexacrm.db.core.CustomerAdapter(this);
                	 adapter.deleteCustomers();
                	 
                	 for (com.hexacrm.kernel.core.Customer cursor: customers) {
                		 
                		 adapter.insertCustomer(cursor);
                		 
                	 }
                	 
                 }
                 
            }
            
        }
		
	}
	
	private void fillUpFields() {
		
		if (customer != null) {
			
			clearFields();
			
			editAddress.setText(customer.getAddress());
			editCity.setText(customer.getCity());
			editContact.setText(customer.getContact());
			editDistrict.setText(customer.getDistrict());
			editEmail.setText(customer.getEmail());
			editCorporate.setText(customer.getName());
			editNumber.setText(customer.getHomeNumber());
			editPhone1.setText(customer.getPhone1());
			editPhone2.setText(customer.getPhone2());
			editPostalCode.setText(customer.getPostalCode());
			editWebsite.setText(customer.getSite());
			
		}
		
	}
	
	private void moveCursorBack() {
		
		if (currentIndex > 0)
			currentIndex--;
		
		search();
		toogleBackButtons();
		toogleForwardButtons();
		
	}
	
	private void moveCursorForward() {
		
		if (currentIndex < quantity)
			currentIndex++;
		
		search();
		toogleBackButtons();
		toogleForwardButtons();
		
	}
	
	private void toogleBackButtons() {
		
		if (currentIndex <= 0) {
			
			imageBack.setEnabled(false);
			imageBack.setImageResource(R.drawable.disable_back);
			
		} else {
			
			imageBack.setEnabled(true);
			imageBack.setImageResource(R.drawable.back);
			
		}
		
	}
	
	private void toogleForwardButtons() {
		
		if (currentIndex == quantity) {
			
			imageForward.setEnabled(false);
			imageForward.setImageResource(R.drawable.disable_forward);
			
		} else {
			
			imageForward.setEnabled(true);
			imageForward.setImageResource(R.drawable.forward);
			
		}
		
	}
	
	private void clearFields() {
		
		editAddress.setText("");
		editCity.setText("");
		editContact.setText("");
		editDistrict.setText("");
		editEmail.setText("");
		editCorporate.setText("");
		editNumber.setText("");
		editPhone1.setText("");
		editPhone2.setText("");
		editPostalCode.setText("");
		editProvince.setText("");
		editWebsite.setText("");
		
	}
	
	final android.os.Handler innerHandler = new android.os.Handler();
	private long quantity = 0;
	private long currentIndex = 0;
	private com.hexacrm.kernel.core.Customer customer = new com.hexacrm.kernel.core.Customer();
	
	private android.widget.EditText editAddress;
	private android.widget.EditText editCity;
	private android.widget.EditText editContact;
	private android.widget.EditText editDistrict;
	private android.widget.EditText editEmail;
	private android.widget.EditText editCorporate;
	private android.widget.EditText editNumber;
	private android.widget.EditText editPhone1;
	private android.widget.EditText editPhone2;
	private android.widget.EditText editPostalCode;
	private android.widget.EditText editProvince;
	private android.widget.EditText editSearch;
	private android.widget.EditText editWebsite;
	private android.widget.ImageView imageBack;
	private android.widget.ImageView imageForward;
	private android.widget.ImageView imageSearch;
	private android.widget.Spinner spinnerFilter;
	private android.widget.TabHost tabHost;

}
