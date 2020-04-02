package com.example.room_db_persistance;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {

    @Insert
   void insert(Student student);

    @Query("SELECT * FROM student_table")
    List<Student> getAllStudents();

    @Delete
    void delete(Student student);



}
