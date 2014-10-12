package it.sprik.uiwidgetmaterialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sprik on 11/10/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ListItemViewHolder> {
    private List<ObjectAdapter> objectAdapters;
    private int base_layout;

    // Provide a reference to the type of views that you are using
    // (custom viewholder)
    public static class ListItemViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;
        public TextView txtDesc;

        public ListItemViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txtinfo);
            txtDesc = (TextView) itemView.findViewById(R.id.txtinfoextra);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<ObjectAdapter> objectAdapters, int base_layout) {
        this.objectAdapters = objectAdapters;
        this.base_layout = base_layout;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(base_layout, parent, false);
        return new ListItemViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ListItemViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.txtTitle.setText(objectAdapters.get(position).title);
        holder.txtDesc.setText(objectAdapters.get(position).desc);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return objectAdapters.size();
    }
}

