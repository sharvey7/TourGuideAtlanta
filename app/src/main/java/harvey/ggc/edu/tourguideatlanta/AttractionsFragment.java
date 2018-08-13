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
import android.widget.Toast;


public class AttractionsFragment extends ListFragment implements AdapterView.OnItemClickListener {

    int[] iconImages = new int[] {R.drawable.electric, R.drawable.cnn, R.drawable.food,
    R.drawable.segway, R.drawable.scary};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_attractions, container, false);
         return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstancesState){
        super.onActivityCreated(savedInstancesState);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.atlPlaces,
               android.R.layout.simple_list_item_1 );

        setListAdapter(arrayAdapter);

        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        String[] atlPlaces= getActivity().getResources().getStringArray(R.array.atlPlaces);

        Toast.makeText(getActivity(), "Places in Atl :"+ atlPlaces[position], Toast.LENGTH_LONG).show();
    }
}
