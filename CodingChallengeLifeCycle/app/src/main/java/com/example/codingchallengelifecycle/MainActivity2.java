package com.example.codingchallengelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    public static final String ORDER_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";

    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mLocationEditText = findViewById(R.id.store_location);

    }

    public void clickCheese(View view) {

        String cheese = "CHEESE";
        Intent cheeseIntent = new Intent(this, MainActivity.class);
        cheeseIntent.putExtra(ORDER_MESSAGE, cheese);
        startActivity(cheeseIntent);

    }

    public void clickEgg(View view) {

        String egg = "EGG";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);


    }

    public void clickMilk(View view) {

        String egg = "MILK";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickSalt(View view) {

        String egg = "SALT";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickNoodles(View view) {

        String egg = "NOODLES";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickSugar(View view) {

        String egg = "SUGAR";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickBread(View view) {

        String egg = "BREAD";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickCorn(View view) {

        String egg = "CORN";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickChicken(View view) {

        String egg = "CHICKEN";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickJuice(View view) {

        String egg = "JUICE";
        Intent eggIntent = new Intent(this, MainActivity.class);
        eggIntent.putExtra(ORDER_MESSAGE, egg);
        startActivity(eggIntent);

    }

    public void clickSearch(View view) {

        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc );
        Intent intent = new Intent(Intent.ACTION_VIEW,addressUri);

        if(intent.resolveActivity(getPackageManager()) == null){

            startActivity(intent);

        }

        else{

            Log.d("Content Error", "clickSearch: ");

        }

    }
}