package harvey.ggc.edu.tourguideatlanta;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter (FragmentManager fm){
        super (fm);
    }
    @Override
    public Fragment getItem(int position){
        if(position == 0){
            return new TourFragment();
        }else if(position == 1){
            return new MuseumsFragment();
        }else if(position == 2){
            return new FoodFragment();
        }else{
            return new AttractionsFragment();
        }
    }

    @Override
    public int getCount(){
        return 4;
    }
}

