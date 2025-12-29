package com.example.islamiapp.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islamiapp.R
import com.example.islamiapp.databinding.ActivityHomeBinding
import com.example.islamiapp.databinding.FragmentSebhaBinding
import com.example.islamiapp.home.fragments.HadethFragment
import com.example.islamiapp.home.fragments.QuranFragment
import com.example.islamiapp.home.fragments.RadioFragment
import com.example.islamiapp.home.fragments.SebhaFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNav.setOnItemSelectedListener { menuItem ->
            if (menuItem.itemId==R.id.quran_nav){
                showFragment(QuranFragment())
            }
            else if (menuItem.itemId==R.id.hadeth_nav){
                showFragment(HadethFragment())
            }
            else if (menuItem.itemId==R.id.radio_nav){
                showFragment(RadioFragment())
            }
            else if (menuItem.itemId==R.id.sebha_nav){
                showFragment(SebhaFragment())
            }
            return@setOnItemSelectedListener true
        }
        binding.bottomNav.selectedItemId=R.id.quran_nav
    }

    fun showFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.FragmentContainer, fragment) // use replace to empty the screen then add the tab
            .addToBackStack(null) // to back to clicked tabs before
            .commit()
    }

}