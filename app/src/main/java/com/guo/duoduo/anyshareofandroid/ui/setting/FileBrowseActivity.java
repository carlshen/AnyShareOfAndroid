package com.guo.duoduo.anyshareofandroid.ui.setting;


import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.guo.duoduo.anyshareofandroid.R;
import com.guo.duoduo.anyshareofandroid.ui.common.BaseActivity;
import com.guo.duoduo.anyshareofandroid.ui.setting.fragment.ReceivedApp;
import com.guo.duoduo.anyshareofandroid.ui.setting.fragment.ReceivedPicture;
import com.guo.duoduo.anyshareofandroid.ui.common.FragmentAdapter;


public class FileBrowseActivity extends BaseActivity
{
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_browse);

        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_receive_browse_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(true);

        initWidget();
    }

    private void initWidget()
    {
        List<String> titles = new ArrayList<>();
        titles.add(getString(R.string.app));
        titles.add(getString(R.string.picture));

        mTabLayout = (TabLayout) findViewById(R.id.activity_receive_browse_tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(1)));

        mViewPager = (ViewPager) findViewById(R.id.activity_receive_browse_viewpager);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(ReceivedApp.newInstance());
        fragments.add(ReceivedPicture.newInstance());

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(),
            fragments, titles);
        mViewPager.setAdapter(adapter);

        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(adapter);
    }
}
