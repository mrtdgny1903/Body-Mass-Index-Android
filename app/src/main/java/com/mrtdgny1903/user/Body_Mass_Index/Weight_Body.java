package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Weight_Body extends AppCompatActivity {

    public Bundle getData3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight__body);

        final EditText editText_weight = (EditText)findViewById(R.id.editText_weight);
        final Button Button_weight = (Button)findViewById(R.id.Button_weight);

        getData3 = getIntent().getExtras();

        final boolean isMale= getData3.getBoolean("isMale");
        final String height_text = getData3.getString("height_text");

        Button_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (editText_weight.getText().toString().trim().equals("")) {

                    Toast.makeText(getApplicationContext(), "Please fill the blank", Toast.LENGTH_SHORT).show();


                } else{


                    String weight_text = editText_weight.getText().toString();

                Bundle Bundle4 = new Bundle();

                Bundle4.putBoolean("isMale", isMale);
                Bundle4.putString("height_text", height_text);
                Bundle4.putString("weight_text", weight_text);


                Intent i = new Intent(Weight_Body.this, Calculate_Body.class);

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
