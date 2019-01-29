package trawinore.codexonic.com.tour;

import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class StateDetails extends AppCompatActivity {
    private ImageView imageView;
    private TextView tv, tv2, tv3;
    private int passValue;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView = findViewById(R.id.image_state);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);

        passValue = getIntent().getExtras().getInt(getString(R.string.stateDetails_passValue));
        if (passValue == 1) {
            imageView.setImageResource(R.drawable.andhra_pradesh);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 2) {
            imageView.setImageResource(R.drawable.arunachal_pradesh);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 3) {
            imageView.setImageResource(R.drawable.assam);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 4) {
            imageView.setImageResource(R.drawable.bihar);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 5) {
            imageView.setImageResource(R.drawable.chhattisgarh);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 6) {
            imageView.setImageResource(R.drawable.delhi);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 7) {
            imageView.setImageResource(R.drawable.goa);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 8) {
            imageView.setImageResource(R.drawable.gujarat);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 9) {
            imageView.setImageResource(R.drawable.haryana);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 10) {
            imageView.setImageResource(R.drawable.himachal_pradesh);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 11) {
            imageView.setImageResource(R.drawable.jammu_kashmir);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 12) {
            imageView.setImageResource(R.drawable.jharkhand);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 13) {
            imageView.setImageResource(R.drawable.karnatka);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 14) {
            imageView.setImageResource(R.drawable.kerala);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 15) {
            imageView.setImageResource(R.drawable.madhya_pradesh);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 16) {
            imageView.setImageResource(R.drawable.maharashtra);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 17) {
            imageView.setImageResource(R.drawable.manipur);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 18) {
            imageView.setImageResource(R.drawable.meghalaya);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 19) {
            imageView.setImageResource(R.drawable.mizoram);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 20) {
            imageView.setImageResource(R.drawable.nagaland);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 21) {
            imageView.setImageResource(R.drawable.odisha);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 22) {
            imageView.setImageResource(R.drawable.golden_temple);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 23) {
            imageView.setImageResource(R.drawable.rajasthan);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 24) {
            imageView.setImageResource(R.drawable.sikkim);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 25) {
            imageView.setImageResource(R.drawable.tamil_nadu);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 26) {
            imageView.setImageResource(R.drawable.telangana);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passValue == 27) {
            imageView.setImageResource(R.drawable.tripura);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passValue == 28) {
            imageView.setImageResource(R.drawable.uttarakhand);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passValue == 29) {
            imageView.setImageResource(R.drawable.taj_mahal);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else {
            imageView.setImageResource(R.drawable.west_bengal);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
