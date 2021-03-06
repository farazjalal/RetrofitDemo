package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import Api.taskspinnerAPI.taskListData;
import comk.example.admin.navgathi.R;


/**
 * Created by JoJo on 22-11-2016.
 */
public class Production_tasklistAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context con;
    Production_tasklistAdapter.AtmHolder pvh1;
    List<taskListData> serviceslist;

    public Production_tasklistAdapter(List<taskListData> serviceslist, Context con) {
        this.serviceslist = serviceslist;
        this.con = con;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        RecyclerView.ViewHolder viewHolder = null;
        if (position == 0) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_style, viewGroup, false);
            viewHolder = new ListAdapter.AtmHolder(v);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof ListAdapter.AtmHolder) {

            pvh1 = (Production_tasklistAdapter.AtmHolder) holder;
//            if(serviceslist.get(position).getType().equals("steel")) {
            pvh1.tv_task.setText(serviceslist.get(position).getTask());
            pvh1.tv_type.setText(serviceslist.get(position).getType());
            // pvh1.im.setImageDrawable(Drawable.createFromPath(serviceslist.get(position).getImage()));
            pvh1.tv_category.setText(serviceslist.get(position).getCategory());

//            }

        }
    }


    public int getItemViewType(int position) {
        int a = 0;
        return a;
    }

    @Override
    public int getItemCount() {
        return serviceslist.size();
    }

    public static class AtmHolder extends RecyclerView.ViewHolder {
        TextView tv_task,tv_type,tv_category;


        AtmHolder(View itemView) {
            super(itemView);

            tv_task = (TextView) itemView.findViewById(R.id.textView);
            tv_type = (TextView) itemView.findViewById(R.id.textView1);
            tv_category= (TextView) itemView.findViewById(R.id.textView2);

        }
    }
}

