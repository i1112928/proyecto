package com.example.futbol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        View btnCalendario = findViewById(R.id.btnCalendario);
        btnCalendario.setOnClickListener(this);
        View btnClasificacion = findViewById(R.id.btnClasificacion);
        btnClasificacion.setOnClickListener(this);
        View btnEquipo = findViewById(R.id.btnEquipo);
        btnEquipo.setOnClickListener(this);
        View btnGoleadores = findViewById(R.id.btnGoleadores);
        btnGoleadores.setOnClickListener(this);
        View btnResultados = findViewById(R.id.btnResultados);
        btnResultados.setOnClickListener(this);
        

    }

	public void onClick(View vista) {
		
		if(vista.getId()==findViewById(R.id.btnCalendario).getId())
		{
			Intent i = new Intent(this,calendarioActivity.class);
			startActivity(i);
		}
		if(vista.getId()==findViewById(R.id.btnClasificacion).getId())
		{
			Intent i = new Intent(this,clasificacionActivity.class);
			startActivity(i);
		}
		if(vista.getId()==findViewById(R.id.btnEquipo).getId())
		{
			Intent i = new Intent(this,equipoActivity.class);
			startActivity(i);
		}
		if(vista.getId()==findViewById(R.id.btnGoleadores).getId())
		{
			Intent i = new Intent(this,goleadoresActivity.class);
			startActivity(i);
		}
		if(vista.getId()==findViewById(R.id.btnResultados).getId())
		{
			Intent i = new Intent(this,resultadosActivity.class);
			startActivity(i);
		}
	}
}
