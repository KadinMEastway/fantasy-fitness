package com.example.fantasy_fitness_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends BaseActivity {
    public User user;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            user = extras.getParcelable("user");
        } else {
            user = new User("User");
        }

        TextView test = findViewById(R.id.textView);
        test.setText(user.getUsername());
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_home;
    }

    /**
     * Handles the Logout button click. Creates an intent to switch to the login activity.
     *
     * @param view The view that was clicked (the Logout button).
     */
    public void onClickLogout(android.view.View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
