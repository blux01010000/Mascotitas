package com.bprats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.bprats.mascotitas.R;

/**
 * Created by bprats on 6/9/17.
 */

public class AppBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appbar);
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
