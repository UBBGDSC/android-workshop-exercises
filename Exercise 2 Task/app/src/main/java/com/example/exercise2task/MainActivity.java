package com.example.exercise2task;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * <h2>Exercise 2 <em>(15 minutes)</em>:</h1>
 * <ul>
 * <li>a) Change the code below so that this app has 2 fragments (screens):
 * a home screen and a 2<sup>nd</sup> screen. Keep the Submit <code>Button</code>
 * and <code>EditText</code> on the first screen. Move the <code>TextView</code>
 * to the 2<sup>nd</sup> screen
 * On pressing the Submit button,
 * the user will be taken to the 2<sup>nd</sup> screen.</li>
 * <li>b) Use a <code>ViewModel</code> to store the text
 * typed by the user in the <code>TextEdit</code> </li>
 * </ul>
 * */
public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Log.v("GDG", "Text from TextEdit: " + text);
                textView.setText(text);
            }
        });
    }
}