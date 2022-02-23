package com.codesquad.kotilin_cardgame

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        val profileImage = intent.getByteArrayExtra("profileImage")!!.let {
            BitmapFactory.decodeByteArray(it, 0, it.size)
        }
        val nickname = intent.getStringExtra("nickname")!!
        val toolbar = findViewById<Toolbar>(R.id.toolbar_cardgame)
        val settingFragment = SettingFragment()
        settingFragment.setNickName(nickname)
        settingFragment.setImage(profileImage)
        setSupportActionBar(toolbar)
        val gameFragment= GameFragment()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation_sub)
        bottomNavigation.setOnItemReselectedListener { item->
            switchFragment(item.itemId, gameFragment,settingFragment)
        }
    }

    fun switchFragment(itemId:Int, gameFragment: GameFragment, settingFragment: SettingFragment){
        val transaction= supportFragmentManager.beginTransaction()
        when(itemId){
            R.id.page_setting-> {
                transaction.replace(R.id.nav_host_fragment, settingFragment).commit()
            }
            R.id.page_game->{
                transaction.replace(R.id.nav_host_fragment, gameFragment).commit()
            }

        }
    }
}