package com.release.transitionanimation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.release.transitionanimation.ktx.startActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 过渡动画
 * @author yancheng
 * @since 2022/1/20
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vObjectAnimator.setOnClickListener(this)
        vObjectAnimator2.setOnClickListener(this)
        vConstrainSet.setOnClickListener(this)
        vMotionLayout.setOnClickListener(this)
        vMotionLayout2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.vObjectAnimator -> startActivity<ObjectAnimatorActivity>()
            R.id.vObjectAnimator2 -> startActivity<ObjectAnimator2Activity>()
            R.id.vConstrainSet -> startActivity<ConstraintSetActivity>()
            R.id.vMotionLayout -> startActivity<MotionLayoutActivity>()
            R.id.vMotionLayout2 -> startActivity<MotionLayout2Activity>()
        }
    }


}