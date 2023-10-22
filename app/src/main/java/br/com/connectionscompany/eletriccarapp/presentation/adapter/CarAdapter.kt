package br.com.connectionscompany.eletriccarapp.presentation.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.connectionscompany.eletriccarapp.R

class CarAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init {
            textView = view.findViewById(R.id.tv_preco_value)
        }
    }
}


