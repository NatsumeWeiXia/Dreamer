package reimu.weixia.th.dreamer.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created by sy on 18.9.20
 */
class MyFragmentViewpagerAdapter: FragmentPagerAdapter {

    private var mFragmentManager: FragmentManager

    constructor(fragmentManager: FragmentManager) : super(fragmentManager) {
        this.mFragmentManager = fragmentManager
    }

    override fun getCount(): Int {
        return mFragmentManager.fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentManager.fragments[position]
    }
}