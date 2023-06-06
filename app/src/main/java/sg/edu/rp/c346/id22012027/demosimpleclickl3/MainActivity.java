package sg.edu.rp.c346.id22012027.demosimpleclickl3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button buttonDisplay;
    TextView TextViewDisplay;
    EditText EditTextInput;
    ToggleButton ToggleButtonEnabled;
    RadioGroup radioGroupGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisplay= findViewById(R.id.buttonDisplay);
        TextViewDisplay= findViewById(R.id.textViewDisplay);
        EditTextInput= findViewById(R.id.editTextInput);
        ToggleButtonEnabled= findViewById(R.id.toggleButtonEnabled);
        radioGroupGender= findViewById(R.id.radioGroupGender);

        ToggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ToggleButtonEnabled.isChecked()) {
                    EditTextInput.setEnabled(true);
                } else {
                    EditTextInput.setEnabled(false);
                }
            }
        });

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ToggleButtonEnabled.isChecked()) {
                    String stringResponse = EditTextInput.getText().toString();
                    int checkedRadioId = radioGroupGender.getCheckedRadioButtonId();
                    if (checkedRadioId == R.id.radioButtonGenderMale) {
                        TextViewDisplay.setText("he says " + stringResponse);
                    } else {
                        TextViewDisplay.setText("she says " + stringResponse);
                    }
                }
            }
        });
    }
}
