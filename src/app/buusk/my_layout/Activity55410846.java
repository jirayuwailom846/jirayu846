package app.buusk.my_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Activity55410846 extends Activity implements OnClickListener {
	private  Button btnone ;
	private Button btntwo ;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnone = (Button) findViewById(R.id.btn_yo);
        btntwo = (Button) findViewById(R.id.Change1);
		btntwo.setOnClickListener(this);
		
    }



	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.Change1:
			Intent i = new Intent(getApplicationContext(),Main.class);
			startActivity(i);
			break;

		default:
			break;
		}
		}
		// TODO Auto-generated method stub
		
	}
