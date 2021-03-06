package pt.ipg.mensagemnivel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String name = "nome";
    public static final String number = "numero";
    public static final String email = "email";
    public static final String age = "idade";
    public static final String weight = "peso";
    public static final String height = "altura";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);
        String message_name = editText.getText().toString();
        intent.putExtra(name, message_name);

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message_number = editText2.getText().toString();
        intent.putExtra(number, message_number);

        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String message_email = editText3.getText().toString();
        intent.putExtra(email, message_email);

        EditText editText4 = (EditText) findViewById(R.id.editText4);
        String message_age = editText4.getText().toString();
        intent.putExtra(age, message_age);

        EditText editText5 = (EditText) findViewById(R.id.editText5);
        String message_weight = editText5.getText().toString();
        intent.putExtra(weight, message_weight);

        EditText editText6 = (EditText) findViewById(R.id.editText6);
        String message_height = editText6.getText().toString();
        intent.putExtra(height, message_height);

        startActivity(intent);
    }
}
