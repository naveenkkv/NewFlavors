package com.example.naveenkumark.newflavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button launchFlavor = (Button)findViewById(R.id.button);
        launchFlavor.setOnClickListener(this);

        /*if(BuildConfig.PRODUCT_FLAVOR == "free") {

        } else {

        }*/
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, FlavorActivity.class));
    }
}
