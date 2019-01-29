package trawinore.codexonic.com.tour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Delhi_deep extends AppCompatActivity {
    private ImageView imageView;
    private TextView tv, tv2, tv3, tvLink, tvLinkMap;
    private int passMonument, passReligious, passHotels, passHospitals, passMalls;
    private String url, map_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi_deep);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView = findViewById(R.id.image_delhi_deep);
        tv = findViewById(R.id.textView_delhi_deep);
        tv2 = findViewById(R.id.textView2_delhi_deep);
        tv3 = findViewById(R.id.textView3_delhi_deep);
        tvLink = findViewById(R.id.tv_link);
        tvLinkMap = findViewById(R.id.tv_link_map);

        String text = getString(R.string.Delhi_deep_text);
        String text_map = getString(R.string.Delhi_deep_text_map);

        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                if (passMonument == 1) {
                    url = getString(R.string.Delhi_deep_text1);
                } else if (passMonument == 2) {
                    url = getString(R.string.Delhi_deep_text2);
                } else if (passMonument == 3) {
                    url = getString(R.string.Delhi_deep_text3);
                } else if (passMonument == 4) {
                    url = getString(R.string.Delhi_deep_text4);
                } else if (passMonument == 5) {
                    url = getString(R.string.Delhi_deep_text5);
                } else if (passMonument == 6) {
                    url = getString(R.string.Delhi_deep_text6);
                } else if (passMonument == 7) {
                    url = getString(R.string.Delhi_deep_text7);
                } else if (passMonument == 8) {
                    url = getString(R.string.Delhi_deep_text8);
                } else if (passReligious == 1) {
                    url = getString(R.string.Delhi_deep_text9);
                } else if (passReligious == 2) {
                    url = getString(R.string.Delhi_deep_text10);
                } else if (passReligious == 3) {
                    url = getString(R.string.Delhi_deep_text11);
                } else if (passReligious == 4) {
                    url = getString(R.string.Delhi_deep_text12);
                } else if (passReligious == 5) {
                    url = getString(R.string.Delhi_deep_text13);
                } else if (passReligious == 6) {
                    url = getString(R.string.Delhi_deep_text14);
                } else if (passReligious == 7) {
                    url = getString(R.string.Delhi_deep_text15);
                } else if (passReligious == 8) {
                    url = getString(R.string.Delhi_deep_text16);
                } else if (passReligious == 9) {
                    url = getString(R.string.Delhi_deep_text17);
                } else if (passReligious == 10) {
                    url = getString(R.string.Delhi_deep_text18);
                } else if (passHotels == 1) {
                    url = getString(R.string.Delhi_deep_text19);
                } else if (passHotels == 2) {
                    url = getString(R.string.Delhi_deep_text20);
                } else if (passHotels == 3) {
                    url = getString(R.string.Delhi_deep_text21);
                } else if (passHotels == 4) {
                    url = getString(R.string.Delhi_deep_text22);
                } else if (passHotels == 5) {
                    url = getString(R.string.Delhi_deep_text23);
                } else if (passHospitals == 1) {
                    url = getString(R.string.Delhi_deep_text24);
                } else if (passHospitals == 2) {
                    url = getString(R.string.Delhi_deep_text25);
                } else if (passHospitals == 3) {
                    url = getString(R.string.Delhi_deep_text26);
                } else if (passHospitals == 4) {
                    url = getString(R.string.Delhi_deep_text27);
                } else if (passHospitals == 5) {
                    url = getString(R.string.Delhi_deep_text28);
                } else if (passHospitals == 6) {
                    url = getString(R.string.Delhi_deep_text30);
                } else if (passHospitals == 7) {
                    url = getString(R.string.Delhi_deep_text31);
                } else if (passMalls == 1) {
                    url = getString(R.string.Delhi_deep_text32);
                } else if (passMalls == 2) {
                    url = getString(R.string.Delhi_deep_text33);
                } else if (passMalls == 3) {
                    url = getString(R.string.Delhi_deep_text34);
                } else if (passMalls == 4) {
                    url = getString(R.string.Delhi_deep_text35);
                } else if (passMalls == 5) {
                    url = getString(R.string.Delhi_deep_text36);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.Delhi_deep_map36), Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        };

        ss.setSpan(clickableSpan1, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvLink.setText(ss);
        tvLink.setMovementMethod(LinkMovementMethod.getInstance());

        SpannableString ss_map = new SpannableString(text_map);
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                if (passMonument == 1) {
                    map_url = getString(R.string.Delhi_deep_map1);
                } else if (passMonument == 2) {
                    map_url = getString(R.string.Delhi_deep_map2);
                } else if (passMonument == 3) {
                    map_url = getString(R.string.Delhi_deep_map3);
                } else if (passMonument == 4) {
                    map_url = getString(R.string.Delhi_deep_map4);
                } else if (passMonument == 5) {
                    map_url = getString(R.string.Delhi_deep_map5);
                } else if (passMonument == 6) {
                    map_url = getString(R.string.Delhi_deep_map6);
                } else if (passMonument == 7) {
                    map_url = getString(R.string.Delhi_deep_map7);
                } else if (passMonument == 8) {
                    map_url = getString(R.string.Delhi_deep_map8);
                } else if (passReligious == 1) {
                    map_url = getString(R.string.Delhi_deep_map9);
                } else if (passReligious == 2) {
                    map_url = getString(R.string.Delhi_deep_map10);
                } else if (passReligious == 3) {
                    map_url = getString(R.string.Delhi_deep_map11);
                } else if (passReligious == 4) {
                    map_url = getString(R.string.Delhi_deep_map12);
                } else if (passReligious == 5) {
                    map_url = getString(R.string.Delhi_deep_map13);
                } else if (passReligious == 6) {
                    map_url = getString(R.string.Delhi_deep_map14);
                } else if (passReligious == 7) {
                    map_url = getString(R.string.Delhi_deep_map15);
                } else if (passReligious == 8) {
                    map_url = getString(R.string.Delhi_deep_map16);
                } else if (passReligious == 9) {
                    map_url = getString(R.string.Delhi_deep_map17);
                } else if (passReligious == 10) {
                    map_url = getString(R.string.Delhi_deep_map18);
                } else if (passHotels == 1) {
                    map_url = getString(R.string.Delhi_deep_map19);
                } else if (passHotels == 2) {
                    map_url = getString(R.string.Delhi_deep_map20);
                } else if (passHotels == 3) {
                    map_url = getString(R.string.Delhi_deep_map21);
                } else if (passHotels == 4) {
                    map_url = getString(R.string.Delhi_deep_map22);
                } else if (passHotels == 5) {
                    map_url = getString(R.string.Delhi_deep_map23);
                } else if (passHospitals == 1) {
                    map_url = getString(R.string.Delhi_deep_map24);
                } else if (passHospitals == 2) {
                    map_url = getString(R.string.Delhi_deep_map25);
                } else if (passHospitals == 3) {
                    map_url = getString(R.string.Delhi_deep_map26);
                } else if (passHospitals == 4) {
                    map_url = getString(R.string.Delhi_deep_map27);
                } else if (passHospitals == 5) {
                    map_url = getString(R.string.Delhi_deep_map28);
                } else if (passHospitals == 6) {
                    map_url = getString(R.string.Delhi_deep_map29);
                } else if (passHospitals == 7) {
                    map_url = getString(R.string.Delhi_deep_map30);
                } else if (passMalls == 1) {
                    map_url = getString(R.string.Delhi_deep_map31);
                } else if (passMalls == 2) {
                    map_url = getString(R.string.Delhi_deep_map32);
                } else if (passMalls == 3) {
                    map_url = getString(R.string.Delhi_deep_map33);
                } else if (passMalls == 4) {
                    map_url = getString(R.string.Delhi_deep_map34);
                } else if (passMalls == 5) {
                    map_url = getString(R.string.Delhi_deep_map35);
                } else {
                    Toast.makeText(getApplicationContext(),getString(R.string.Delhi_deep_map36), Toast.LENGTH_SHORT).show();
                }
                Intent intent_map = new Intent(Intent.ACTION_VIEW, Uri.parse(map_url));
                intent_map.setPackage(getString(R.string.Delhi_deep_map36));
                startActivity(intent_map);
            }
        };

        ss_map.setSpan(clickableSpan2, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvLinkMap.setText(ss_map);
        tvLinkMap.setMovementMethod(LinkMovementMethod.getInstance());

        passMonument = getIntent().getExtras().getInt(getString(R.string.Delhi_deep_passMonument));
        passReligious = getIntent().getExtras().getInt(getString(R.string.Delhi_deep_passReligious));
        passHotels = getIntent().getExtras().getInt(getString(R.string.Delhi_deep_passHotels));
        passHospitals = getIntent().getExtras().getInt(getString(R.string.Delhi_deep_passHospitals));
        passMalls = getIntent().getExtras().getInt(getString(R.string.Delhi_deep_passMalls));

        if (passMonument == 1) {
            imageView.setImageResource(R.drawable.delhi_monument_1);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passMonument == 2) {
            imageView.setImageResource(R.drawable.delhi_monument_2);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passMonument == 3) {
            imageView.setImageResource(R.drawable.delhi_monument_3);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passMonument == 4) {
            imageView.setImageResource(R.drawable.delhi_monument_4);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passMonument == 5) {
            imageView.setImageResource(R.drawable.delhi_monument_5);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passMonument == 6) {
            imageView.setImageResource(R.drawable.delhi_monument_6);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passMonument == 7) {
            imageView.setImageResource(R.drawable.delhi_monument_7);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passMonument == 8) {
            imageView.setImageResource(R.drawable.delhi_monument_8);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passReligious == 1) {
            imageView.setImageResource(R.drawable.delhi_religious_1);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passReligious == 2) {
            imageView.setImageResource(R.drawable.delhi_religious_2);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passReligious == 3) {
            imageView.setImageResource(R.drawable.delhi_religious_3);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passReligious == 4) {
            imageView.setImageResource(R.drawable.delhi_religious_4);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passReligious == 5) {
            imageView.setImageResource(R.drawable.delhi_religious_5);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passReligious == 6) {
            imageView.setImageResource(R.drawable.delhi_religious_6);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passReligious == 7) {
            imageView.setImageResource(R.drawable.delhi_religious_7);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passReligious == 8) {
            imageView.setImageResource(R.drawable.delhi_religious_8);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passReligious == 9) {
            imageView.setImageResource(R.drawable.delhi_religious_9);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passReligious == 10) {
            imageView.setImageResource(R.drawable.delhi_religious_10);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHotels == 1) {
            imageView.setImageResource(R.drawable.delhi_hotels_1);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHotels == 2) {
            imageView.setImageResource(R.drawable.delhi_hotels_2);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHotels == 3) {
            imageView.setImageResource(R.drawable.delhi_hotels_3);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passHotels == 4) {
            imageView.setImageResource(R.drawable.delhi_hotels_4);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passHotels == 5) {
            imageView.setImageResource(R.drawable.delhi_hotels_5);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHospitals == 1) {
            imageView.setImageResource(R.drawable.delhi_hospital_1);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHospitals == 2) {
            imageView.setImageResource(R.drawable.delhi_hospital_2);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHospitals == 3) {
            imageView.setImageResource(R.drawable.delhi_hospital_3);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passHospitals == 4) {
            imageView.setImageResource(R.drawable.delhi_hospital_4);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passHospitals == 5) {
            imageView.setImageResource(R.drawable.delhi_hospital_5);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passHospitals == 6) {
            imageView.setImageResource(R.drawable.delhi_hospital_6);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passHospitals == 7) {
            imageView.setImageResource(R.drawable.delhi_hospital_7);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passMalls == 1) {
            imageView.setImageResource(R.drawable.delhi_malls_1);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passMalls == 2) {
            imageView.setImageResource(R.drawable.delhi_malls_2);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else if (passMalls == 3) {
            imageView.setImageResource(R.drawable.delhi_malls_3);
            tv.setText(getString(R.string.arunachal_pradesh_overview));
            tv2.setText(getString(R.string.arunachal_pradesh_tv_2));
            tv3.setText(getString(R.string.arunachal_pradesh_tv_3));
        } else if (passMalls == 4) {
            imageView.setImageResource(R.drawable.delhi_malls_4);
            tv.setText(getString(R.string.andhra_pradesh_overview));
            tv2.setText(getString(R.string.andhra_pradesh_tv_2));
            tv3.setText(getString(R.string.andhra_pradesh_tv_3));
        } else if (passMalls == 5) {
            imageView.setImageResource(R.drawable.delhi_malls_5);
            tv.setText(getString(R.string.assam_overview));
            tv2.setText(getString(R.string.assam_tv_2));
            tv3.setText(getString(R.string.assam_tv_3));
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.Delhi_deep_map36), Toast.LENGTH_SHORT).show();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}