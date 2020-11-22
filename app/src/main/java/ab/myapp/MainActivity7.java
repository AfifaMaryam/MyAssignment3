package ab.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    CheckBox c1, c2, c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        c1 = findViewById(R.id.check1);
        c2 = findViewById(R.id.check2);
        c3 = findViewById(R.id.check3);
    }

    public void GetValues(View v) {
        StringBuilder builder = new StringBuilder();
        if (c1.isChecked()) {
            String value1 = c1.getText().toString();
            builder.append(value1);

        }
        if (c2.isChecked()) {
            String value2 = c2.getText().toString();
            builder.append("\n"+value2);
        }
        if (c3.isChecked()) {
            String value3 = c3.getText().toString();
            builder.append("\n"+value3);
        }
        Toast.makeText ( this, builder,Toast.LENGTH_SHORT).show();
    }
}