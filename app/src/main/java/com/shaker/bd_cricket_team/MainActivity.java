package com.shaker.bd_cricket_team;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout player1,player2,player3,player4,player5,player6,player7,player8,player9,player10,player11,player12,player13;

    LinearLayout sakib,mahmudullah,musfiq,liton,mashrafe,tamim,sabbir,soumya,mosaddek,mithun,mustafiz,rubel,jayed,bd_cricket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        player3 = findViewById(R.id.player3);
        player4 = findViewById(R.id.player4);
        player5 = findViewById(R.id.player5);
        player6 = findViewById(R.id.player6);
        player7 = findViewById(R.id.player7);
        player8 = findViewById(R.id.player8);
        player9 = findViewById(R.id.player9);
        player10 = findViewById(R.id.player10);
        player11 = findViewById(R.id.player11);
        player12 = findViewById(R.id.player12);
        player13 = findViewById(R.id.player13);

        ///////////////////////////////////////////////////////////////

        sakib = findViewById(R.id.sakib);
        mahmudullah = findViewById(R.id.mahmudullah);
        musfiq = findViewById(R.id.musfiq);
        liton = findViewById(R.id.liton);
        mashrafe = findViewById(R.id.mashrafe);
        tamim = findViewById(R.id.tamim);
        sabbir = findViewById(R.id.sabbir);
        soumya = findViewById(R.id.soumya);
        mosaddek = findViewById(R.id.mosaddek);
        mithun = findViewById(R.id.mithun);
        mustafiz = findViewById(R.id.mustafiz);
        rubel = findViewById(R.id.rubel);
        jayed = findViewById(R.id.jayed);
        bd_cricket = findViewById(R.id.bd_cricket);

        /////////////////////////////////////////////////////////////////////////////


        player1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                sakib.setVisibility(View.VISIBLE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mahmudullah.setVisibility(View.VISIBLE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musfiq.setVisibility(View.VISIBLE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liton.setVisibility(View.VISIBLE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mashrafe.setVisibility(View.VISIBLE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tamim.setVisibility(View.VISIBLE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sabbir.setVisibility(View.VISIBLE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });

        player8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soumya.setVisibility(View.VISIBLE);
                sabbir.setVisibility(View.GONE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });



        player9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mosaddek.setVisibility(View.VISIBLE);
                soumya.setVisibility(View.GONE);
                sabbir.setVisibility(View.GONE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });



        player10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mithun.setVisibility(View.VISIBLE);
                mosaddek.setVisibility(View.GONE);
                soumya.setVisibility(View.GONE);
                sabbir.setVisibility(View.GONE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });

        player11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mustafiz.setVisibility(View.VISIBLE);
                mithun.setVisibility(View.GONE);
                mosaddek.setVisibility(View.GONE);
                soumya.setVisibility(View.GONE);
                sabbir.setVisibility(View.GONE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });

        player12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rubel.setVisibility(View.VISIBLE);
                mustafiz.setVisibility(View.GONE);
                mithun.setVisibility(View.GONE);
                mosaddek.setVisibility(View.GONE);
                soumya.setVisibility(View.GONE);
                sabbir.setVisibility(View.GONE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });


        player13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jayed.setVisibility(View.VISIBLE);
                rubel.setVisibility(View.GONE);
                mustafiz.setVisibility(View.GONE);
                mithun.setVisibility(View.GONE);
                mosaddek.setVisibility(View.GONE);
                soumya.setVisibility(View.GONE);
                sabbir.setVisibility(View.GONE);
                tamim.setVisibility(View.GONE);
                mashrafe.setVisibility(View.GONE);
                liton.setVisibility(View.GONE);
                musfiq.setVisibility(View.GONE);
                mahmudullah.setVisibility(View.GONE);
                sakib.setVisibility(View.GONE);
                bd_cricket.setVisibility(View.GONE);

            }
        });











    }
}