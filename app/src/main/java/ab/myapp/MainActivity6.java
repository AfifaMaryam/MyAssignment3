package ab.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity6 extends AppCompatActivity {

    ToggleButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void ToogleChecked(View v){
        btn = findViewById(R.id.toggle);
        if (btn.isChecked()){
            btn.setTextOn("Toggle On");
            Toast.makeText ( this, "Button On",Toast.LENGTH_SHORT).show();
        }
        else{
            btn.setTextOff("Toggle Off");
            Toast.makeText ( this, "Button Off",Toast.LENGTH_SHORT).show();
        }
    }
}