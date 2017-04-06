package com.example.angithadas.alertdialogbox;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlert(View view){

        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure,You wanted to make decision");
        alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
        alertDialogBuilder.setTitle("Alert");
        alertDialogBuilder.setPositiveButton("yes",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this,"You clicked Yes button",Toast.LENGTH_LONG).show();
            }
        });
        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this,"You clicked No button",Toast.LENGTH_LONG).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this,"You clicked Later button",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        final AlertDialog alertDialog = alertDialogBuilder.create();
//        Custom Layout for alert dialog

//        LayoutInflater inflater = getLayoutInflater();
//        final View newView =inflater.inflate(R.layout.tabs, null);
//        alertDialogBuilder.setView(newView);
//
//        Button yes = (Button) newView.findViewById(R.id.btn_yes);
//        Button no = (Button) newView.findViewById(R.id.btn_no);
//        yes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               finish();
//            }
//        });
//        no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                alertDialog.dismiss();
//            }
//        });
        alertDialog.show();
    }

    public void showCustomAlert(View view){
        CustomDialogClass cdd=new CustomDialogClass(this);
        cdd.show();
    }
    }

