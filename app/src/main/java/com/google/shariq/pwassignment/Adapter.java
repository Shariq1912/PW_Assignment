package com.google.shariq.pwassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    // creating a variable for array list and context.
    private ArrayList<Modal> ModalArrayList;
    private Context context;

    // creating a constructor for our variables.
    public Adapter(ArrayList<Modal> ModalArrayList, Context context) {
        this.ModalArrayList = ModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // below line is to inflate our layout.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        // setting data to our views of recycler view.
        Modal modal = ModalArrayList.get(position);
        holder.name.setText(modal.getName());
        //holder.qualifica.setText(modal.getCourseTracks());
        holder.courseModeTV.setText(modal.getSubject());
        Picasso.get().load(modal.getimage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        // returning the size of array list.
        return ModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our views.
        private TextView name, courseModeTV, qualifica;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // initializing our views with their ids.
            name = itemView.findViewById(R.id.idTVCourseName);
            courseModeTV = itemView.findViewById(R.id.idTVBatch);
            //qualifica = itemView.findViewById(R.id.idTVTracks);
            image = itemView.findViewById(R.id.idIVCourse);
        }
    }
}

