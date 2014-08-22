package com.Haiyue.profile_v1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity implements OnClickListener{
	EditText txtuser;
	EditText txtpass;
	Button login;
	Button cancel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		txtuser = (EditText)findViewById(R.id.txtuser);
		txtpass = (EditText)findViewById(R.id.txtpass);
		login = (Button)findViewById(R.id.login);
		cancel = (Button)findViewById(R.id.cancel);
		login.setOnClickListener(this);
		cancel.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		String user = txtuser.getText().toString();
		String pass = txtpass.getText().toString();
		
		switch(v.getId()){
		case R.id.login:
			if(user.equals("user") && pass.equals("test1234")){
				Intent i = new Intent(Login.this,MainActivity.class);
				startActivity(i);
			}
			else{
				Toast.makeText(Login.this, "Wrong Username/Password", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.cancel:
			txtuser.setText(" ");
			txtpass.setText("");
			break;
		default:
			break;
		}
		
	}
}
