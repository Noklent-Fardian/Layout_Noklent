package org.o7planning.layout_noklent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        Intent NextIntent = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(NextIntent);
    }

    public void close(View view) {
        finish();
    }
}