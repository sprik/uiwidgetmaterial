package it.sprik.uiwidgetmaterialdesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter mAdapter;

    private List<ObjectAdapter> objectAdapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);

        // improve performance if you know that changes in content
        // do not change the size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        objectAdapters = new ArrayList<ObjectAdapter>();
        objectAdapters.add(new ObjectAdapter("Title 1", "Description 1"));
        objectAdapters.add(new ObjectAdapter("Title 2", "Description 2"));
        objectAdapters.add(new ObjectAdapter("Title 3", "Description 3"));

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(objectAdapters, R.layout.basic_layout);
        mRecyclerView.setAdapter(mAdapter);
    }

}
