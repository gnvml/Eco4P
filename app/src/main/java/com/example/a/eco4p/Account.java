package com.example.a.eco4p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

import java.util.ArrayList;

import adapter.AccountAdapter;
import model.AccountModel;

public class Account extends AppCompatActivity implements View.OnClickListener {

    private Integer[] ACCOUNTPIC = {R.drawable.selena12, R.drawable.nature1, R.drawable.nature2, R.drawable.nature3, R.drawable.selena1, R.drawable.selena2, R.drawable.selena3, R.drawable.nature4, R.drawable.nature5, R.drawable.nature6, R.drawable.selena4, R.drawable.selena5, R.drawable.selena6, R.drawable.selena7, R.drawable.selena8, R.drawable.selena9, R.drawable.selena10, R.drawable.selena11};

    private RecyclerView recyclerView;
    private AccountAdapter accountAdapter;
    private ArrayList<AccountModel> accountModelArrayList;

    LinearLayout homelinear,searchlinear,instalinear,heartlinear,profilelinear;
    ImageView home,search,insta,heart,profile;

    LinearLayout applinear,linearlinear,starlinear,prolinear;
    ImageView app,linear,star,pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        homelinear = findViewById(R.id.homelinear);
        searchlinear = findViewById(R.id.searchlinear);
        instalinear = findViewById(R.id.instalinear);
        heartlinear = findViewById(R.id.heartlinear);
        profilelinear = findViewById(R.id.profilelinear);

        home = findViewById(R.id.hometool);
        search = findViewById(R.id.searchtool);
        insta = findViewById(R.id.instatool);
        heart = findViewById(R.id.hearttool);
        profile = findViewById(R.id.profiletool);

        applinear = findViewById(R.id.applinear);
        linearlinear = findViewById(R.id.linearlinear);
        starlinear = findViewById(R.id.starlinear);
        prolinear = findViewById(R.id.prolinear);

        app = findViewById(R.id.apptool);
        linear = findViewById(R.id.lineartool);
        star = findViewById(R.id.startool);
        pro = findViewById(R.id.protool);


        //Code for recycler view

        recyclerView = findViewById(R.id.accountrecy);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Account.this, 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        accountModelArrayList = new ArrayList<>();

        for (int i = 0; i < ACCOUNTPIC.length; i++) {
            AccountModel accountModel = new AccountModel();

            accountModel.setAccountpic(ACCOUNTPIC[i]);

            accountModelArrayList.add(accountModel);
        }

        accountAdapter = new AccountAdapter(Account.this, accountModelArrayList);
        recyclerView.setAdapter(accountAdapter);

        homelinear.setOnClickListener(this);
        searchlinear.setOnClickListener(this);
        instalinear.setOnClickListener(this);
        heartlinear.setOnClickListener(this);
        profilelinear.setOnClickListener(this);

        applinear.setOnClickListener(this);
        linearlinear.setOnClickListener(this);
        starlinear.setOnClickListener(this);
        prolinear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.homelinear:

                home.setImageResource(R.drawable.ic_home_black);
                search.setImageResource(R.drawable.ic_search);
                insta.setImageResource(R.drawable.ic_icons8_instagram_96);
                heart.setImageResource(R.drawable.ic_heart_outline);
                profile.setImageResource(R.drawable.ic_perm_identity);

                break;

            case R.id.searchlinear:

                home.setImageResource(R.drawable.ic_home_outline);
                search.setImageResource(R.drawable.ic_search);
                insta.setImageResource(R.drawable.ic_icons8_instagram_96);
                heart.setImageResource(R.drawable.ic_heart_outline);
                profile.setImageResource(R.drawable.ic_perm_identity);

                break;

            case R.id.instalinear:

                home.setImageResource(R.drawable.ic_home_outline);
                search.setImageResource(R.drawable.ic_search);
                insta.setImageResource(R.drawable.ic_icons8_instagram_black_100);
                heart.setImageResource(R.drawable.ic_heart_outline);
                profile.setImageResource(R.drawable.ic_perm_identity);

                break;

            case R.id.heartlinear:

                home.setImageResource(R.drawable.ic_home_outline);
                search.setImageResource(R.drawable.ic_search);
                insta.setImageResource(R.drawable.ic_icons8_instagram_96);
                heart.setImageResource(R.drawable.ic_heart_black);
                profile.setImageResource(R.drawable.ic_perm_identity);

                break;

            case R.id.profilelinear:

                home.setImageResource(R.drawable.ic_home_outline);
                search.setImageResource(R.drawable.ic_search);
                insta.setImageResource(R.drawable.ic_icons8_instagram_96);
                heart.setImageResource(R.drawable.ic_heart_outline);
                profile.setImageResource(R.drawable.ic_person);

                break;

            case R.id.applinear:

                app.setImageResource(R.drawable.ic_apps_blue);
                linear.setImageResource(R.drawable.ic_linear_grey);
                star.setImageResource(R.drawable.ic_icons8_star_104);
                pro.setImageResource(R.drawable.ic_profile_grey);

                break;

            case R.id.linearlinear:

                app.setImageResource(R.drawable.ic_apps_grey);
                linear.setImageResource(R.drawable.ic_linear_blue);
                star.setImageResource(R.drawable.ic_icons8_star_104);
                pro.setImageResource(R.drawable.ic_profile_grey);

                break;

            case R.id.starlinear:

                app.setImageResource(R.drawable.ic_apps_grey);
                linear.setImageResource(R.drawable.ic_linear_grey);
                star.setImageResource(R.drawable.ic_circlestar_blue);
                pro.setImageResource(R.drawable.ic_profile_grey);

                break;

            case R.id.prolinear:

                app.setImageResource(R.drawable.ic_apps_grey);
                linear.setImageResource(R.drawable.ic_linear_grey);
                star.setImageResource(R.drawable.ic_icons8_star_104);
                pro.setImageResource(R.drawable.ic_profile_blue);

                break;



        }

    }
}

