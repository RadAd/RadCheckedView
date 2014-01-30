package au.radsoft.example;

import android.app.Activity;
import android.os.Bundle;

import android.widget.AbsListView;
import android.widget.ListView;

import android.content.res.TypedArray;

import au.radsoft.widget.TypedArrayAdapter;

public class Example1 extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_single_choice);
        //setContentView(R.layout.list_multiple_choice);
        
        //init(android.R.layout.simple_list_item_checked, R.array.names, 0);
        //init(android.R.layout.simple_list_item_single_choice, R.array.names, 0);
        //init(android.R.layout.simple_list_item_multiple_choice, R.array.names, 0);
        //init(R.layout.simple_list_item_background_checked, R.array.names, 0);
        
        //init(android.R.layout.simple_selectable_list_item, R.array.names, 0); doesnt work???

        //init(R.layout.list_image_checked, R.array.images, android.R.drawable.ic_menu_help);
        //init(R.layout.list_image_single_choice, R.array.images, android.R.drawable.ic_menu_help);
        //init(R.layout.list_image_multiple_choice, R.array.images, android.R.drawable.ic_menu_help);
        init(R.layout.list_image_background_checked, R.array.images, android.R.drawable.ic_menu_help);
    }
    
    void init(int resid, int arrayid, int defid)
    {
        ListView listview = (ListView) findViewById(android.R.id.list);
        TypedArray typedarray = getResources().obtainTypedArray(arrayid);
        listview.setAdapter(new TypedArrayAdapter(this, resid, typedarray, defid));
        listview.setItemChecked(1, true);
    }
}
