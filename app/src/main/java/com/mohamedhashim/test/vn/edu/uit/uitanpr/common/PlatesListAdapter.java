package com.mohamedhashim.test.vn.edu.uit.uitanpr.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mohamedhashim.test.R;
import com.mohamedhashim.test.vn.edu.uit.uitanpr.models.BitmapWithCentroid;

import java.util.List;

public class PlatesListAdapter extends ArrayAdapter{

    private LayoutInflater inflater;
    private Context mContext;

    public PlatesListAdapter (Context context, List<BitmapWithCentroid> objects) {
          super(context, R.layout.listrow, objects );
          inflater = LayoutInflater.from(context);
          this.mContext = context;
    }

    @Override
    public View getView ( int position, View convertView, ViewGroup parent ) {
          convertView = (LinearLayout) inflater.inflate(R.layout.listrow, null );
          
          BitmapWithCentroid bitmapWithCentroid = (BitmapWithCentroid) getItem( position );

          Bitmap plateImage = bitmapWithCentroid.getBitmap();

          /* Take the ImageView from layout and set the city's image */
          ImageView plateImageView = (ImageView) convertView.findViewById(R.id.image);
          plateImageView.setImageBitmap(plateImage);
          
          return convertView;
    }
}
