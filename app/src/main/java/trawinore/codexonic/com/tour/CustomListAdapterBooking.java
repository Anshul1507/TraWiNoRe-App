package trawinore.codexonic.com.tour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapterBooking extends ArrayAdapter<CustomList> {
    public CustomListAdapterBooking(Activity context, ArrayList<CustomList> customLists) {
        super(context, 0, customLists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_booking, parent, false);
        }
        CustomList currentCustomList = getItem(position);
        TextView contacttv = listItemView.findViewById(R.id.booking_name);
        contacttv.setText(currentCustomList.getStateName());
        ImageView callimage = listItemView.findViewById(R.id.image_booking_icon);
        callimage.setImageResource(currentCustomList.getImageResourceId());
        return listItemView;
    }
}
