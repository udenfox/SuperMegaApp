package com.example.android.supermegaapp.model;

import android.content.Intent;
import android.util.Log;

import com.example.android.supermegaapp.HumanContract;
import com.example.android.supermegaapp.entity.Human;

public class HumanModel implements HumanContract.Model {
    private final static String ACTION_SHOW_HUMAN_INFO = "SHOW_HUMAN_INFORMATION";
    private final static String TAG_HUMAN = "Human";
    private final static String TAG_HUMAN_MODEL = "HumanModel";

    @Override
    public Intent createHuman(String name, String surname, Integer age) {
        Log.d(TAG_HUMAN_MODEL, "createHuman");
        Human human = new Human(name, surname, age);
        Intent intent = new Intent(ACTION_SHOW_HUMAN_INFO);
        intent.putExtra(TAG_HUMAN, human);
        return intent;
    }
}
