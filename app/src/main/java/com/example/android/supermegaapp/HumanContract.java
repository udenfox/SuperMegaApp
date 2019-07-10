package com.example.android.supermegaapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;

public interface HumanContract {
    interface View {
        void initViews();
        boolean checkFields();
        void showMessage(String string);
        <T extends android.view.View> T findViewById(@IdRes int id);
        void closeActivity();
    }

    interface Presenter {
        void createButtonWasClicked(Context context);
        void closeButtonWasClicked();
    }

    interface Model {
        Intent createHuman(String name, String surname, Integer age);
    }

}
