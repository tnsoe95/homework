package com.example.recycleviewnavigation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewnavigation.R
import com.example.recycleviewnavigation.model.Person
import kotlinx.android.synthetic.main.item_person.view.*


class PersonAdapter(var personList: ArrayList<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun bindPerson (person: Person){
            itemView.txtname.text = person.name
            itemView.txtoccupation.text = person.occupation
            itemView.imgavatar.setImageResource(person.profileImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])
    }

}