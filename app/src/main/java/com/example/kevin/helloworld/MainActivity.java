package com.example.kevin.helloworld;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    int counter2 = 0;
    int animation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void prayer(View v){
        counter += 1*counter2;
        counter2 +=1;
        animation +=1;

        TextView counts=(TextView) findViewById(R.id.counts)  ;
        TextView multiplier=(TextView) findViewById(R.id.multiplierText)  ;
        multiplier.setText("Multiplier: "+ counter);
        counts.setText("Prayers: "+counter2);



//searching for the harambe images

        ImageView harambe = (ImageView) findViewById(R.id.harambe);
        ImageView harambeLeft = (ImageView)  findViewById(R.id.harambeLeft);
        ImageView harambeRight = (ImageView)  findViewById(R.id.harambeRight);



        if (counter > 4) {counter  -= 5; harambe.requestLayout();
            harambe.getLayoutParams().height += 5;
            harambe.getLayoutParams().width += 5;

            harambeRight.getLayoutParams().height += 5;
            harambeRight.getLayoutParams().width += 5;

            harambeLeft.getLayoutParams().height += 5;
            harambeLeft.getLayoutParams().width += 5;}



        if (animation == 2) {
            harambe.setVisibility(View.INVISIBLE);
            harambeRight.setVisibility(View.INVISIBLE);
            harambeLeft.setVisibility(View.VISIBLE);}
        if (animation == 4) {
            harambe.setVisibility(View.INVISIBLE);
            harambeRight.setVisibility(View.VISIBLE);
            harambeLeft.setVisibility(View.INVISIBLE);}
        if (animation == 6) { animation = 0;
            harambe.setVisibility(View.VISIBLE);
            harambeRight.setVisibility(View.INVISIBLE);
            harambeLeft.setVisibility(View.INVISIBLE);}





    }
    public void HarambeGrow(View c){



    }
}
