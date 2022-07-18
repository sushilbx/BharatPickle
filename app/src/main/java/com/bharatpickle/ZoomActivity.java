package com.bharatpickle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bharatpickle.models.GetProductModel;
import com.bharatpickle.models.ImageModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoomActivity extends AppCompatActivity {
    SessionManager sessionManager;
    String url = Utils.URL + "get_image";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        Intent intent = new Intent();
        String value = intent.getStringExtra("data");

        Gson gson = new Gson();
        String jsonOutput = value;
        Type listType = new TypeToken<List<ImageModel>>(){}.getType();
        List<ImageModel> images = gson.fromJson(jsonOutput, listType);

    }
}