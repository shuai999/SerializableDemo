package com.jackchen.erizlizable.bundle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jackchen.erizlizable.MainActivity;
import com.jackchen.erizlizable.R;
import com.jackchen.erizlizable.bean.Police;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/2 15:48
 * Version 1.0
 * Params:
 * Description:   ParceableActivity取出传递过来的数据
*/
public class ParceableActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parceable);

        TextView test_parceable = (TextView) findViewById(R.id.test_parceable);
        Police mPolice = (Police)getIntent().getParcelableExtra(MainActivity.PAR_KEY);
        test_parceable.setText("name -> " + mPolice.getName() + "worktime -> " + mPolice.getWorkTime());


    }
}
