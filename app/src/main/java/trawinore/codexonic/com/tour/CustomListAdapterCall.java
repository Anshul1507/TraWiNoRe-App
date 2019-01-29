package trawinore.codexonic.com.tour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapterCall extends ArrayAdapter<CustomList> {
    public CustomListAdapterCall(Activity context, ArrayList<CustomList> customLists) {
        super(context, 0, customLists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_call, parent, false);
        }
        CustomList currentCustomList = getItem(position);
        TextView contacttv = listItemView.findViewById(R.id.contact_name);
        contacttv.setText(currentCustomList.getStateName());
        ImageView callimage = listItemView.findViewById(R.id.image_call_icon);
        callimage.setImageResource(currentCustomList.getImageResourceId());
        return listItemView;
    }
}
