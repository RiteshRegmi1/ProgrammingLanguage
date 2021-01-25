package com.blogspot.riteshcodejava.programminglanguage.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.riteshcodejava.programminglanguage.Models.programmingModels;
import com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities.CProgramming;
import com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities.cplusActivity;
import com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities.javaActivity;
import com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities.phpAcitvity;
import com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities.pythonActivity;
import com.blogspot.riteshcodejava.programminglanguage.R;
import com.blogspot.riteshcodejava.programminglanguage.databinding.ProgrammingLayoutBinding;

import java.util.ArrayList;

public class programmingAdapters  extends RecyclerView.Adapter<programmingAdapters.ViewHolder> {
    Context context;
    ArrayList<programmingModels> list;

    public programmingAdapters(Context context, ArrayList<programmingModels> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.programming_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.binding.programmingImageView.setImageResource(list.get(position).getImageId());
    holder.binding.ProgrammingTextViewTitle.setText(list.get(position).getProgrammingTitle());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (position){
                case 0:
                    context.startActivity(new Intent(context, CProgramming.class));
                    break;
                case 1:
                    context.startActivity(new Intent(context, cplusActivity.class));
                    break;
                case 2:
                    context.startActivity(new Intent(context, javaActivity.class));
                    break;
                case 3:
                context.startActivity(new Intent(context, phpAcitvity.class));
                break;
                case 4:
                    context.startActivity(new Intent(context, pythonActivity.class));
                    break;

            }
        }
    });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ProgrammingLayoutBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ProgrammingLayoutBinding.bind(itemView);
        }
    }
}
