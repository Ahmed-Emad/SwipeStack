package link.fls.swipestacksample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.LinkedList;
import java.util.List;

public class MyFlightsCardAdapter extends FragmentPagerAdapter {

    List<MyFlightCardFragment> fragments;

    public MyFlightsCardAdapter(FragmentManager fragmentManager, int count) {
        super(fragmentManager);
        fragments = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            fragments.add(new MyFlightCardFragment(i));
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position >= getCount()) return null;
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addNewFragment() {
        fragments.add(new MyFlightCardFragment(fragments.size()));
        notifyDataSetChanged();
    }

}
