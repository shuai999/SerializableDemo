package com.jackchen.erizlizable.bundle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jackchen.erizlizable.MainActivity;
import com.jackchen.erizlizable.R;
import com.jackchen.erizlizable.bean.Person;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/2 15:48
 * Version 1.0
 * Params:
 * Description:   SerializableActivity 取出传递过来的数据
*/
public class SerializableActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serializable);

        TextView test_serializable = (TextView) findViewById(R.id.test_serializable);

        Person person = (Person) getIntent().getSerializableExtra(MainActivity.SER_KEY);
        test_serializable.setText("name -> " + person.getName() + " age -> " + person.getAge());
    }
}
