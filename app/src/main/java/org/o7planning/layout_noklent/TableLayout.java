package org.o7planning.layout_noklent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
    }

    public void next(View view) {
        Intent nextIntent = new Intent(TableLayout.this, FrameLayout.class);
        startActivity(nextIntent);
    }

    public void close(View view) {
        finish();
    }
}