package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Gender_Basal extends AppCompatActivity {

    public Bundle getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender__basal);


        final Button btn_male_basal = (Button)findViewById(R.id.Button_male_basal);
        final Button btn_female_basal = (Button)findViewById(R.id.Button_female_basal);



        getData = getIntent().getExtras();



        btn_male_basal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Boolean isMale=true ;

                Bundle Bundle2 = new Bundle();
                Bundle2.putBoolean("isMale",isMale);


                Intent i = new Intent(Gender_Basal.this,Height_Basal.class);

                i.putExtras(Bundle2);


                startActivity(i);


            }
        });

        btn_female_basal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean isMale = false;

                Bundle Bundle2 = new Bundle();
                Bundle2.putBoolean("isMale",isMale);



                Intent i = new Intent(Gender_Basal.this,Height_Basal.class);

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
