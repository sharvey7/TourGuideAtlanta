package harvey.ggc.edu.tourguideatlanta;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AtlantaAdapter extends ArrayAdapter<Atlanta> {

    private int mColorResourceId;

    public AtlantaAdapter(Activity context, ArrayList<Atlanta> atlantas, int colorResourceId) {
        super(context, 0, atlantas);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            Atlanta currentAtlanta = getItem(position);

            TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_textView);

            nameTextView.setText(currentAtlanta.getName());

            TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_textView);

            locationTextView.setText(currentAtlanta.getLocation());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image1);
            if (currentAtlanta.hasImage()) {
                imageView.setImageResource(currentAtlanta.getImageDrawable());

                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
            View textContainer = listItemView.findViewById(R.id.textView1);
            int color = ContextCompat.getColor(getContext(), mColorResourceId);

            textContainer.setBackgroundColor(color);


        }

        return listItemView;
    }
}
