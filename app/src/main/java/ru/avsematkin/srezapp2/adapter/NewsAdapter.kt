package ru.avsematkin.srezapp2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.model.Film

class NewsAdapter(val context: Context, val list: ArrayList<Film>): RecyclerView.Adapter<NewsAdapter.NewHolder>() {
    class NewHolder(view: View): RecyclerView.ViewHolder(view) {
        val photo: ImageView = view.findViewById(R.id.ivCoverNew)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewHolder {
        return  NewHolder(LayoutInflater.from(context).inflate(R.layout.new_item, parent, false))
    }

    override fun onBindViewHolder(holder: NewHolder, position: Int) {
        val item = list[position]
        Glide.with(context)
            .load(item.image)
            .into(holder.photo)
    }

    override fun getItemCount(): Int = list.size
}