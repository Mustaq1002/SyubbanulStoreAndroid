package com.example.syubbanulstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    val fargmentHome: = Fragment = HomeFragment()
    val fargmentAkun: = Fragment = AkunFragment()
    val fargmentKeranjang: = Fragment = KeranjangFragment()
    val fm: FragmentManager = supportFragmentManager
    var active: Fragment = fargmentHome
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        fm.beginTransaction().add(R.id.container, fargmentHome).show(fargmentHome).commit()
    }
}
