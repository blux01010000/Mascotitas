package com.bprats;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import com.bprats.mascotitas.R;

public class Contacto extends AppCompatActivity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        final Button send = (Button) this.findViewById(R.id.btnEnviar);
        send.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                try {
                    GmailSender sender = new GmailSender("<U R GMAIL ADDRESS>",
                            "<GMAIL PASSWORD>");
                    sender.sendMail("This is Subject", "This is Body",
                            "<U R GMAIL (SENDER)>", "<RECIPIENT(RECEIVER) EMAIL ADDRESS>");
                    Toast.makeText(Contacto.this, "Email enviado con exito", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }

            }
        });


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.contact:
                Intent intent = new Intent(this, Contacto.class);
                startActivity(intent);
                break;

            case R.id.about:
                Intent i = new Intent (this, About.class);
                startActivity(i);
                break;

            case R.id.ultimos:
                Toast.makeText(this, "Disable", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);

    }
}




