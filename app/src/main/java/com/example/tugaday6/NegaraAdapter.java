package com.example.tugaday6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraAdapter.ViewHolder> {
    private ArrayList<NegaraModel> negaraModel;



    public NegaraAdapter(ArrayList<NegaraModel> negaraModel) {
        this.negaraModel = negaraModel;
    }

    @NonNull
    @Override
    public NegaraAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull NegaraAdapter.ViewHolder holder, int position) {
        holder.namaNegara.setText(negaraModel.get(position).getNamaNegara());
        holder.logoBendera.setImageResource(negaraModel.get(position).getLogoBendera());
    }

    @Override
    public int getItemCount() {
        return negaraModel.size();
    }
    public interface OnItemClickListener{
            void onItemClick(NegaraModel model );
    }
    private  OnItemClickListener listener;
    public  void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView namaNegara;
        ImageView logoBendera;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaNegara = itemView.findViewById(R.id.nama_negara);
            logoBendera = itemView.findViewById(R.id.logo_bendera);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (listener != null){
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    listener.onItemClick(negaraModel.get(position));
                }
            }
        }
    }
}
