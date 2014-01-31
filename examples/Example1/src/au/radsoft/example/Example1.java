package au.radsoft.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Example1 extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onListTextSingleChecked(View v)
    {
        ListExample.start(this, R.layout.list_single_choice, android.R.layout.simple_list_item_checked, R.array.names, 0);
    }
    
    public void onListTextMultiChecked(View v)
    {
        ListExample.start(this, R.layout.list_multiple_choice, android.R.layout.simple_list_item_checked, R.array.names, 0);
    }
    
    public void onListTextSingleChoice(View v)
    {
        ListExample.start(this, R.layout.list_single_choice, android.R.layout.simple_list_item_single_choice, R.array.names, 0);
    }
    
    public void onListTextMultiChoice(View v)
    {
        ListExample.start(this, R.layout.list_multiple_choice, android.R.layout.simple_list_item_multiple_choice, R.array.names, 0);
    }
    
    public void onListTextSingleBackground(View v)
    {
        ListExample.start(this, R.layout.list_single_choice, R.layout.simple_list_item_background_checked, R.array.names, 0);
    }

    public void onListImageSingleChecked(View v)
    {
        ListExample.start(this, R.layout.list_single_choice, R.layout.list_image_checked, R.array.images, android.R.drawable.ic_menu_help);
    }
    
    public void onListImageMultiChecked(View v)
    {
        ListExample.start(this, R.layout.list_multiple_choice, R.layout.list_image_checked, R.array.images, android.R.drawable.ic_menu_help);
    }
    
    public void onListImageSingleChoice(View v)
    {
        ListExample.start(this, R.layout.list_single_choice, R.layout.list_image_single_choice, R.array.images, android.R.drawable.ic_menu_help);
    }
    
    public void onListImageMultiChoice(View v)
    {
        ListExample.start(this, R.layout.list_multiple_choice, R.layout.list_image_multiple_choice, R.array.images, android.R.drawable.ic_menu_help);
    }
    
    public void onListImageSingleBackground(View v)
    {
        ListExample.start(this, R.layout.list_single_choice, R.layout.list_image_background_checked, R.array.images, android.R.drawable.ic_menu_help);
    }
}
