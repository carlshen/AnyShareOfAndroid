package com.guo.duoduo.anyshareofandroid.ui.common;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;


/**
 * Created by 郭攀峰 on 2015/9/26.
 */
public class BaseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
