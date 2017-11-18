package com.example.c4q.buzzfeed;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by c4q on 11/15/17.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {
    private TextView question;//but you should not depend on it.
    private ImageView pic;

    public CustomViewHolder(View itemView) {
        super(itemView);
        question = (TextView) itemView.findViewById(R.id.question);
        pic = (ImageView) itemView.findViewById(R.id.pics);
    }

    public void onBind(Quiz quiz) {
        question.setText(quiz.getQuestion());
        pic.setBackground(quiz.getPic());
    }
}
