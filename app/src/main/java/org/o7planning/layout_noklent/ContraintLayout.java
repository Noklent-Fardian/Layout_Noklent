package org.o7planning.layout_noklent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
    }

    public void next(View view) {
        Intent NextIntent = new Intent(ContraintLayout.this, FrameLayout.class);
        startActivity(NextIntent);
    }

    public void close (View view) {
        finish();
    }
}