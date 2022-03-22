package com.eoruc.alertdiolog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //context
        // activity Context
        // app context
//getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "baloncuk mesaj",Toast.LENGTH_LONG).show();
    }
    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("kaydet");
        alert.setMessage("Emin misiniz");
        alert.setPositiveButton("evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"kaydedildi",Toast.LENGTH_LONG).show();
                //save
            }
        });
        alert.setNegativeButton("hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Kaydedilmedi",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}