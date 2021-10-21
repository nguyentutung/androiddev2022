package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

public class weatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.header);
        tabLayout.setupWithViewPager(pager);
        Log.i("Weather", "onCreate() called");

       // ForecastFragment ff = new ForecastFragment();
       // getSupportFragmentManager().beginTransaction().replace(
        //        R.id.container, ff).commit();

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



    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
      //  getMenuInflater().ìnflate(R.menu.main_menu, menu);
        //return true;

 }

    //@Override
    //public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      //  if (item.getItemId() == R.id.search) {
        //    Log.i("Weather","Menu search Clicked");
          //  return true;
        //}
        //return super.onOptionsItemSelected(item);
    //}

    class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public int getCount() {
            return PAGE_COUNT; // number of pages for a ViewPager
        }
        @Override
        public Fragment getItem(int page) {

            switch (page) {
                case 0:
                    return new WeatherForecastFragment();
                case 1:
                    return new WeatherForecastFragment();
                case 2:
                    return new WeatherForecastFragment();
            }
            return new Fragment();
        }
        @Override
        public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
            return titles[page];
        }
    }



