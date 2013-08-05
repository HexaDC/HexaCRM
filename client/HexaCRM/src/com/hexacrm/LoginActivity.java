package com.hexacrm;

public class LoginActivity extends android.app.Activity {

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initComponents();
		
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
		
	}
	
	private void initComponents() {
		
		editUsername = (android.widget.EditText) findViewById(R.id.editUsername);
		editPassword = (android.widget.EditText) findViewById(R.id.editPassword);
		
		buttonLogon = (android.widget.Button) findViewById(R.id.buttonLogon);
		buttonLogon.setOnClickListener(new android.view.View.OnClickListener()  {
			
			@Override
			public void onClick(android.view.View v) {
				
				logon();
				
			}
			
		});
		
		buttonCancel = (android.widget.Button) findViewById(R.id.buttonCancel);
		buttonCancel.setOnClickListener(new android.view.View.OnClickListener() {
			
			@Override
			public void onClick(android.view.View v) {
				
			}
			
		});
		
	}
	
	private void logon() {
		
		try {
			
			java.lang.String username = editUsername.getText().toString().trim();
            java.lang.String password = editPassword.getText().toString().trim();
            
            if (! username.isEmpty() && ! password.isEmpty()) {
            	
            	com.hexacrm.access.User user = new com.hexacrm.access.User();
                user.setUsername(username);
                user.setPassword(password);
                
                com.hexacrm.util.JsonManager jsonMgr = new com.hexacrm.util.JsonManager();
                String input = jsonMgr.parseJson(user);
                
                java.lang.Object output = com.hexacrm.conn.ConnectionManager.connect("/user_logon.ctrl.php?json=" + input, "");
                
                if (output != null) {
                	
                	if (output instanceof com.hexacrm.access.User) {
                		
                		android.content.Intent i = new android.content.Intent(LoginActivity.this, CustomerActivity.class);
        				startActivity(i);
                		
                	} else {
                		
                		android.widget.Toast.makeText(this, "Nome de usuário e/ou senha inválidos!", android.widget.Toast.LENGTH_LONG).show();
                		
                	}
                	
                }
            	
            } else {
            	
            	android.widget.Toast.makeText(this, "Informe o seu nome de usuário e a sua senha!", android.widget.Toast.LENGTH_LONG).show();
            	
            }
			
		} catch (java.net.MalformedURLException ex) {
            
			android.util.Log.e("Erro ao logar =>", "A mensagem é: " + ex.getLocalizedMessage());
            android.widget.Toast.makeText(this, "Não foi possível encontrar um caminho até o servidor!", android.widget.Toast.LENGTH_LONG).show();
            
        } catch (java.net.ConnectException ex) {
            
        	android.util.Log.e("Erro ao logar =>", "A mensagem é: " + ex.getLocalizedMessage());
            android.widget.Toast.makeText(this, "O servidor do HexaCRM está temporariamente fora do ar!\nTente novamente mais tarde.", android.widget.Toast.LENGTH_LONG).show();
            
        } catch (java.io.IOException ex) {
            
        	android.util.Log.e("Erro ao logar =>", "A mensagem é: " + ex.getLocalizedMessage());
            android.widget.Toast.makeText(this, "Não foi possível enviar/obter as informações para/do servidor!", android.widget.Toast.LENGTH_LONG).show();
            
        } catch (java.lang.Exception ex) {
            
        	android.util.Log.e("Erro ao logar =>", "A mensagem é: " + ex.getLocalizedMessage());
        	android.widget.Toast.makeText(this, "Ocorreu um erro interno no sistema!", android.widget.Toast.LENGTH_LONG).show();
            
        }
		
	}
	
	private android.widget.Button buttonLogon;
	private android.widget.Button buttonCancel;
	private android.widget.EditText editUsername;
	private android.widget.EditText editPassword;

}
