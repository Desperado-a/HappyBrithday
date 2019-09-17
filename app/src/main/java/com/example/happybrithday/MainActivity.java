package com.example.happybrithday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;




//import junit.framework.Assert;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.Menu;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.MultiChoiceModeListener;

import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick1(View view)
    {
        AlertDialog.Builder builder=new Builder(this);

        builder.setTitle(getResources().getString(R.string.wishyou));//标题

        builder.setMessage(getResources().getString(R.string.mywish));//对话框
        builder.setPositiveButton(getResources().getString(R.string.ok), new OnClickListener() {  //这个是设置确定按钮

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.haha), Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog b=builder.create();
        b.show();
    }

}
