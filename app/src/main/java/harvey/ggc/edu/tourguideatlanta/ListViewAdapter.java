package harvey.ggc.edu.tourguideatlanta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
    public String nameString[] = {"Piedmont Park", "Ponce City Market",
            "Fox Theatre", "Georgia Aquarium", "World of Coca Cola!"};
    public FragmentListView fragment;
    public TextView textview;
    public ListViewAdapter(FragmentListView fragment){
        this.fragment = fragment;
    }
    @Override
    public int getCount(){
        return 5;
    }
    @Override
    public Object getItem(int position){
        return null;
    }
    @Override
    public long getItemId(int position){
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater li = (LayoutInflater)fragment.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = li.inflate(R.layout.list_atl, null);
        textview =(TextView)v.findViewById(R.id.textView1);
        textview.setText(nameString[position]);
        return v;

    }



}
