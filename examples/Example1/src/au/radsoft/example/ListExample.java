package au.radsoft.example;

import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;

import android.widget.AbsListView;
import android.widget.Toast;

import au.radsoft.widget.TypedArrayAdapter;

public class ListExample extends Activity
{
    enum Msg {
        LISTID,
        RESID,
        ARRAYID,
        DEFID,
    };
    
    static public void start(Context c, int listid, int resid, int arrayid, int defid)
    {
        try
        {
            Intent intent = new Intent(c, ListExample.class);
            intent.putExtra(Msg.LISTID.toString(), listid);
            intent.putExtra(Msg.RESID.toString(), resid);
            intent.putExtra(Msg.ARRAYID.toString(), arrayid);
            intent.putExtra(Msg.DEFID.toString(), defid);
            c.startActivity(intent);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toast toast = Toast.makeText(c, e.toString(), Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        Intent intent = getIntent();
        final int listid = intent.getIntExtra(Msg.LISTID.toString(), R.layout.list_single_choice);
        final int resid = intent.getIntExtra(Msg.RESID.toString(), R.layout.list_image_checked);
        final int arrayid = intent.getIntExtra(Msg.ARRAYID.toString(), R.array.images);
        final int defid = intent.getIntExtra(Msg.DEFID.toString(), android.R.drawable.ic_menu_help);
        
        setContentView(listid);

        AbsListView listview = (AbsListView) findViewById(android.R.id.list);
        
        TypedArray typedarray = getResources().obtainTypedArray(arrayid);
        listview.setAdapter(new TypedArrayAdapter(this, resid, typedarray, defid));
        listview.setItemChecked(1, true);
    }
}
