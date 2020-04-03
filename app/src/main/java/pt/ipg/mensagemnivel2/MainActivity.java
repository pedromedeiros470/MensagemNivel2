package pt.ipg.mensagemnivel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String name = "";
    public static final String number = "";
    public static final String email = "";
    public static final String age = "";
    public static final String weight = "";
    public static final String height = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message1 = editText.getText().toString();
        intent.putExtra(name, message1);
        String message2 = editText.getText().toString();
        intent.putExtra(number, message2);
        String message3 = editText.getText().toString();
        intent.putExtra(email, message3);
        String message4 = editText.getText().toString();
        intent.putExtra(age, message4);
        String message5 = editText.getText().toString();
        intent.putExtra(weight, message5);
        String message6 = editText.getText().toString();
        intent.putExtra(height, message6);
        startActivity(intent);
    }
}
