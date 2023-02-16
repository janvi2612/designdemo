package com.example.homepagetask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter (private val mList: List<ItemsViewModel>):RecyclerView.Adapter<ReviewAdapter.ViewHolder>(){
    class ViewHolder(ItemsViewModel : View):RecyclerView.ViewHolder(ItemsViewModel) {
        val imageView: ImageView = ItemsViewModel.findViewById(R.id.imageViewr1)
         val imgv2:ImageView=ItemsViewModel.findViewById(R.id.imageViewr2)
        val imgv3 :ImageView=ItemsViewModel.findViewById(R.id.imagegirl)
        val textView:TextView=ItemsViewModel.findViewById(R.id.textviewr1)
        val txt2:TextView=ItemsViewModel.findViewById(R.id.textViewr2)
        val txt3:TextView=ItemsViewModel.findViewById(R.id.textViewr3)
        val txt4:TextView=ItemsViewModel.findViewById(R.id.textViewr4)
        val txt5:TextView=ItemsViewModel.findViewById(R.id.textViewr5)
        val txt6:TextView=ItemsViewModel.findViewById(R.id.textViewr6)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val ItemsViewMode= mList[position]
    }

    override fun getItemCount(): Int {
  return mList.size
    }

}










