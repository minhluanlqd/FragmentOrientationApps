package com.example.dell.fragmentorientation;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {

    ArrayList<Student> arrayStudent;
    StudentAdapter adapter;
    PushStudent pushStudent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        pushStudent = (PushStudent) getActivity();
        arrayStudent = new ArrayList<>();
        AddArrayStudent();
        adapter = new StudentAdapter(getActivity(),R.layout.student_row,arrayStudent);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list,container,false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        pushStudent.DataStudent(arrayStudent.get(position));

    }

    private void AddArrayStudent(){
        arrayStudent.add(new Student("Trần Minh Luân",1999,"Hồ Chí Minh","minhluanlqd@gmail.com"));
        arrayStudent.add(new Student("A",1998,"Hồ Chí Minh","A@gmail.com"));
        arrayStudent.add(new Student("B",2001,"Hồ Chí Minh","B@gmail.com"));
        arrayStudent.add(new Student("C",2000,"Hồ Chí Minh","C@gmail.com"));
        arrayStudent.add(new Student("D",1997,"Hồ Chí Minh","D@gmail.com"));
    }
}
