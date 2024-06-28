package com.chhavalit.shoestore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class HomeScreen extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        RelativeLayout cardLayout = findViewById(R.id.cardLayout1);
        Button button = findViewById(R.id.circular_button);
        drawerLayout = findViewById(R.id.drawer_layout);
        Button sidebarButton = findViewById(R.id.sidebarButton);
        LinearLayout homeScreenButton = findViewById(R.id.homeButton);
        LinearLayout settingButton = findViewById(R.id.settingButton);
        LinearLayout aboutUsButton = findViewById(R.id.aboutUsButton);
        LinearLayout LogoutButton = findViewById(R.id.LogoutButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(HomeScreen.this, Profile.class);
                startActivities(new Intent[]{intent});
            }
        });
        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, HomeScreen.class);
                startActivities(new Intent[]{intent});
            }
        });
        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, HomeScreen.class);
                startActivities(new Intent[]{intent});
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Profile.class);
                startActivities(new Intent[]{intent});
            }
        });
        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, AboutUs.class);
                startActivities(new Intent[]{intent});
            }
        });

        cardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, DetailItem.class);
                startActivities(new Intent[]{intent});
            }
        });
        sidebarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

    }
}

/* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/products/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // Create an instance of the ApiService interface
        ApiService apiService = retrofit.create(ApiService.class);
        Call<List<ProductModel>> call = apiService.getData();
        call.enqueue(new Callback<List<ProductModel>>() {
            @Override
            public void onResponse(Call<List<ProductModel>> call, Response<List<ProductModel>> response) {
                if (response.isSuccessful()) {
                    List<ProductModel> data = response.body();
                    // Handle the received data
                    Log.d("result",data.toString());
                } else {
                    Log.e("MainActivity", "Request failed: " + response.message());
                }
            }
            @Override
            public void onFailure(Call<List<ProductModel>> call, Throwable t) {
                Log.e("MainActivity", "Network error: ", t);
            }
        });*/