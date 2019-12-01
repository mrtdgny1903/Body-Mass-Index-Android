package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Gender_Body extends AppCompatActivity {

    public Bundle getData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender__body);


        final Button btn_male_body = (Button)findViewById(R.id.Button_male);
        final Button btn_female_body = (Button)findViewById(R.id.Button_female);



        getData = getIntent().getExtras();




        btn_male_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Bundle Bundle2 = new Bundle();
                Bundle2.putBoolean("isMale",true);

                Intent i = new Intent(Gender_Body.this,Height_Body.class);

                i.putExtras(Bundle2);

                startActivity(i);


            }
        });

        btn_female_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Bundle Bundle2 = new Bundle();
                Bundle2.putBoolean("isMale",false);


                Intent i = new Intent(Gender_Body.this,Height_Body.class);

                i.putExtras(Bundle2);


                startActivity(i);


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
