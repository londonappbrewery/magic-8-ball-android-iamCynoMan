package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;
    Button mButton;
    TextView mTextView;
    final int[] lovearray= new int[]{
            R.drawable.heart1,
            R.drawable.heart2,
            R.drawable.heart3
    };

    Random mRandom=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView=(ImageView)findViewById(R.id.imageholder);
        mButton=(Button)findViewById(R.id.askbutton);
        mTextView=(TextView)findViewById(R.id.textView);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mImageView.setImageResource(lovearray[mRandom.nextInt(3)]);

            }
        });

    }
}
