package reimu.weixia.th.dreamer.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_viewpager_fragment.*
import reimu.weixia.th.dreamer.R

/**
 * Created by sy on 18.9.20
 */

class ViewPagerFragmentActivity : FragmentActivity() {

    private val TAG = "VPFragmentActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_viewpager_fragment)

        loadFragments()
    }

    fun loadFragments() {

        var fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.add(MyFragment.getInstance("Fragment Reimu"), "Reimu")

        fragmentTransaction.addToBackStack("Reimu")

        fragmentTransaction.commit()

        var fragmentTransaction2 = supportFragmentManager.beginTransaction()

        fragmentTransaction2.add(MyFragment.getInstance("Fragment Sun"), "Sun")
        fragmentTransaction2.add(MyFragment.getInstance("Fragment Moon"), "Moon")
        fragmentTransaction2.add(MyFragment.getInstance("Fragment Star"), "Star")

        fragmentTransaction2.addToBackStack("fairy")

        fragmentTransaction2.commit()

        vp_fragment.adapter = MyFragmentViewpagerAdapter(supportFragmentManager)
    }

    override fun onStart() {
        super.onStart()
    }

    fun LogD(message: String) {
        Log.d(TAG, message)
    }
}