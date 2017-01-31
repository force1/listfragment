package com.mycompany.listfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Layout1 layout1;
        Layout2 layout2;
        Layout3 layout3;
        Layout4 layout4;

        if (item.equals("layout1")) {
            layout1 = new Layout1();
            fragmentTransaction.replace(R.id.detailFragment, layout1);
            fragmentTransaction.commit();
        } else if (item.equals("layout2")) {
            layout2 = new Layout2();
            fragmentTransaction.replace(R.id.detailFragment, layout2);
            fragmentTransaction.commit();
        } else if (item.equals("layout3")) {
            layout3 = new Layout3();
            fragmentTransaction.replace(R.id.detailFragment, layout3);
            fragmentTransaction.commit();
        } else if (item.equals("layout4")) {
            layout4 = new Layout4();
            fragmentTransaction.replace(R.id.detailFragment, layout4);
            fragmentTransaction.commit();
        }
        return super.onOptionsItemSelected(item);
    }
}






