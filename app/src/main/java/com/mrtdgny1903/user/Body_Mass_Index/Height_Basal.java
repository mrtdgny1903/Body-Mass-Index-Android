package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Height_Basal extends AppCompatActivity {

    public Bundle getData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height__basal);

        final EditText editText_height_basal = (EditText)findViewById(R.id.editText_height_basal);
        Button Button_height_basal = (Button)findViewById(R.id.Button_height_basal);


        getData2 = getIntent().getExtras();

        final boolean isMale= getData2.getBoolean("isMale");


        Button_height_basal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (editText_height_basal.getText().toString().trim().equals("")) {

                    Toast.makeText(getApplicationContext(), "Please fill the blank", Toast.LENGTH_SHORT).show();


                } else {

                    String height_text = editText_height_basal.getText().toString();

                    Bundle Bundle3 = new Bundle();
                    Bundle3.putBoolean("isMale", isMale);
                    Bundle3.putString("height_text", height_text);


                    Intent i = new Intent(Height_Basal.this, Weight_Basal.class);

                    i.putExtras(Bundle3);


                    startActivity(i);

                }


            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== android.R.id.home){

            this.finish();
            return true;

        }
        return super.onOptionsItemSelected(item);

    }


}