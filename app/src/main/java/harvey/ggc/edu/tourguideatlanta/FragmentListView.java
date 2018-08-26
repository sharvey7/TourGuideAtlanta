package harvey.ggc.edu.tourguideatlanta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentListView extends Fragment {
    public ListView listView;
    public FragmentListView() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_attractions, container, false);
        listView = (ListView)v.findViewById(R.id.listview);
        ListViewAdapter adapter = new ListViewAdapter(this);
        listView.setAdapter(adapter);
        return v;
    }

}
