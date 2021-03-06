package com.example.yifei_w.chihuo;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantGridFragment extends Fragment {

    GridView gridView;
//    OnItemSelectListener mCallback;
    public RestaurantGridFragment() {
        // Required empty public constructor
    }
//    public interface OnItemSelectListener {
//        public void onGridItemSelected(int position);
//    }
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        try {
//            mCallback = (OnItemSelectListener) context;
//        } catch (ClassCastException e) {
//            //do something
//        }
//    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_grid, container, false);
        gridView = (GridView) view.findViewById(R.id.restaurant_grid);
       // gridView.setAdapter(new RestaurantAdapter(getActivity()));

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                mCallback.onGirdItemSelected(i);
//                }
//        });
        return view;
    }
    public void onGirdItemSelected(int position){
        for (int i = 0; i < gridView.getChildCount(); i++){
            if (position == i) {
                gridView.getChildAt(i).setBackgroundColor(Color.BLUE);
            } else {
                gridView.getChildAt(i).setBackgroundColor(Color.parseColor("#EEEEEE"));
            }
        }
    }
}
