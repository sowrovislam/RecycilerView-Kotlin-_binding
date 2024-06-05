package com.example.ric_12

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ric_12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var rvAdapter: Rv_Adapter

    private lateinit var datalist:ArrayList<Rv_Model>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        datalist=ArrayList<Rv_Model>()

        datalist.add(Rv_Model(R.drawable.img,"swrtov","ami toamke "))



        datalist.add(Rv_Model(R.drawable.img,"swrtov","ami toamke "))



        datalist.add(Rv_Model(R.drawable.img,"swrtov","ami toamke "))






        rvAdapter=Rv_Adapter(datalist,this)

        binding.recycilerView.layoutManager=LinearLayoutManager(this)

        binding.recycilerView.adapter=rvAdapter











    }
}