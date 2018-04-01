package com.riontech.learnjava;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 Created by suresh dobariya
 */

public class Introduction extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.introduction_java);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        String tital=getIntent().getStringExtra("srd");
        actionBar.setTitle(tital);
        String desc=getIntent().getStringExtra("des");
        TextView txt=(TextView)findViewById(R.id.textView);
        txt.setText(desc);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }

}
