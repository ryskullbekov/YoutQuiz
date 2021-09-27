package com.example.youtquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.logging.Level;

public class levelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        findViewById(R.id.first_level).setOnClickListener(view -> {
            QuestionModel questionModel = new QuestionModel();
            questionModel.setCurrentLevel("1 Уровень");
            questionModel.setQuestion("Что первое в мире появилось?");
            questionModel.setFirstVariant("Курица");
            questionModel.setSecondVariant("Яйцо");
            questionModel.setThirdVariant("Петух");
            questionModel.setFourVariant("Скорлупа");
            questionModel.setAnswer("Курица");
            Intent intent = new Intent(levelActivity.this, gameActivity.class);
            intent.putExtra("KEY",questionModel);
            startActivity(intent);
        });

        findViewById(R.id.second_level).setOnClickListener(view -> {
            QuestionModel questionModel = new QuestionModel();
            questionModel.setCurrentLevel("2 Уровень");
            questionModel.setQuestion("Зимой и летом одним цветом");
            questionModel.setFirstVariant("Кровь");
            questionModel.setSecondVariant("Глаза");
            questionModel.setThirdVariant("Ель");
            questionModel.setFourVariant("Президент");
            questionModel.setAnswer("Ель");
            Intent intent = new Intent(levelActivity.this, gameActivity.class);
            intent.putExtra("KEY",questionModel);
            startActivity(intent);
        });
    }
}