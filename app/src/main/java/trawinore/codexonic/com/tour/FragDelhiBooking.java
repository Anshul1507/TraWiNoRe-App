package trawinore.codexonic.com.tour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FragDelhiBooking extends Fragment {
    private int pop;
    private String url;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_booking, container, false);
        final ArrayList<CustomList> customlists = new ArrayList<CustomList>();
        customlists.add(new CustomList(getString(R.string.FragDelhiBooking_ArrayList_item1), R.drawable.booking_hotel));
        customlists.add(new CustomList(getString(R.string.FragDelhiBooking_ArrayList_item2), R.drawable.booking_bus));
        customlists.add(new CustomList(getString(R.string.FragDelhiBooking_ArrayList_item3), R.drawable.booking_rail));
        customlists.add(new CustomList(getString(R.string.FragDelhiBooking_ArrayList_item4), R.drawable.booking_air));

        CustomListAdapterBooking adapter = new CustomListAdapterBooking(getActivity(), customlists);

        ListView listView = rootView.findViewById(R.id.list_booking_details);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                pop = position + 1;

                Bookingdetails();
            }
        });
        return rootView;
    }

    private void Bookingdetails() {
        if (pop == 1) {
            url = getString(R.string.FragDelhiBooking_online_item1);
        } else if (pop == 2) {
            url = getString(R.string.FragDelhiBooking_online_item2);
        } else if (pop == 3) {
            url =getString(R.string.FragDelhiBooking_online_item3);
        } else {
            url = getString(R.string.FragDelhiBooking_online_item4);
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}