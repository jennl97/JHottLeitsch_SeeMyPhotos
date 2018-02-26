package com.example.jenniferhott_leitsch.jhottleitsch_seemyphotos;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        String[] photos={" Bird Prints in Concrete"," Spanish Monument"," A Mansion Downtown"," Riverwalk"," Another Downtown Mansion"," My Office"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.travel,photos));
        }

        protected void onListItemClick(ListView l, View v, int position, long id){
            switch (position){
                case 0:
                    startActivity(new Intent(MainActivity.this,Concrete.class));
                    break;
                case 1:
                    startActivity(new Intent(MainActivity.this,Monument.class));
                    break;

                case 2:
                    startActivity(new Intent(MainActivity.this,Mansion.class));
                    break;
                case 3:
                    startActivity(new Intent(MainActivity.this,Riverwalk.class));
                    break;
                case 4:
                    startActivity(new Intent(MainActivity.this,Mansion2.class));
                    break;
                case 5:
                    startActivity(new Intent(MainActivity.this,Office.class));
                    break;
           }

        }
}
