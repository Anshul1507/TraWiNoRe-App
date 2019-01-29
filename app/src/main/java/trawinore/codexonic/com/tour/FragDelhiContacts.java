package trawinore.codexonic.com.tour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FragDelhiContacts extends Fragment {
    private int pop;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);
        final ArrayList<CustomList> customlists = new ArrayList<CustomList>();
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item1), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item2), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item3), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item4), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item5), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item6), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item7), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item8), R.drawable.call));
        customlists.add(new CustomList(getString(R.string.FragDelhiContacts_ArrayList_item9), R.drawable.call));

        CustomListAdapterCall adapter = new CustomListAdapterCall(getActivity(), customlists);

        ListView listView = rootView.findViewById(R.id.list_contact_details);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                pop = position + 1;
                Contactdetails();
            }
        });
        return rootView;
    }

    private void Contactdetails() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        if (pop == 1) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item1)));
        } else if (pop == 2) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item2)));
        } else if (pop == 3) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item3)));
        } else if (pop == 4) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item4)));
        } else if (pop == 5) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item5)));
        } else if (pop == 6) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item6)));
        } else if (pop == 7) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item7)));
        } else if (pop == 8) {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item8)));
        } else {
            intent.setData(Uri.parse(getString(R.string.FragDelhiContacts_details_item9)));
        }
        startActivity(intent);
    }
}

