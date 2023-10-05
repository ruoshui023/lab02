package cn.sxh.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        Button counter_button = findViewById(R.id.counter_button);
       counter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.counter_text);
                System.out.println(textView.getText());
                textView.setText(String.valueOf(Integer.parseInt(textView.getText().toString())+1));
            }
        });
    }
}