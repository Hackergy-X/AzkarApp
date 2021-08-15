package com.programming.Azkar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Page1 extends AppCompatActivity {
    ImageView P1,P2,P3,P4,P5,P6,P7,P8,Pa1,Pa2,Pa3,Pa4,Pa5,Pa6,Pa7,Pa8,Pl1,Pl2,Pl3,Pl4,Pl5,Pl6,Pl7,Pl8,M1,M2,M3,M4,M5,M6,M7,M8;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8;
    int ss1=15;
    int ss2=15;
    int ss3=15;
    int ss4=15;
    int ss5=15;
    int ss6=15;
    int ss7=15;
    int ss8=15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        P1 = (ImageView)findViewById(R.id.Play1);
        P2 = (ImageView)findViewById(R.id.Play2);
        P3  = (ImageView)findViewById(R.id.Play3);
        P4  = (ImageView)findViewById(R.id.Play4);
        P5  = (ImageView)findViewById(R.id.Play5);
        P6  = (ImageView)findViewById(R.id.Play6);
        P7  = (ImageView)findViewById(R.id.Play7);
        P8  = (ImageView)findViewById(R.id.Play8);
        /////////////////////////////////////////
        Pa1 = (ImageView)findViewById(R.id.Pause1);
        Pa2 = (ImageView)findViewById(R.id.pause2);
        Pa3 = (ImageView)findViewById(R.id.pause3);
        Pa4= (ImageView)findViewById(R.id.pause4);
        Pa5= (ImageView)findViewById(R.id.pause5);
        Pa6 = (ImageView)findViewById(R.id.pause6);
        Pa7 = (ImageView)findViewById(R.id.pause7);
        Pa8 = (ImageView)findViewById(R.id.pause8);
        ////////////////////////////////////////////
        Pl1 = (ImageView)findViewById(R.id.plus1);
        Pl2 = (ImageView)findViewById(R.id.plus2);
        Pl3 = (ImageView)findViewById(R.id.plus3);
        Pl4 = (ImageView)findViewById(R.id.plus4);
        Pl5 = (ImageView)findViewById(R.id.plus5);
        Pl6 = (ImageView)findViewById(R.id.plus6);
        Pl7 = (ImageView)findViewById(R.id.plus7);
        Pl8 = (ImageView)findViewById(R.id.plus8);
        /////////////////////////////////////////////////
        M1 = (ImageView)findViewById(R.id.moins1);
        M2 = (ImageView)findViewById(R.id.moins2);
        M3 = (ImageView)findViewById(R.id.moins3);
        M4 = (ImageView)findViewById(R.id.moins4);
        M5 = (ImageView)findViewById(R.id.moins5);
        M6 = (ImageView)findViewById(R.id.moins6);
        M7 = (ImageView)findViewById(R.id.moins7);
        M8 = (ImageView)findViewById(R.id.moins8);
        ////////////////////////////////////////////////
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);
        t7=(TextView)findViewById(R.id.t7);
        t8=(TextView)findViewById(R.id.t8);
        /////////////////////////////////////////////
        mp1 = MediaPlayer.create(this,R.raw.t1);
        mp2 = MediaPlayer.create(this,R.raw.t2);
        mp3 = MediaPlayer.create(this,R.raw.t3);
        mp4 = MediaPlayer.create(this,R.raw.t4);
        mp5 = MediaPlayer.create(this,R.raw.t5);
        mp6 = MediaPlayer.create(this,R.raw.t6);
        mp7 = MediaPlayer.create(this,R.raw.t7);
        mp8 = MediaPlayer.create(this,R.raw.t8);
        ///////////////////////////////////////////////////////
        t1.setTextSize(ss1);
        t2.setTextSize(ss2);
        t3.setTextSize(ss3);
        t4.setTextSize(ss4);
        t5.setTextSize(ss5);
        t6.setTextSize(ss6);
        t7.setTextSize(ss7);
        t8.setTextSize(ss8);

        //////////////////////////////////////////////
        P1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        P2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        P3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();

            }
        });
        P4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();

            }
        });
        P5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();

            }
        });
        P6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();

            }
        });
        P7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();

            }
        });
        P8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();

            }
        });
        Pa1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.pause();

            }
        });
        Pa2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();

            }
        });
        Pa3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();

            }
        });
        Pa4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.pause();

            }
        });
        Pa5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.pause();

            }
        });
        Pa6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.pause();

            }
        });
        Pa7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.pause();

            }
        });
        Pa8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.pause();

            }
        });
        Pl1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss1 < 40){
                    ss1++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t1.setTextSize(ss1);
            }
        });
        Pl2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss2 < 40){
                    ss2++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t2.setTextSize(ss2);

            }
        });
        Pl3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss3 < 40){
                    ss3++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t3.setTextSize(ss3);

            }
        });
        Pl4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss4 < 40){
                    ss4++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t4.setTextSize(ss4);

            }
        });
        Pl5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss5 < 40){
                    ss5++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t5.setTextSize(ss5);

            }
        });
        Pl6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss6 < 40){
                    ss6++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t6.setTextSize(ss6);

            }
        });
        Pl7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss7 < 40){
                    ss7++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t7.setTextSize(ss7);

            }
        });
        Pl8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss8 < 40){
                    ss8++;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تكبير النص اكثر !!!!", Toast.LENGTH_SHORT).show();
                }
                t8.setTextSize(ss8);

            }
        });
        M1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ss1 > 15){
                    ss1--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t1.setTextSize(ss1);

            }
        });
        M2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss2 > 15){
                    ss2--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t2.setTextSize(ss2);

            }
        });
        M3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss3 > 15){
                    ss3--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t3.setTextSize(ss3);

            }
        });
        M4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss4 > 15){
                    ss4--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t4.setTextSize(ss4);

            }
        });
        M5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss5 > 15){
                    ss5--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t5.setTextSize(ss5);

            }
        });
        M6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss6 > 15){
                    ss6--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t6.setTextSize(ss6);

            }
        });
        M7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss7 > 15){
                    ss7--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t7.setTextSize(ss7);

            }
        });
        M8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss8 > 15){
                    ss8--;
                }else{
                    Toast.makeText(Page1.this, "لا يمكنك تصغير النص اكثرر !!!!", Toast.LENGTH_SHORT).show();
                }
                t8.setTextSize(ss8);

            }
        });
    }
}
