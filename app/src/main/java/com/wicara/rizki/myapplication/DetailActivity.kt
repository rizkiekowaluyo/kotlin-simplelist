package com.wicara.rizki.myapplication


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intentExtra = intent.extras ?: return

        val title =  intentExtra.getString("name")
        val desc = intentExtra.getString("from")
        val photo = intentExtra.getString("photo")

        tv_name.text = title
        tv_from.text = desc
        Glide.with(this)
                .load(photo)
                .apply(RequestOptions().override(600, 600))
                .into(img_photo)
    }
}