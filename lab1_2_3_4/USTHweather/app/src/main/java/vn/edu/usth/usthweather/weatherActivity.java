package vn.edu.usth.usthweather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class weatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment ff = ForecastFragment.newInstance("","");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i( "Weather", "OnStart() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "Weather", "onPause() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "Weather", "onDestroy() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "Weather", "onStop() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i( "Weather", "onResume() called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i( "Weather", "onCreate() called");
    }
}