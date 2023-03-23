package com.example.videoview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView vv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  mVideoView = findViewById(R.id.video);
            //solicitud();


        int orientacion=getResources().getConfiguration().orientation;
        if (orientacion== Configuration.ORIENTATION_LANDSCAPE)
        {
            getSupportActionBar().hide();
        }

        else{
            getSupportActionBar().hide();
        }

//Se crea la vista VideoView
        vv1=findViewById(R.id.video);
      vv1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.awaken));
      MediaController mc = new MediaController(this);
      vv1.setMediaController(mc);
      mc.setAnchorView(vv1);
      vv1.start();

        //permiso read mediavideo



    }

/*
    public void solicitud (){
        int REQUEST_CODE = 50;
        int permisoLeer= ContextCompat.checkSelfPermission(this, Manifest.permission.READ_MEDIA_VIDEO);
        if (permisoLeer== PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Permiso Accedido", Toast.LENGTH_SHORT).show();
            mVideoView.setVideoPath("/storege/emulated/0/DCIM/Camera/Exacto.mp4");
            mVideoView.start();
            mVideoView.requestFocus();
            mVideoView.setMediaController(new MediaController(this));
        }
        else{
            requestPermissions(new String[]{Manifest.permission.READ_MEDIA_VIDEO},REQUEST_CODE);

        }
    }
*/

}