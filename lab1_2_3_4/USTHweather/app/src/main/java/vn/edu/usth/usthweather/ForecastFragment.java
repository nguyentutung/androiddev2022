package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.graphics.Color;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    //private String mParam1;
    //private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    //public static ForecastFragment newInstance(String param1, String param2) {
      //  ForecastFragment fragment = new ForecastFragment();
        //Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        //fragment.setArguments(args);
        //return fragment;
    //}

    //@Override
    //public void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        //if (getArguments() != null) {
          //  mParam1 = getArguments().getString(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        //}
    //}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         //Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_forecast, container, false);
        v.setBackgroundColor(Color.parseColor("#FF0000"));
        LinearLayout ll = new LinearLayout(this.getContext());
        ll.setOrientation(LinearLayout.VERTICAL);

       // TextView monday = new TextView(getActivity());
        //monday.setText("Monday is a cloudy day");
        //ImageView cloudym = new ImageView(getActivity());
        //cloudym.setImageResource(R.drawable.eyewt);

        //ll.addView(monday);
        //ll.addView(cloudym);

        //TextView tuesday = new TextView(getActivity());
        // tuesday.setText("tuesday is a sunny day");
        // ImageView sunnyt = new ImageView(getActivity());
        //sunnyt.setImageResource(R.drawable.sunny2);

        // ll.addView(tuesday);
        //ll.addView(sunnyt);

        //TextView wednesday = new TextView(getActivity());
        //wednesday.setText("Wednesday is a sunny day");
        //ImageView sunnyw = new ImageView(getActivity());
        //sunnyw.setImageResource(R.drawable.sunny2);

        //ll.addView(wednesday);
        //ll.addView(sunnyw);

        //TextView thursday = new TextView(getActivity());
        //thursday.setText("Thursday is a rainy day");
        //ImageView rainyth = new ImageView(getActivity());
        //rainyth.setImageResource(R.drawable.weather_watermark_grande);

        //ll.addView(thursday);
        //ll.addView(rainyth);

        //TextView friday = new TextView(getActivity());
        //friday.setText("Friday is a cloudy day");
        //ImageView cloudyf = new ImageView(getActivity());
        //cloudyf.setImageResource(R.drawable.eyewt);

        //ll.addView(friday);
        //ll.addView(cloudyf);

        //TextView saturday = new TextView(getActivity());
        //saturday.setText("Saturday is a cloudy day");
        //ImageView cloudys = new ImageView(getActivity());
        //cloudys.setImageResource(R.drawable.eyewt);

        //ll.addView(saturday);
        // ll.addView(cloudys);

        //TextView sunday = new TextView(getActivity());
        //sunday.setText("Sunday is a rainy day");
        //ImageView rainysu = new ImageView(getActivity());
        //rainysu.setImageResource(R.drawable.weather_watermark_grande);

        //ll.addView(sunday);
        //ll.addView(rainysu);
        LinearLayout main = (LinearLayout) v.findViewById(R.id.main_forecast);
        main.addView(ll);

        return v;
    }
}