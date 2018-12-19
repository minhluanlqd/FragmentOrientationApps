package com.example.dell.fragmentorientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_information);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("InfoStudent");

        FragmentStudentInfo studentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentDetail);
        studentInfo.setInfo(student);
    }
}
