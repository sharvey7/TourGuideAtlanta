package harvey.ggc.edu.tourguideatlanta;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class AttractionsFragment extends ListFragment implements AdapterView.OnItemClickListener {

    String[] locations = {"Piedmont Park", "Ponce City Market", "Fox Theatre",
            "Georgia Aquariam", "World of Coca-Cola "};


    int[] images = {R.drawable.park, R.drawable.ponce, R.drawable.fox, R.drawable.aquarium,
            R.drawable.coke};

    ArrayList<HashMap<String, String>> data = new ArrayList<>();
    SimpleAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //View rootView = inflater.inflate(R.layout.fragment_attractions, container, false);
        //  return rootView;
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < locations.length; i++) {
            map = new HashMap<String, String>();
            map.put("Locations", locations[i]);
            map.put("Image", Integer.toString(images[i]));

            data.add(map);
        }
        String[] from = {"Locations", "Image"};

        int[] to = {R.id.textView1, R.id.image1};

        adapter = new SimpleAdapter(getActivity(), data, R.layout.custom_row, from, to);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int pos, long id) {
                //adapterView, View view, int position, long id) {

             //fox   String[] atlPlaces = getActivity().getResources().getStringArray(R.array.atlPlaces);

                Toast.makeText(getActivity(), "Attractions in Atlanta: "+ locations[pos], Toast.LENGTH_LONG).show();

            }

        });
    }

    public AttractionsFragment() {
        //Required empty public constructor
    }

    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstancesState) {
        super.onActivityCreated(savedInstancesState);*/

        /*ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.atlPlaces,
               android.R.layout.simple_list_item_1 );




    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}

   /* @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        String[] atlPlaces= getActivity().getResources().getStringArray(R.array.atlPlaces);

        Toast.makeText(getActivity(), "Places in Atl :"+ atlPlaces[position], Toast.LENGTH_LONG).show();
    }
}*/


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}