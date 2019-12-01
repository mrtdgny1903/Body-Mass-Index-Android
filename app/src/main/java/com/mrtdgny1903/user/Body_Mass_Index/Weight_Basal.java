package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Weight_Basal extends AppCompatActivity {

    public Bundle getData3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight__basal);

        final EditText editText_weight_basal = (EditText)findViewById(R.id.editText_weight_basal);
        Button Button_weight_basal = (Button)findViewById(R.id.Button_weight_basal);

        getData3 = getIntent().getExtras();

        final boolean isMale= getData3.getBoolean("isMale");
        final String height_text = getData3.getString("height_text");

        Button_weight_basal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText_weight_basal.getText().toString().trim().equals("")) {

                    Toast.makeText(getApplicationContext(), "Please fill the blank", Toast.LENGTH_SHORT).show();


                } else{


                String weight_text = editText_weight_basal.getText().toString();

                Bundle Bundle4 = new Bundle();

                Bundle4.putBoolean("isMale",isMale);
                Bundle4.putString("height_text",height_text);
                Bundle4.putString("weight_text",weight_text);



                Intent i = new Intent(Weight_Basal.this,Age_Basal.class);

                i.putExtras(Bundle4);


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