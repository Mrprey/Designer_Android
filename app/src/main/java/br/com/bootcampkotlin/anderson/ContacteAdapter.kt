package br.com.bootcampkotlin.anderson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContacteAdapter : RecyclerView.Adapter<ContacteAdapter.ContacteViewHolder>(){

    private val list: MutableList<Contacte> = mutableListOf()

    class ContacteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val tvName = itemView.findViewById<TextView>(R.id.tv_name)
        private val tvPhone = itemView.findViewById<TextView>(R.id.tv_phone)
        private val ivPhotograph = itemView.findViewById<ImageView>(R.id.iv_photograph)

        fun bind(contacte: Contacte){
            tvName.text = contacte.name
            tvPhone.text = contacte.phone
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContacteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContacteViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContacteViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(newList: List<Contacte>){
        this.list.clear()
        this.list.addAll(newList)
        notifyDataSetChanged()
    }
}