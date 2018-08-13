package harvey.ggc.edu.tourguideatlanta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
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


public class FoodFragment extends ListFragment implements AdapterView.OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_food, container, false );
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.food, android.R.layout.simple_list_item_1);

      setListAdapter(arrayAdapter);
      getListView().setOnItemClickListener(this);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        String[] food = getActivity().getResources().getStringArray(R.array.food);
        Toast.makeText(getActivity(), "These are the food places" + food[position], Toast.LENGTH_LONG).show();
    }
}











