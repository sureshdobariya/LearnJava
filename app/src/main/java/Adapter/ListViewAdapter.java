package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.riontech.learnjava.MainActivity;
import com.riontech.learnjava.R;

/**
 * Created by HalfBloodPrince(RIONTECH)
 * Riontech on 21/8/17.
 */

class ListViewAdapter extends BaseAdapter {

    private static final String TAG = "456";
    Context context;
    String[] Topic;
    MainActivity activity;

    public ListViewAdapter(MainActivity context, String[] topic) {
        this.context = context;
        activity = context;
        Topic = topic;


    }

    @Override

    public int getCount() {
        return Topic.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        TextView txttopic = null;
        convertView = LayoutInflater.from(activity).inflate(R.layout.listitem, parent, false);
        txttopic = (TextView) convertView.findViewById(R.id.itemlist);
        txttopic.setTag(position);
//        txttopic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onClick: ");
//                int position = (int) v.getTag();
//                if (position == 0) {
//                    Intent intent = new Intent(context, Introduction.class);
//                    context.startActivity(intent);
//                } else if (position == 1) {
//                    Intent intent = new Intent(context, OppsConceptSort.class);
//                    context.startActivity(intent);
//                }
//            }
//        });
        txttopic.setText(Topic[position]);
        return convertView;

    }
}