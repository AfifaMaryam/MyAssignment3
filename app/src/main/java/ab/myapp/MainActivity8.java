package ab.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    RadioGroup rGroup;
    RadioButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void ShowGender(View v){
        rGroup = findViewById(R.id.genderGroup);
        int selectedID = rGroup.getCheckedRadioButtonId();
        button = findViewById(selectedID);

        String value= button.getText().toString();
        Toast.makeText ( this, value,Toast.LENGTH_SHORT).show();

    }
}