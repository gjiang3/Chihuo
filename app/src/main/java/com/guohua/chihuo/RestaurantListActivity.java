package com.guohua.chihuo;

import android.content.res.Configuration;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class RestaurantListActivity extends AppCompatActivity implements RestaurantListFragment.OnItemSelectListener {

    RestaurantListFragment listFragment;
    RestaurantGridFragment gridFragment;

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);
        Log.e("Life cycle test", "We are at onCreate()");

        listFragment = new RestaurantListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_list_container, listFragment).commit();

//        new AsyncTask<Void, Void, Void>(){
//            @Override
//            protected Void doInBackground(Void... params) {
//                YelpApi yelp = new YelpApi();
//                yelp.searchForBusinessesByLocation("dinner", "San Francisco, CA", 20);
//                return null;
//            }
//        }.execute();
//
//
//        if (findViewById(R.id.fragment_container) != null) {
//            listFragment =  new RestaurantListFragment();
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragment_container, listFragment).commit();
//        }
//
//

    }

    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) >=
                Configuration.SCREENLAYOUT_SIZE_LARGE;
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

    @Override
    public void onItemSelected(int position) {
        gridFragment.onItemSelected(position);
    }

}
