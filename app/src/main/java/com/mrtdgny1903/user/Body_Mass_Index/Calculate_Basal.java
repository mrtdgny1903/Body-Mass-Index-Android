package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculate_Basal extends AppCompatActivity {

    public Bundle getData6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate__basal);

        TextView text_basal = (TextView) findViewById(R.id.text_basal);
        TextView text_reach = (TextView) findViewById(R.id.text_reach);
        TextView text_condition = (TextView) findViewById(R.id.text_condition);
        Button home_basal = (Button)findViewById(R.id.home_button_basal) ;
        Button questionmark = (Button)findViewById(R.id.questionmark);

        getData6 = getIntent().getExtras();
        boolean isMale = getData6.getBoolean("isMale");
        final String height_text = getData6.getString("height_text");
        final String weight_text = getData6.getString("weight_text");
        final String age_text = getData6.getString("age_text");
        final String goal = getData6.getString("goal");


        double ht = Integer.parseInt(height_text);
        double wt = Integer.parseInt(weight_text);
        int age = Integer.parseInt(age_text);


        if (isMale == true) {


            double bmr_male = (int) (66 + (13.75 * wt) + (5 * ht) - (6.8 * age));


            text_basal.setText("   " + (int) (bmr_male) + " kcal   ");


            if (goal.equals("lose")) {


                text_reach.setText("   " + (int) (bmr_male - 500) + " kcal   ");

                text_condition.setText("You should take " + text_reach.getText().toString() + " per day to lose weight");


            }
            if (goal.equals("gain")) {

                text_reach.setText("   " + (int) (bmr_male + 500) + " kcal   ");

                text_condition.setText("You should take " + text_reach.getText().toString() + " per day to gain weight");


            }
            if (goal.equals("stay")) {

                text_reach.setText("   " + (int) (bmr_male) + " kcal   ");

                text_condition.setText("You should take " + text_reach.getText().toString() + " per day to stay this weight");


            }}

        else  {


                double bmr_female = (int) (655 + (9.6 * wt) + (1.7 * ht) - (4.7 * age));


                text_basal.setText("   " + (int) (bmr_female) + " kcal   ");


                if (goal.equals("lose")) {


                    text_reach.setText("   " + (int) (bmr_female - 500) + " kcal   ");

                    text_condition.setText("You should take " + text_reach.getText().toString() + " per day to lose weight");


                }
                if (goal.equals("gain")) {

                    text_reach.setText("   " + (int) (bmr_female + 500) + " kcal   ");

                    text_condition.setText("You should take " + text_reach.getText().toString() + " per day to gain weight");


                }
                if (goal.equals("stay")) {

                    text_reach.setText("   " + (int) (bmr_female) + " kcal   ");

                    text_condition.setText("You should take " + text_reach.getText().toString() + " per day to stay this weight");


                }


            }

            home_basal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(Calculate_Basal.this,MainActivity.class);

                    startActivity(i);


                }
            });

        questionmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"The rate at which the body uses energy while at rest to maintain vital functions such as breathing and keeping warm",Toast.LENGTH_LONG).show();

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
