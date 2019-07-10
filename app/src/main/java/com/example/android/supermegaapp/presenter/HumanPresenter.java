package com.example.android.supermegaapp.presenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.EditText;

import com.example.android.supermegaapp.HumanContract;
import com.example.android.supermegaapp.R;
import com.example.android.supermegaapp.model.HumanModel;

public class HumanPresenter implements HumanContract.Presenter {

    private final static String TAG_HUMAN_PRESENTER = "HumanPresenter";

    private HumanContract.View view;
    private HumanContract.Model model;

    public HumanPresenter(HumanContract.View view) {
        this.view = view;
        this.model = new HumanModel();
        Log.d(TAG_HUMAN_PRESENTER, "HumanPresenter: init");
    }

    @Override
    public void createButtonWasClicked(Context context) {
        if (view.checkFields()) {
            Log.d(TAG_HUMAN_PRESENTER, "Fields not empty!");
            EditText etName = view.findViewById(R.id.etName);
            EditText etSurname = view.findViewById(R.id.etSurname);
            EditText etAge = view.findViewById(R.id.etAge);
            Intent intent = model.createHuman(etName.getText().toString(),
                    etSurname.getText().toString(),
                    Integer.parseInt(etAge.getText().toString()));
            context.startActivity(intent);
        }
    }
}
