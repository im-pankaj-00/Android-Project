package com.pankajsharma.bottomnavigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    private final int ID_HOME = 1;
    private final int ID_MESSAGE = 2;
    private final int ID_ADD = 3;
    private final int ID_NOTIFICATION = 4;
    private final int ID_PROFILE = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.page_title);
        MeowBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME , R.drawable.home));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_MESSAGE , R.drawable.message));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_ADD , R.drawable.add));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_NOTIFICATION , R.drawable.notifications));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PROFILE , R.drawable.profile));


        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                //navigate user
            }
        });

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                String name;
                switch (item.getId()){
                    case ID_HOME:
//                        name = "HOME";
                        break;
                    case ID_MESSAGE:
//                        name = "MESSAGE";
                        break;
                    case ID_ADD:
//                        name = "ADD";
                        break;
                    case ID_NOTIFICATION:
//                        name = "NOTIFICATION";
                        break;
                    case ID_PROFILE:
//                        name = "PROFILE";
                        break;
                    default:
                        name = "";

                }

//                textView.setText(getString(R.string.page_title , name));

            }
        });

        bottomNavigation.show(ID_HOME , true);

    }
}