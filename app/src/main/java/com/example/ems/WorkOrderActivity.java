package com.example.ems;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.example.ems.view.BackArrow;

/**
 * Created by zhangpan on 16/9/4.
 */
public class WorkOrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workorder);

       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        init();
    }

    private void init() {
        BackArrow backArrow = (BackArrow) findViewById(R.id.back);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
