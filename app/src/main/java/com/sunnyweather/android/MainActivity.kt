package com.sunnyweather.android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sunnyweather.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        if (SunnyWeatherApplication.TOKEN.isEmpty()) {
            Toast.makeText(
                this,
                "请在SunnyWeatherApplication中填入你申请到的令牌值",
                Toast.LENGTH_LONG
            ).show()
            finish()
        }
    }
}
