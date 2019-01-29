package trawinore.codexonic.com.tour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<CustomList> {
    public CustomListAdapter(Activity context, ArrayList<CustomList> customLists) {
        super(context, 0, customLists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        CustomList currentCustomList = getItem(position);
        TextView statetv = listItemView.findViewById(R.id.state_name);
        statetv.setText(currentCustomList.getStateName());
        ImageView imageView = listItemView.findViewById(R.id.image_icon);
        imageView.setImageResource(currentCustomList.getImageResourceId());
        return listItemView;
    }
}
