package com.example.c4q.buzzfeed;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by c4q on 11/15/17.
 */

public class Quiz {
    String question;
    Drawable pic;

    public Quiz(String question, Drawable pic) {
        this.question = question;
        this.pic = pic;
    }

    public String getQuestion() {
        return question;
    }

    public Drawable getPic() {
        return pic;
    }
}
