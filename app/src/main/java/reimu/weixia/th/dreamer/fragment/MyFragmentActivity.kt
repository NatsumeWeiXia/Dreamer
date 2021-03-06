package reimu.weixia.th.dreamer.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import reimu.weixia.th.dreamer.R

/**
 * Created by sy on 18.9.13
 */
class MyFragmentActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fragment)
    }

    override fun onResume() {
        super.onResume()

        var fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.fragment_view, MyFragment.getInstance("Fragment_1"), "MyFragment")

        fragmentTransaction.addToBackStack(null)

        fragmentTransaction.commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}