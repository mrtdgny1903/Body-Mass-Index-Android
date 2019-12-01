package com.mrtdgny1903.user.Body_Mass_Index;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Height_Body extends AppCompatActivity {

    public Bundle getData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height__body);

        final EditText editText_height = (EditText)findViewById(R.id.editText_height);
        Button Button_height = (Button)findViewById(R.id.Button_height);


        getData2 = getIntent().getExtras();

        final boolean isMale= getData2.getBoolean("isMale");



        Button_height.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText_height.getText().toString().trim().equals("")) {

                    Toast.makeText(getApplicationContext(), "Please fill the blank", Toast.LENGTH_SHORT).show();


                } else{

                String height_text = editText_height.getText().toString();

                Bundle Bundle3 = new Bundle();
                Bundle3.putBoolean("isMale",isMale);
                Bundle3.putString("height_text",height_text);



                Intent i = new Intent(Height_Body.this,Weight_Body.class);

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
