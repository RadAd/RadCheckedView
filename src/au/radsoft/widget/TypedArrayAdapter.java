package au.radsoft.widget;

import android.content.Context;
import android.content.res.TypedArray;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TypedArrayAdapter extends BaseAdapter
{
    private final LayoutInflater layoutInflater_;
    private final int resource_;
    private final int id_;
    private final TypedArray typedarray_;
    private final int defresource_;

    public TypedArrayAdapter(Context context, int resource, TypedArray typedarray)
    {
        this(context, resource, 0, typedarray, 0);
    }

    public TypedArrayAdapter(Context context, int resource, TypedArray typedarray, int defresource)
    {
        this(context, resource, 0, typedarray, defresource);
    }

    public TypedArrayAdapter(Context context, int resource, int resourceid, TypedArray typedarray)
    {
        this(context, resource, resourceid, typedarray, 0);
    }
    
    public TypedArrayAdapter(Context context, int resource, int resourceid, TypedArray typedarray, int defresource)
    {
        layoutInflater_ = LayoutInflater.from(context);
        resource_ = resource;
        id_ = resourceid;
        typedarray_ = typedarray;
        defresource_ = defresource;
    }

    @Override
    public int getCount()
    {
        //return typedarray_.getIndexCount();
        return typedarray_.length();
    }

    @Override
    public Object getItem(int position)
    {
        //return typedarray_.getDrawable(position);
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        //return typedarray_.getResourceId(position, -1);
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = layoutInflater_.inflate(resource_, parent, false);
        {
            View sv = id_ == 0 ? v : v.findViewById(id_);
            
            if (sv instanceof TextView)
            {
                TextView tv = (TextView) sv;
                //tv.setText(typedarray_.getResourceId(position, defresource_));
                tv.setText(typedarray_.getString(position));
            }
            else if (sv instanceof ImageView)
            {
                ImageView iv = (ImageView) sv;
                iv.setImageResource(typedarray_.getResourceId(position, defresource_));
            }
        }
        return v;
    }
}
