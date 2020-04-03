package pt.ipg.mensagemnivel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message_name = intent.getStringExtra(MainActivity.name);
        String message_number = intent.getStringExtra(MainActivity.number);
        String message_email = intent.getStringExtra(MainActivity.email);
        String message_age = intent.getStringExtra(MainActivity.age);
        String message_weight = intent.getStringExtra(MainActivity.weight);
        String message_height = intent.getStringExtra(MainActivity.height);

        TextView textName = findViewById(R.id.textName);
        textName.setText(message_name);

        TextView textNumber = findViewById(R.id.textNumber);
        textNumber.setText(message_number);

        TextView textEmail = findViewById(R.id.textEmail);
        textEmail.setText(message_email);

        TextView textAge = findViewById(R.id.textAge);
        textAge.setText(message_age);

        TextView textWeight = findViewById(R.id.textWeight);
        textWeight.setText(message_weight);

        TextView textHeight = findViewById(R.id.textHeight);
        textHeight.setText(message_height);
    }
}
