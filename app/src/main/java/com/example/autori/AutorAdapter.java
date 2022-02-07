package com.example.autori;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AutorAdapter extends RecyclerView.Adapter<AutorAdapter.AutorViewHolder> {

    private ArrayList<Autor> autorList;

    public AutorAdapter(ArrayList<Autor> autorList) {
        this.autorList = autorList;
    }

    @NonNull
    @Override
    public AutorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new AutorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AutorViewHolder holder, int position) {
        Autor autor = autorList.get(position);

        holder.firstName.setText(autor.getFirstName());
        holder.lastName.setText(autor.getLastName());
        holder.numberOfPublishedBooks.setText(String.valueOf(autor.getNumberOfPublishedBooks()));
        holder.bestseller.setText(autor.getBestseller());
        holder.numberOfSelledBestsellerBooks.setText(String.valueOf(autor.getNumberOfSelledBestsellerBooks()));
        holder.imageView.setImageResource(R.drawable.person);
    }

    static class AutorViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView firstName;
        TextView lastName;
        TextView numberOfPublishedBooks;
        TextView bestseller;
        TextView numberOfSelledBestsellerBooks;

        AutorViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            firstName = itemView.findViewById(R.id.firstName);
            lastName = itemView.findViewById(R.id.lastName);
            numberOfSelledBestsellerBooks = itemView.findViewById(R.id.numberOfSelledBestsellerBooks);
            bestseller = itemView.findViewById(R.id.bestseller);
            numberOfPublishedBooks = itemView.findViewById(R.id.numberOfPublishedBooks);
        }
    }

    @Override
    public int getItemCount() {
        return autorList.size();
    }
}
