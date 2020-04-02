package com.example.room_db_persistance;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentDataAdapter extends RecyclerView.Adapter<StudentDataAdapter.StudentViewHolder>{

    private ArrayList<Student> students;

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.student_list_item,viewGroup,false);

        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {

         Student currentStudent=students.get(i);

         studentViewHolder.name.setText(currentStudent.getName());
         studentViewHolder.email.setText(currentStudent.getEmail());
         studentViewHolder.country.setText(currentStudent.getCountry());
         studentViewHolder.date.setText(currentStudent.getRegisteredTime());


    }

    @Override
    public int getItemCount() {

        if(students!=null) {

            return students.size();

        } else{}

        return 0;

            }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        notifyDataSetChanged();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{

         private TextView name,email,country,date;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.tvName);
        email=itemView.findViewById(R.id.tvEmail);
        country=itemView.findViewById(R.id.tvCountry);
        date=itemView.findViewById(R.id.tvTime);


    }
}
}
