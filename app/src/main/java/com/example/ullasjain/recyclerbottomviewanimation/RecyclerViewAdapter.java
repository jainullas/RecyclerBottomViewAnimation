package com.example.ullasjain.recyclerbottomviewanimation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by UllasJain on 06/07/17.
 */

class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<String> countryNames;
    private Context context;

    public RecyclerViewAdapter(List<String> countryNames, Context context) {
        this.countryNames = countryNames;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(countryNames.get(position));
    }

    @Override
    public int getItemCount() {
        return countryNames.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView countryName;

        ViewHolder(View itemView) {
            super(itemView);
            countryName = (TextView) itemView.findViewById(R.id.country_name);
        }

        void bind(String name){
            countryName.setText(name);
        }
    }
}
