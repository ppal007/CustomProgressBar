package com.ppal007.customprogressdialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;

import java.util.Objects;

public class DialogAdapter {

    private Context context;
    private AlertDialog alertDialog;


    public DialogAdapter(Context context) {
        this.context = context;
    }

    @SuppressLint("InflateParams")
   public void startLoadingDialog(){
         AlertDialog.Builder builder = new AlertDialog.Builder(context);
         LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         builder.setView(Objects.requireNonNull(inflater).inflate(R.layout.custom_progress_bar,null));
         builder.setCancelable(false);

         alertDialog = builder.create();
         alertDialog.show();
    }

   public void dismissDialog(){
         alertDialog.dismiss();
    }


}
