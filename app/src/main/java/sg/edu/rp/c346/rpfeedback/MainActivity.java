package sg.edu.rp.c346.rpfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText comment;
    Button comment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comment = (EditText)findViewById(R.id.editTextComment);
        String theText = comment.getText().toString();
        comment1 = (Button)findViewById(R.id.buttonComment);

        comment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,SecondActivity.class);
                intent.putExtra("TextBox", comment.getText().toString());
                startActivity(intent);
            }
        });


    }
}
