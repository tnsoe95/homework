package com.example.recycleviewnavigation.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.recycleviewnavigation.R
import com.example.recycleviewnavigation.adapter.PersonAdapter
import com.example.recycleviewnavigation.model.Person
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var root = inflater.inflate(R.layout.fragment_list, container, false)

        var personArray = ArrayList<Person>()
        personArray.add(Person("James","Developer",R.drawable.photoone))
        personArray.add(Person("John","Manager",R.drawable.photoone))
        personArray.add(Person("James","Developer",R.drawable.photoone))


        var personAdapter = PersonAdapter(personArray)

        //recyclerView.layoutManager = LinearLayoutManager( this)

        //recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = GridLayoutManager (context , 2)
        recyclerView.adapter = personAdapter

        // Inflate the layout for this fragment
        return root
    }


}
