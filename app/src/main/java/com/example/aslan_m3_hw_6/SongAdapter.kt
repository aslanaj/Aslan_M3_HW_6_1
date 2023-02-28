package com.example.aslan_m3_hw_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.aslan_m3_hw_6.databinding.ItemSongsBinding

class SongAdapter(
    val songList: ArrayList<Song>,
    val onClick: (position: Int) -> Unit
    ): Adapter<SongAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(ItemSongsBinding.inflate
            (LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = songList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
    inner class ViewHolder(private val binding: ItemSongsBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(){
            val song = songList[adapterPosition]
            binding.apply {
                tvNumber.text = (adapterPosition + 1).toString()
                tvSong.text = song.songName
                tvSinger.text = song.singerName
                tvSongTime.text = song.songTime
            }
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }

        }

}

}
