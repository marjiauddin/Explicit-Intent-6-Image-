package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView title;
    private ImageView image;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        title = (TextView) findViewById(R.id.title);
        image = (ImageView) findViewById(R.id.image);
        description = (TextView) findViewById(R.id.description);

        title.setText(getIntent().getStringExtra("title"));
        image.setImageResource(getIntent().getIntExtra("img", R.drawable.kuakata));
        description.setText(getIntent().getStringExtra("description"));


    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();

    }
}
