package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Goal_Basal extends AppCompatActivity {

    public  Bundle getData5;
    public  String goal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal__basal);

        final RadioButton rd_lose = (RadioButton)findViewById(R.id.lose);
        final RadioButton rd_gain = (RadioButton)findViewById(R.id.gain);
        final RadioButton rd_stay = (RadioButton)findViewById(R.id.stay);
        Button calculate_basal = (Button)findViewById(R.id.calculate_basal);



        getData5 = getIntent().getExtras();
        final boolean isMale = getData5.getBoolean("isMale");
        final String height_text = getData5.getString("height_text");
        final String weight_text = getData5.getString("weight_text");
        final String age_text = getData5.getString("age_text");

        calculate_basal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!rd_lose.isChecked() & !rd_gain.isChecked() & !rd_stay.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Please choose your goal", Toast.LENGTH_SHORT).show();

                }else{

                    if (rd_lose.isChecked()){

                        goal="lose";
                        Bundle Bundle5 = new Bundle();
                        Bundle5.putBoolean("isMale", isMale);
                        Bundle5.putString("height_text", height_text);
                        Bundle5.putString("weight_text", weight_text);
                        Bundle5.putString("age_text", age_text);
                        Bundle5.putString("goal", goal);


                        Intent i = new Intent(Goal_Basal.this, Calculate_Basal.class);

                        i.putExtras(Bundle5);

                        startActivity(i);


                    }
                    if (rd_gain.isChecked()){

                        goal="gain";
                        Bundle Bundle5 = new Bundle();
                        Bundle5.putBoolean("isMale", isMale);
                        Bundle5.putString("height_text", height_text);
                        Bundle5.putString("weight_text", weight_text);
                        Bundle5.putString("age_text", age_text);
                        Bundle5.putString("goal", goal);


                        Intent i = new Intent(Goal_Basal.this, Calculate_Basal.class);

                        i.putExtras(Bundle5);

                        startActivity(i);


                    }
                    if (rd_stay.isChecked()){

                        goal="stay";
                        Bundle Bundle5 = new Bundle();
                        Bundle5.putBoolean("isMale", isMale);
                        Bundle5.putString("height_text", height_text);
                        Bundle5.putString("weight_text", weight_text);
                        Bundle5.putString("age_text", age_text);
                        Bundle5.putString("goal", goal);


                        Intent i = new Intent(Goal_Basal.this, Calculate_Basal.class);

                        i.putExtras(Bundle5);

                        startActivity(i);


                    }



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