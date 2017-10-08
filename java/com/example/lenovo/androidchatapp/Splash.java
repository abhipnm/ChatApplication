package com.example.lenovo.androidchatapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.style.URLSpan;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.felipecsl.gifimageview.library.GifImageView;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import org.apache.http.params.HttpConnectionParams;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Lenovo on 07-10-2017.
 */

public class Splash extends AwesomeSplash {
/*
    GifImageView gifImageView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        gifImageView=(GifImageView)findViewById(R.id.gifimageview);

        gifImageView.startAnimation();

        Thread timerThread=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent=new Intent(Splash.this,Login.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
*/
    @Override
    public void initSplash(ConfigSplash configSplash) {
        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configSplash.setBackgroundColor(R.color.bg_splash);

        configSplash.setAnimCircularRevealDuration(5000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);

        //configSplash.setLogoSplash(R.drawable.bg);

        configSplash.setTitleSplash("CHATIYAO");
        configSplash.setTitleTextSize(30f);
        configSplash.setLogoSplash(R.drawable.bg3);
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipOutY);

    }

    @Override
    public void animationsFinished() {

        startActivity(new Intent(Splash.this,Login.class));

    }

    /*@Override
    protected void onPause(){
        super.onPause();
        finish();
    }*/

    /*class RetrieveByteArray extends AsyncTask<String,Void,byte[]>{

        @Override
        protected byte[] doInBackground(String... strings) {
            try{
                URL url=new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    InputStream in=new BufferedInputStream(urlConnection.getInputStream());
                    ByteArrayOutputStream buffer=new ByteArrayOutputStream();
                    int nRead;
                    byte[] data=new byte[10240];
                    while(nRead=in.read(data,0,data.length) != -1){
                        buffer.write(data,0,nRead);
                    }
                    buffer.flush();
                    return  buffer.toByteArray();
                }
            } catch (MalformedURLException e) {

            } catch (IOException e) {

            }
            return null;
        }
    }*/


   // protected  void onPostExecute()

}
