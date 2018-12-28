package com.example.tercerpractica;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText texto1,texto2;
	TextView respuesta;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        texto1=(EditText)findViewById(R.id.editText1);
		texto2=(EditText)findViewById(R.id.editText2);
		respuesta=(TextView)findViewById(R.id.textView2);
		}
    
    public void unir (View View){
		String campo1_n1=texto1.getText().toString();
		String campo2_n2=texto2.getText().toString();
		respuesta.setText(campo1_n1+","+ campo2_n2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
