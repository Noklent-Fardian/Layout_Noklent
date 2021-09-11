package org.o7planning.layout_noklent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
    }

    public void next(View view) {
        Intent NextIntent = new Intent(FrameLayout.this, TableLayout.class);
        startActivity(NextIntent);
    }

    public void close (View view) {
        finish();
    }
}