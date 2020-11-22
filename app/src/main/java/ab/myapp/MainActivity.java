package ab.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.t1);
       // tv.setText("New Text");
        String value = tv.getText().toString();

        Toast.makeText ( this, value,Toast.LENGTH_SHORT).show();
    }
}