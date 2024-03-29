package com.bharatpickle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    MaterialToolbar mtHomeNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottom_navigation = findViewById(R.id.bottom_navigation);
        mtHomeNotification= findViewById(R.id.mtHomeNotification);



        bottom_navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.category: {
                        selectedFragment = new CategoryFragment();
                        break;

                    }
                    case R.id.home: {
                        selectedFragment = new HomeFragment();
                        break;
                    }
                    case R.id.cart: {
                        selectedFragment = new CartFragment();
                        break;
                    }

                    case R.id.account: {
                        selectedFragment = new AccountFragment();
                        break;
                    }

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
                return true;
            }

        });

        bottom_navigation.setSelectedItemId(R.id.home);

      mtHomeNotification.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
          @Override
          public boolean onMenuItemClick(MenuItem item) {
              if (item.getItemId()==R.id.menuNotification){
                  Intent intent = new Intent(HomeActivity.this,NotificationActivity.class);
                  startActivity(intent);
              }
              return false;
          }
      });
    }
}