package trawinore.codexonic.com.tour;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class FragState extends Fragment {
    private CustomListAdapter adapter;
    private ListView listView;
    private int pop;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.state_layout, container, false);
        final ArrayList<CustomList> customlists = new ArrayList<CustomList>();
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item1), R.drawable.andhra_pradesh));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item2), R.drawable.arunachal_pradesh));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item3), R.drawable.assam));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item4), R.drawable.bihar));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item5), R.drawable.chhattisgarh));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item6), R.drawable.delhi));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item7), R.drawable.goa));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item8), R.drawable.gujarat));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item9), R.drawable.haryana));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item10), R.drawable.himachal_pradesh));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item11), R.drawable.jammu_kashmir));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item12), R.drawable.jharkhand));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item13), R.drawable.karnatka));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item14), R.drawable.kerala));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item15), R.drawable.madhya_pradesh));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item16), R.drawable.maharashtra));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item17), R.drawable.manipur));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item18), R.drawable.meghalaya));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item19), R.drawable.mizoram));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item20), R.drawable.nagaland));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item21), R.drawable.odisha));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item22), R.drawable.golden_temple));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item23), R.drawable.rajasthan));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item24), R.drawable.sikkim));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item25), R.drawable.tamil_nadu));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item26), R.drawable.telangana));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item27), R.drawable.tripura));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item28), R.drawable.uttarakhand));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item29), R.drawable.taj_mahal));
        customlists.add(new CustomList(getString(R.string.FragState_ArrayList_item30), R.drawable.west_bengal));

        adapter = new CustomListAdapter(getActivity(), customlists);
        listView = rootView.findViewById(R.id.list_State);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                pop = position + 1;
                statedetails();
            }
        });
        return rootView;
    }

    private void statedetails() {
        android.content.Intent intentState = new android.content.Intent(getActivity(), StateDetails.class);
        intentState.putExtra(getString(R.string.FragState_passValue), pop);
        startActivity(intentState);
    }
}

