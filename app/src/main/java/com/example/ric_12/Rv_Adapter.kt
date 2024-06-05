package com.example.ric_12

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ric_12.databinding.ItemLayoutBinding

class Rv_Adapter (var datalist:ArrayList<Rv_Model>,var context: Context):RecyclerView.Adapter<Rv_Adapter.MyViewHoldar>(){





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoldar {

//        var view=LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)
//
//        return MyViewHoldar(view)


        var binding=ItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)

        return MyViewHoldar(binding)

    }

    override fun getItemCount(): Int {
        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHoldar, position: Int) {

       holder.binding.imageView.setImageResource(datalist.get(position).profile)

        holder.binding.textView1.text=datalist.get(position).name

        holder.binding.textView2.text=datalist.get(position).address


    }



//  inner class MyViewHoldar(view: View):RecyclerView.ViewHolder(view)


    inner class MyViewHoldar(var binding:ItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

}