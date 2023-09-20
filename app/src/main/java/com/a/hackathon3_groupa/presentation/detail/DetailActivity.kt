package com.a.hackathon3_groupa.presentation.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a.hackathon3_groupa.databinding.ActivityMainBinding
import com.a.hackathon3_groupa.model.ProductResponse

class DetailActivity : AppCompatActivity() {
    companion object{
        private const val PRODUCT_DETAIL = "PRODUCT_DETAIL"

        fun navigate(
            context: Context,
            product: ProductResponse,
        ) = with(context) {
            startActivity(
                Intent(this, DetailActivity::class.java).apply {
                    putExtra(PRODUCT_DETAIL, product)
                }
            )
        }
    }
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}