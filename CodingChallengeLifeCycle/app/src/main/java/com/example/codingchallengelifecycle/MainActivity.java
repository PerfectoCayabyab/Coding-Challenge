package com.example.codingchallengelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textView_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



      Intent intent = getIntent();

        String cheeseMessage = intent.getStringExtra(MainActivity2.ORDER_MESSAGE);


        if ("CHEESE".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_1);

            textView.setText(cheeseMessage);



        }

        if ("EGG".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_2);
            textView.setText(cheeseMessage);

        }

        if ("MILK".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_3);
            textView.setText(cheeseMessage);


        }

        if ("SALT".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_4);
            textView.setText(cheeseMessage);

        }

        if ("NOODLES".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_5);
            textView.setText(cheeseMessage);


        }

        if ("SUGAR".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_6);
            textView.setText(cheeseMessage);

        }

        if ("BREAD".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_7);
            textView.setText(cheeseMessage);


        }

        if ("CORN".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_8);
            textView.setText(cheeseMessage);

        }

        if ("CHICKEN".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_9);
            textView.setText(cheeseMessage);


        }

        if ("JUICE".equals(cheeseMessage)) {

            TextView textView = findViewById(R.id.textView_10);
            textView.setText(cheeseMessage);

        }




    }




    public void choose_order(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);


    }

    public void clearOrder(View view) {

        TextView textView1 = findViewById(R.id.textView_1);
        textView1.setText("ORDER 1");

        TextView textView2 = findViewById(R.id.textView_2);
        textView2.setText("ORDER 2");

        TextView textView3 = findViewById(R.id.textView_3);
        textView3.setText("ORDER 3");

        TextView textView4 = findViewById(R.id.textView_4);
        textView4.setText("ORDER 4");

        TextView textView5 = findViewById(R.id.textView_5);
        textView5.setText("ORDER 5");

        TextView textView6 = findViewById(R.id.textView_6);
        textView6.setText("ORDER 6");

        TextView textView7 = findViewById(R.id.textView_7);
        textView7.setText("ORDER 7");

        TextView textView8 = findViewById(R.id.textView_8);
        textView8.setText("ORDER 8");

        TextView textView9 = findViewById(R.id.textView_9);
        textView9.setText("ORDER 9");

        TextView textView10 = findViewById(R.id.textView_10);
        textView10.setText("ORDER 10");



    }
}