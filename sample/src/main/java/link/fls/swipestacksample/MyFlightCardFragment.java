package link.fls.swipestacksample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFlightCardFragment extends Fragment {

    private View mView;
    private int position;

    public MyFlightCardFragment() {
        // Required empty public constructor
    }

    public MyFlightCardFragment(int position) {
        this.position = position;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.mView = inflater.inflate(R.layout.fragment_my_flight_card, container, false);
        ((TextView) this.mView.findViewById(R.id.tvDepartureAirportCode)).setText("Position: " + position);
        return mView;
    }

}
