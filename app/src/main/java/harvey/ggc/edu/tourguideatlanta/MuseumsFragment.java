package harvey.ggc.edu.tourguideatlanta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MuseumsFragment extends ListFragment implements AdapterView.OnItemClickListener {
    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_museums, container, false);

       return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstancesState){
        super.onActivityCreated(savedInstancesState);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.art,
                android.R.layout.simple_list_item_1);

        setListAdapter(arrayAdapter);

        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        String[] atlPlaces= getActivity().getResources().getStringArray(R.array.art);

        Toast.makeText(getActivity(), "Popular museums in Atlanta :"+ atlPlaces[position],
                Toast.LENGTH_LONG).show();
    }
}


