package com.example.c4q.buzzfeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by c4q on 11/15/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {//lets work on the CustomAdapter now.
    private List<Quiz> quizList;// don't worry about the end result.

    public CustomAdapter(List<Quiz> quizList) {// Now lets add stuff to the quiz.
        this.quizList = quizList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_itemview,parent,false);
        return new CustomViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Quiz quiz= quizList.get(position);
        holder.onBind(quiz);

    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }
}
