package com.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 鲍骞月 on 2017/4/1.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
