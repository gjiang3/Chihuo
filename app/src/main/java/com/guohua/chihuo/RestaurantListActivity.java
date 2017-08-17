package com.guohua.chihuo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        // Get ListView object from xml.
        ListView restaurantListView = (ListView) findViewById(R.id.restaurant_list);


        // Initialize an adapter.
        RestaurantAdapter adapter = new RestaurantAdapter(this);

        // Assign adapter to ListView.
        restaurantListView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life cycle test", "We are at onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life cycle test", "We are at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life cycle test", "We are at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life cycle test", "We are at onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life cycle test", "We are at onDestroy()");
    }


}
