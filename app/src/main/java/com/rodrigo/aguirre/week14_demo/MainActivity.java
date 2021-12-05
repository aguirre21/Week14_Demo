package com.rodrigo.aguirre.week14_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiModeManager;
import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private UiModeManager uiModeManager;
    private Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //checks the theme of the UI
        uiModeManager= (UiModeManager) getSystemService(UI_MODE_SERVICE);

        //create switch if checked creates night mode
        //onClickListener switch between night mode and not
        s= (Switch) findViewById(R.id.switch1);
        s.setOnClickListener(e->{
            if(s.isChecked()){
                uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
            }else{
                uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_YES);
            }
        });
    }
}