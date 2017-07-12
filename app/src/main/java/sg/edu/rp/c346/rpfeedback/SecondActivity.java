package sg.edu.rp.c346.rpfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDisplay = (TextView)findViewById(R.id.textView);

        Intent i = getIntent();
        String text = i.getStringExtra ("TextBox","" );
// Now set this value to EditText
        secondEditText.setText ( text );
        secondEditText.setEnable(false);


    }

}
