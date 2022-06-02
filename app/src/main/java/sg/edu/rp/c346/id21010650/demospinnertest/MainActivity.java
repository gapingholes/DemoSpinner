package sg.edu.rp.c346.id21010650.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spinnerYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        spinnerYesNo = findViewById(R.id.spinnerYesNo);


        spinnerYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent,View view,int position,long id) {
                switch (position) {
                    case 0:
                        textView.setText("   Spinner item, Yes selected");
                        break;
                    case 1:
                        textView.setText("   Spinner item, No selected");
                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        }
    }