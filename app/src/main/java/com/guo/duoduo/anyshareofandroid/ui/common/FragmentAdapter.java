package com.guo.duoduo.anyshareofandroid.ui.common;


import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


/**
 * Created by 郭攀峰 on 2015/9/16.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter
{

    private List<Fragment> mFragments;
    private List<String> mTitles;

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragments,
            List<String> titles)
    {
        super(fm);
        mFragments = fragments;
        mTitles = titles;

    }

    @Override
    public Fragment getItem(int position)
    {
        return mFragments.get(position);
    }

    @Override
    public int getCount()
    {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return mTitles.get(position);
    }
}
