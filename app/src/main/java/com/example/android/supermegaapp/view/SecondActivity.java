package com.example.android.supermegaapp.view;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.supermegaapp.HumanContract;
import com.example.android.supermegaapp.R;
import com.example.android.supermegaapp.entity.Human;
import com.example.android.supermegaapp.presenter.HumanPresenter;

public class SecondActivity extends AppCompatActivity implements HumanContract.View {

    private final String SECOND_ACTIVITY = "SecondActivity";

    private HumanContract.Presenter presenter;

    TextView tvInfo;
    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        presenter = new HumanPresenter(this);

        initViews();

        Intent intent = getIntent();
        Human human = intent.getParcelableExtra("Human");
        tvInfo.setText(human.getName() + " " + human.getSurname() + " " + human.getAge());
        Log.d(SECOND_ACTIVITY, "onCreate");
    }

    @Override
    public void initViews() {
        tvInfo = findViewById(R.id.tvHumanInfo);
        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> presenter.closeButtonWasClicked());
    }

    @Override
    public boolean checkFields() {
        return false;
    }

    @Override
    public void showMessage(String string) {

    }

    @Override
    public void closeActivity() {
        this.finish();
    }
}
