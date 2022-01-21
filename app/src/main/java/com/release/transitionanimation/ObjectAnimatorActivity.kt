package com.release.transitionanimation

import android.os.Bundle
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_object_animator.*

/**
 *
 * @author yancheng
 * @since 2022/1/20
 */
class ObjectAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_animator)

    }

    /**
     * 将View从左移动到右
     * @param view View
     */
    fun onClick(view: View) {
        //方式一:
//        val dis = root.width - view.width
//        view.animate().translationX(dis.toFloat()).start()
        //方式二:采用过渡框架
        TransitionManager.beginDelayedTransition(root)
        (view.layoutParams as FrameLayout.LayoutParams).gravity = Gravity.END
        view.requestLayout()
    }


}