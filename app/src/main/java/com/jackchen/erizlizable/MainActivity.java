package com.jackchen.erizlizable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jackchen.erizlizable.bean.Person;
import com.jackchen.erizlizable.bean.Police;
import com.jackchen.erizlizable.bundle.ParceableActivity;
import com.jackchen.erizlizable.bundle.SerializableActivity;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/2 16:06
 * Version 1.0
 * Params:
 * Description:  使用Serializable 和 Parceable 传递对象
*/
public class MainActivity extends AppCompatActivity {

    private Button serButton;
    private Button parButton;

    public final static String SER_KEY = "SER_FLAG" ;
    public final static String PAR_KEY = "PAR_FLAG" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        serButton = (Button) findViewById(R.id.serButton); // Serializable
        parButton = (Button) findViewById(R.id.parButton); // Parcelable


        serButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serializableMethod() ;
            }
        });

        parButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parceableMethod() ;
            }
        });

    }



    /**
     *   Serializable传递对象的方法
     */
    private void serializableMethod() {
        Person mPerson = new Person() ;
        mPerson.setName("JackChen");
        mPerson.setAge(26);

        Intent intent = new Intent(this , SerializableActivity.class) ;
        Bundle bundle = new Bundle() ;
        bundle.putSerializable(SER_KEY , mPerson);
        intent.putExtras(bundle) ;
        startActivity(intent);
    }


    /**
     *  Parceable传递对象的方法
     */
    private void parceableMethod() {
        Police mPolice = new Police() ;
        mPolice.setName("I am JackChen");
        mPolice.setWorkTime(2008);

        Intent intent = new Intent(this , ParceableActivity.class) ;
        Bundle bundle = new Bundle() ;
        bundle.putParcelable(PAR_KEY , mPolice);
        intent.putExtras(bundle) ;
        startActivity(intent);
    }



}
