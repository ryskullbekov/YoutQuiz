package com.example.youtquiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizHolder> {
    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    List<QuestionModel>list = new ArrayList<>();


    public QuizAdapter(List<QuestionModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public QuizAdapter.QuizHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_level,parent,false);
        return new QuizHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizAdapter.QuizHolder holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class QuizHolder extends RecyclerView.ViewHolder {
        TextView tvLevel;
        ImageView imageView;

        public QuizHolder(@NonNull View itemView) {
            super(itemView);
            tvLevel = itemView.findViewById(R.id.level_tv);
        }

        public void bind(QuestionModel questionModel) {
            tvLevel.setText(questionModel.getCurrentLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.onItemClick(questionModel);
                }
            });
        }
    }
}
