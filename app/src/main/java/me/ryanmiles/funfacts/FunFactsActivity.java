package me.ryanmiles.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button)findViewById(R.id.funFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factLabel.setText("");
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
