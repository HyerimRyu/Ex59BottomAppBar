package kr.co.teada.ex59bottomappbar;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bab;

    boolean isCenter=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. BAB 를 액션바로 대체
        bab=findViewById(R.id.bab);
        setSupportActionBar(bab);

        //2. 업버튼
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    //3.

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bab_action,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //4.
    public void clickBtn(View view) {
        isCenter=!isCenter;

        if(isCenter)bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
        else bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);

    }
}
