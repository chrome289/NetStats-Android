package com.siddharth.netstats;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class cfrag1 extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.cfrag1, container, false);
    }
    public void go(String temp1,String temp2,String temp3,String temp4 ,String temp5,String temp6,String temp7,String temp8)
    {
        //Log.v("gdfg", temp5);
        TextView t1=(TextView)getView().findViewById(R.id.tv1);
        t1.setText(temp1);
        t1=(TextView)getView().findViewById(R.id.tv2);
        t1.setText(temp2);
        t1=(TextView)getView().findViewById(R.id.tv3);
        t1.setText(temp3);
        t1=(TextView)getView().findViewById(R.id.tv4);
        t1.setText(temp4);
        t1=(TextView)getView().findViewById(R.id.tv5);
        t1.setText(temp5);
        t1=(TextView)getView().findViewById(R.id.tv6);
        t1.setText(temp6);
        t1=(TextView)getView().findViewById(R.id.tv7);
        t1.setText(temp7);
        t1=(TextView)getView().findViewById(R.id.tv8);
        t1.setText(temp8);
        //Log.v("dsfs", "end");
    }
}