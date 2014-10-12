package it.sprik.uiwidgetmaterialdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCard(View view) {
        startActivity(new Intent(this, CardViewActivity.class));
    }

    public void onClickRecy(View view) {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

    public void onClickBoth(View view) {
        startActivity(new Intent(this, BothActivity.class));
    }
}
