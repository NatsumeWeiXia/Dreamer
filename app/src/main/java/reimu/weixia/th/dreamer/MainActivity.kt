package reimu.weixia.th.dreamer

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onEvent()
        LogD("onCreate")
    }

    private fun onEvent() {

        change_orn_btn.setOnClickListener {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }
    }

    override fun onRestart() {
        super.onRestart()
        LogD("onRestart")
    }

    override fun onStart() {
        super.onStart()
        LogD("onStart")
    }

    override fun onResume() {
        super.onResume()
        LogD("onResume")
    }

    override fun onPause() {
        super.onPause()
        LogD("onPause")
    }

    override fun onStop() {
        super.onStop()
        LogD("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogD("onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        LogD("onSaveInstanceState")
        outState!!.putString("Key", "Value")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        LogD("onRestoreInstanceState")
    }


    fun LogD(message: String) {
        Log.d(TAG, message)
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
