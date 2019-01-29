package trawinore.codexonic.com.tour;

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

public class FragDelhiMalls extends Fragment {
    private int pop;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_delhi_details, container, false);
        final ArrayList<CustomList> customlists = new ArrayList<CustomList>();
        customlists.add(new CustomList(getString(R.string.FragDelhiMalls_ArrayList_item1), R.drawable.delhi_malls_1));
        customlists.add(new CustomList(getString(R.string.FragDelhiMalls_ArrayList_item2), R.drawable.delhi_malls_2));
        customlists.add(new CustomList(getString(R.string.FragDelhiMalls_ArrayList_item3), R.drawable.delhi_malls_3));
        customlists.add(new CustomList(getString(R.string.FragDelhiMalls_ArrayList_item4), R.drawable.delhi_malls_4));
        customlists.add(new CustomList(getString(R.string.FragDelhiMalls_ArrayList_item5), R.drawable.delhi_malls_5));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), customlists);

        ListView listView = rootView.findViewById(R.id.list_delhi_details);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                pop = position + 1;
                Mallsdetails();
            }
        });
        return rootView;
    }

    private void Mallsdetails() {
        android.content.Intent intentMalls = new android.content.Intent(getActivity(), Delhi_deep.class);
        intentMalls.putExtra(getString(R.string.FragDelhiMalls_passValue), pop);
        startActivity(intentMalls);
    }
}