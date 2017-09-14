package egame.com.kotlintest

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    internal var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "haha"
        button.setOnClickListener {
            tv.text = "" + sum(i++, 100)
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}
