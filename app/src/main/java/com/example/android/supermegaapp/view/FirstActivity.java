package com.example.android.supermegaapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.supermegaapp.HumanContract;
import com.example.android.supermegaapp.R;
import com.example.android.supermegaapp.presenter.HumanPresenter;

public class FirstActivity extends AppCompatActivity implements HumanContract.View {

    private final String FIRST_ACTIVITY = "FirstActivity";

    private HumanContract.Presenter presenter;

    private EditText etName;
    private EditText etSurname;
    private EditText etAge;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        presenter = new HumanPresenter(this);

        initViews();
        Log.d(FIRST_ACTIVITY, "onCreate");
    }

    public void initViews() {
        Log.d(FIRST_ACTIVITY, "initViews");
        etName = findViewById(R.id.etName);
        etSurname = findViewById(R.id.etSurname);
        etAge = findViewById(R.id.etAge);
        btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(v -> presenter.createButtonWasClicked(this));
    }

    @Override
    public boolean checkFields() {
        Log.d(FIRST_ACTIVITY, "checkFields");
        if (etName.getText().toString().matches("")) {
            showMessage(getResources().getString(R.string.name_text));
            return false;
        } else if (etSurname.getText().toString().matches("")) {
            showMessage(getResources().getString(R.string.surname_text));
            return false;
        } else if (etAge.getText().toString().matches("")) {
            showMessage(getResources().getString(R.string.age_text));
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void showMessage(String string) {
        Toast.makeText(this, "Empty " + string, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void closeActivity() {
        this.finish();
    }
}
