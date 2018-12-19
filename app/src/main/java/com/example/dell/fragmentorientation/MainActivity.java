package com.example.dell.fragmentorientation;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PushStudent{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void DataStudent(Student student) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo)
                getFragmentManager().findFragmentById(R.id.fragmentInfo);

        Configuration configuration = getResources().getConfiguration();

        //còn 1 cách là fragmentStudentInfo.isInlayout()
        if(fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentStudentInfo.setInfo(student);
        }else {
            Intent intent = new Intent(MainActivity.this,StudentInformation.class);
            intent.putExtra("InfoStudent",student);
            startActivity(intent);
        }
    }
}
