package evan.chen.tutorial.viewanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alphaButton.setOnClickListener {

            imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha))
        }

        scaleButton.setOnClickListener {

            this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale))
        }

        translateButton.setOnClickListener {

            this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
        }

        rotateButton.setOnClickListener {
            this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))

        }
    }
}
