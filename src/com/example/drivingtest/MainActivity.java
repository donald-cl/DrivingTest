package com.example.drivingtest;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

    private Resources res = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionview);
        res = getResources();
        initializeQuestion();
    }

    private void initializeQuestion() {

        Question one = new Question("question 1", R.drawable.caution_narrowbridge_sign);

        ImageView x = (ImageView) findViewById(R.id.questionImage);
        x.setImageDrawable(res.getDrawable(one.getImageUri()));

        RadioGroup answers = (RadioGroup) findViewById(R.id.answers);
        RadioButton answer1 = (RadioButton) answers.getChildAt(0);
        RadioButton answer2 = (RadioButton) answers.getChildAt(1);
        RadioButton answer3 = (RadioButton) answers.getChildAt(2);

        answer1.setText("herroh1");
        answer2.setText("herroh2");
        answer3.setText("herroh3");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
