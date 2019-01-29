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

public class FragDelhiHospitals extends Fragment {
    private int pop;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_delhi_details, container, false);
        final ArrayList<CustomList> customlists = new ArrayList<CustomList>();
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item1), R.drawable.delhi_hospital_1));
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item2), R.drawable.delhi_hospital_2));
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item3), R.drawable.delhi_hospital_3));
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item4), R.drawable.delhi_hospital_4));
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item5), R.drawable.delhi_hospital_5));
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item6), R.drawable.delhi_hospital_6));
        customlists.add(new CustomList(getString(R.string.FragDelhiHospitals_ArrayList_item7), R.drawable.delhi_hospital_7));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), customlists);

        ListView listView = rootView.findViewById(R.id.list_delhi_details);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                pop = position + 1;
                Hospitaldetails();
            }
        });
        return rootView;
    }

    private void Hospitaldetails() {
        android.content.Intent intentHospital = new android.content.Intent(getActivity(), Delhi_deep.class);
        intentHospital.putExtra(getString(R.string.FragDelhiHospitals_passValue), pop);
        startActivity(intentHospital);
    }
}