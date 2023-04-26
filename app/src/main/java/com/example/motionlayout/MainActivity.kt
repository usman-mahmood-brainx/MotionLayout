package com.example.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)

        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {

            override fun onTransitionStarted(motionLayout: MotionLayout, startId: Int, endId: Int) {
                // This method is called when the transition starts.
                // You can add your custom logic here.
            }

            override fun onTransitionChange(motionLayout: MotionLayout, startId: Int, endId: Int, progress: Float) {
                // This method is called as the transition progresses.
                // You can add your custom logic here.
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                // This method is called when the transition is completed.
                // You can add your custom logic here.
            }

            override fun onTransitionTrigger(motionLayout: MotionLayout, triggerId: Int, positive: Boolean, progress: Float) {
                // This method is called when a trigger is activated during the transition.
                // You can add your custom logic here.
            }
        })

    }
}