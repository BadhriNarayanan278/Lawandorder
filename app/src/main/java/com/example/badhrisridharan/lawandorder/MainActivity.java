package com.example.badhrisridharan.lawandorder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerBn(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScMQOT_9Ql8qURXcNGm3m5moB0do-bk1xG6qXWw4ywGyeMnfA/viewform?fbzx=1187911485947581638"));
        startActivity(intent);
    }

    public void loginBn(View v) {
        String a = ((EditText) findViewById(R.id.userName)).getText().toString();
        String b = ((EditText) findViewById(R.id.passWord)).getText().toString();
        String c = "Manoj";
        String d = "Manoj@srm99";
        if (a.equals(c) && b.equals(d)) {
            setContentView(R.layout.main_window);
        } else {
            Toast.makeText(getApplicationContext(),"Invalid Username or password",Toast.LENGTH_SHORT).show();


        }
    }
    public void christianLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=16ibijFF7IhOVwXJuZxIheoAnvfqXl62b"));
        startActivity(intent);

    }
    public void companyLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ZIkjLrwCd6FYSB_V6HUbF4TrOpR8ZUef"));
        startActivity(intent);

    }
    public void contractLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1SB0MCdn66d22wKuZ-_xKpAILBZsCtyl5"));
        startActivity(intent);

    }
    public void criminalLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=15ak_DA6ku_Xm7CogLACy9JNeTRdzm5ky"));
        startActivity(intent);

    }
    public void familyLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1B-AxbfwjtlWohkvtfos4L4vnRkfktsN3"));
        startActivity(intent);

    }
    public void hinduLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1_qKtLuE2fqVLreBSMgYHimFXhuVueKAv"));
        startActivity(intent);

    }
    public void labourLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1mJ_vQmrrb2J6ELFoJEoFaDejVSHkwz1w"));
        startActivity(intent);

    }
    public void lawEnforcement(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=166S_-8E8LnvxhZaWDL90WEc9r4gQ0SnL"));
        startActivity(intent);

    }
    public void muslimLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Tm7SZOYNDz9awFp40ljPDboSAcXitksM"));
        startActivity(intent);

    }
    public void nationalityLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1l91RjuDYMB9VdEx_CXH_g1to22jMWwa8"));
        startActivity(intent);

    }
    public void taxLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1DxFOEiZjN4IEsJf62wcgdX_fcZ5zU5yn"));
        startActivity(intent);

    }
    public void tortLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1FDH9Rb4dCaYtfLry-kTvKHYwlw-VyQKt"));
        startActivity(intent);

    }
    public void trustLaw(View v){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1kmhOGpC3mecf-ZllDTGFqCDF1JfKtTfz"));
        startActivity(intent);

    }
}
