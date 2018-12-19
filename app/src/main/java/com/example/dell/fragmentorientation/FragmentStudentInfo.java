package com.example.dell.fragmentorientation;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentStudentInfo extends Fragment {

    TextView txtName, txtDate, txtAddress, txtMail;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info,container,false);
        func();
        return view;
    }
    @SuppressLint("SetTextI18n")
    public void setInfo(Student s){
        txtName.setText(s.getName());
        txtDate.setText("Date of birth: "+ s.getDayofBirth());
        txtMail.setText("Email: " + s.getEmail());
        txtAddress.setText("Address:" + s.getAddress());
    }

    private void func(){
        txtName = view.findViewById(R.id.textViewName);
        txtDate = view.findViewById(R.id.textViewDate);
        txtAddress = view.findViewById(R.id.textViewAddress);
        txtMail = view.findViewById(R.id.textViewEmail);
    }
}
