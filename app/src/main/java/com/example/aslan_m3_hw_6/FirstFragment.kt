package com.example.aslan_m3_hw_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import com.example.aslan_m3_hw_6.databinding.FragmentFirstBinding
import com.example.aslan_m3_hw_6.databinding.FragmentSecondBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var songList = arrayListOf<Song>()
    private var bundle = Bundle()
    private var fragment: SecondFragment = SecondFragment()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        songList.clear()
        loadData()

        val songAdapter = SongAdapter(songList, this::onClick)
        binding.rvSong.adapter = songAdapter
    }
    private fun loadData() {
        songList.add(Song("Dusk Till Down", "Zayn", "5.37"))
        songList.add(Song("Ride", "Twenty One Pilots", "3.46"))
        songList.add(Song("Famy", "Ava", "4.01"))
        songList.add(Song("Rainy Day", "TumaniYO", "4.42"))
        songList.add(Song("Set fire to the hills", "Adele", "4.11"))
        songList.add(Song("Not Afraid", "Eminem", "4.19"))
        songList.add(Song("Way Down We Go", "Koleo", "3.35"))
        songList.add(Song("Enemy", "Imagine Dragons", "3.34"))
        songList.add(Song("Люби Меня", "MiyaGi", "5.21"))
        songList.add(Song("Blinding Lights", "The Weeknd", "10.21"))
        songList.add(Song("Не Лей", "Bakr", "3.21"))
    }

    private fun onClick(position: Int) {
        bundle.putSerializable("Key", songList[position])
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment).addToBackStack(null).commit()

    }




}