package com.example.constraintdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.button, R.id.button2, R.id.button29, R.id.button30,R.id.button33, R.id.button34})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                openActivity(VerticalConstraintActivity.class);
                break;
            case R.id.button2:
                openActivity(HorizontalConstraintActivity.class);
                break;
            case R.id.button29:
                openActivity(CircularPosActivity.class);
                break;
            case R.id.button30:
                openActivity(BiasActivity.class);
                break;
            case R.id.button31:
                openActivity(BarriesrsActivity.class);
            break;
            case R.id.button33:
                openActivity(GuideLineActivity.class);
                break;
            case R.id.button34:
                openActivity(ProfileActivity.class);
                break;

        }
    }

    public <T extends Activity> void openActivity(Class<T> calledActivity) {
        Intent myIntent = new Intent(this, calledActivity);
        startActivity(myIntent);
    }
}
