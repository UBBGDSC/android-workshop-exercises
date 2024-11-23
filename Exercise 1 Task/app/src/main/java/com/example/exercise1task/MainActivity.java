package com.example.exercise1task;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/**
 * <h2>Exercise 1 <em>(10 minutes)</em>:</h2>
 * <ul>
 * <li>a) Add an <code>EditText</code> to your layout.</li>
 * <li>b) Add a <code>Button</code> that, when clicked, will make your app
 * log the text input given by the user using <code>Log.v()</code>.</li>
 * <li>c) Show the result in a <code>TextView</code>.</li>
 * </ul>
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

}