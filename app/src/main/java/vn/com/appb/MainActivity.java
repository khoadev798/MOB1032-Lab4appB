package vn.com.appb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String alo = getIntent().getStringExtra("text");
        Toast.makeText(this,alo,Toast.LENGTH_LONG).show();
    }
}
