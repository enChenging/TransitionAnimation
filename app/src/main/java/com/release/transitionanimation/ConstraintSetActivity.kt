package com.release.transitionanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_object_animator2.*

/**
 *
 * @author yancheng
 * @since 2022/1/20
 */
class ConstraintSetActivity : AppCompatActivity() {

    private var toggle = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain_set)
        bindData()
    }

    fun onClick(view: android.view.View) {
        //采用过渡框架
        TransitionManager.beginDelayedTransition(root)
        val constraintSet = ConstraintSet()
        if (toggle) {
            constraintSet.clone(this, R.layout.layout_constraint_end)
        } else {
            constraintSet.clone(this, R.layout.layout_constraint_start)
        }
        constraintSet.applyTo(root)
        toggle = !toggle
    }

    private fun bindData() {
        vIntroduce.text = "钢铁侠 \n类型:动作/科幻\n语言:英语\n上映日期:2008-03-04(美国)\n片长:136分钟"
        vContent.text =
            "      钢铁侠是由漫威漫画公司的数位作者联合创作的，包括编辑兼编剧斯坦·李、编辑赖瑞·理柏、负责绘制早期钢铁侠故事的画家唐·赫克，以及设计第一套钢铁侠装甲并绘制首次亮相的封面底稿的杰克·科比。\n" +
                    "\\n      钢铁侠初期的故事多为13页，但有时又会变成18页的冒险故事，《悬疑故事》的其他篇幅则多为短篇的科幻与灵异故事。首次出现的钢铁侠身穿笨重的灰色装甲，在第二篇故事中（第40期，1963年4月）灰色装甲被重新设计成外观类似但颜色为金色的版本，而钢铁侠被人熟悉的金色与红色的流线型装甲则出现于第48期（1963年12月），由史蒂夫·迪特科所绘制（但究竟是他或是杰克·科比，单独或合作设计出此版本的钢铁侠则仍不详）。"

    }

}