package com.hcdc.monterarecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.*;

import org.w3c.dom.Text;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>  {

    Context context;
    String programName[];
    String courses[];
    String Acourses[];
    int deptImages[];


    public CourseAdapter(Context c, String[] name, String[] course, String[] Acourse, int[] deptImage){
        context = c;
        programName = name;
        courses = course;
        Acourses = Acourse;
        deptImages = deptImage;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.course_row, parent, false);
        return new CourseViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        holder.pnameHolder.setText(programName[position]);
        holder.AcourseHolder.setText(Acourses[position]);
        holder.imageholder.setImageResource(deptImages[position]);
        holder.imageID = deptImages[position];
        holder.tempholder = (courses[position]);
    }

    @Override
    public int getItemCount() {
        return programName.length;
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder{

        TextView pnameHolder;
        TextView AcourseHolder;
        ImageView imageholder;
        String tempholder;
        int imageID;
        ConstraintLayout layout;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            pnameHolder = itemView.findViewById(R.id.textView);
            AcourseHolder = itemView.findViewById(R.id.textView2);
            imageholder = itemView.findViewById(R.id.imageView);
            layout = itemView.findViewById(R.id.constraintlayout);
            layout.setOnClickListener(onLayoutClick);

        }

        OnClickListener onLayoutClick = new OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("name", pnameHolder.getText().toString());
                intent.putExtra("courses", tempholder);
                intent.putExtra("image", imageID);
                context.startActivity(intent);

            }
        };

    }




}
