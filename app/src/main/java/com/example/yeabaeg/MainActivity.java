package com.example.yeabaeg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import kotlinx.coroutines.selects.WhileSelectKt;

public class MainActivity extends AppCompatActivity {

    TextView tvProgressLabel;

    //카테고리 부분
    int count = 0;
    ImageButton sofa_btn, nature_btn, photo_btn, roomcafe_btn, study_btn, famous_btn, bartender_btn, dessert_btn, rooftop_btn;

    //옵션 부분
    boolean i = true;
    Button prohibition_icon_button, parking_icon_button, smoking_icon_button, vegan_icon_button, nokidszone_icon_button, hour24_icon_button;
    ImageView prohibition_icon_background, parking_icon_background, smoking_icon_background, vegan_icon_background ,nokidszone_icon_background, hour24_icon_background;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set a change listener on the SeekBar
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(seekBarChangeListener);

        int progress = seekBar.getProgress();
        tvProgressLabel = findViewById(R.id.textView);
        tvProgressLabel.setText("잔여 좌석: " + progress);

        //카테고리 부분
        sofa_btn = (ImageButton)findViewById(R.id.sofa_btn);
        sofa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "편한 의자를 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        nature_btn = (ImageButton)findViewById(R.id.nature_btn);
        nature_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "자연을 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        photo_btn = (ImageButton)findViewById(R.id.photo_btn);
        photo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "분위기 있는을 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        roomcafe_btn = (ImageButton)findViewById(R.id.roomcafe_btn);
        roomcafe_btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "룸 카페를 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        study_btn = (ImageButton)findViewById(R.id.studycafe_btn);
        study_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "카공을 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        famous_btn = (ImageButton)findViewById(R.id.famous_btn);
        famous_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "인기 있는을 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        bartender_btn = (ImageButton)findViewById(R.id.bartender_btn);
        bartender_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "개인 카페를 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        dessert_btn = (ImageButton)findViewById(R.id.dessert_btn);
        dessert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "디저트를 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        rooftop_btn = (ImageButton)findViewById(R.id.rooftop_btn);
        rooftop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "루프탑을 선택 하셨습니다.", Toast.LENGTH_SHORT).show();
            }
        });



        //옵션 부분
        prohibition_icon_button = (Button)findViewById(R.id.prohibition_icon_button);
        prohibition_icon_background = (ImageView)findViewById(R.id.prohibition_icon_background);

        parking_icon_button = (Button)findViewById(R.id.parking_icon_button);
        parking_icon_background = (ImageView)findViewById(R.id.parking_icon_background);

        smoking_icon_button = (Button)findViewById(R.id.smoking_icon_button);
        smoking_icon_background = (ImageView)findViewById(R.id.smoking_icon_background);

        vegan_icon_button = (Button)findViewById(R.id.vegan_icon_button);
        vegan_icon_background = (ImageView)findViewById(R.id.vegan_icon_background);

        nokidszone_icon_button = (Button)findViewById(R.id.nokidszone_icon_button);
        nokidszone_icon_background = (ImageView)findViewById(R.id.nokidszone_icon_background);

        hour24_icon_button = (Button)findViewById(R.id.hour24_icon_button);
        hour24_icon_background = (ImageView)findViewById(R.id.hour24_icon_background);

        prohibition_icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    prohibition_icon_background.setImageResource(R.drawable.action_rectangle);
                    i = false;
                }else{
                    prohibition_icon_background.setImageResource(R.drawable.rectangle);
                    i = true;
                }
            }
        });

        parking_icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    parking_icon_background.setImageResource(R.drawable.action_rectangle);
                    i = false;
                }else{
                    parking_icon_background.setImageResource(R.drawable.rectangle);
                    i = true;
                }
            }
        });

        smoking_icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    smoking_icon_background.setImageResource(R.drawable.action_rectangle);
                    i = false;
                }else{
                    smoking_icon_background.setImageResource(R.drawable.rectangle);
                    i = true;
                }
            }
        });

        vegan_icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    vegan_icon_background.setImageResource(R.drawable.action_rectangle);
                    i = false;
                }else{
                    vegan_icon_background.setImageResource(R.drawable.rectangle);
                    i = true;
                }
            }
        });

        nokidszone_icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    nokidszone_icon_background.setImageResource(R.drawable.action_rectangle);
                    i = false;
                }else{
                    nokidszone_icon_background.setImageResource(R.drawable.rectangle);
                    i = true;
                }
            }
        });

        hour24_icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == true){
                    hour24_icon_background.setImageResource(R.drawable.action_rectangle);
                    i = false;
                }else{
                    hour24_icon_background.setImageResource(R.drawable.rectangle);
                    i = true;
                }
            }
        });
    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            tvProgressLabel.setText("잔여 좌석: " + progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };


}