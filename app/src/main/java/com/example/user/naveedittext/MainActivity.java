package com.example.user.naveedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 Button btn12;
 ImageView img12;
 EditText edt12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn12);
        findViewById(R.id.txv);
        findViewById(R.id.edt);
    }

    public void go(View view) {
        
    }
}
