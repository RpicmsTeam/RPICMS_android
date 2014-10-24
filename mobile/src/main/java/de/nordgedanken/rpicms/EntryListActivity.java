package de.nordgedanken.rpicms;

/**
 * Created by frank on 14.10.14.
 */
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Activity for holding EntryListFragment.
 */
public class EntryListActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_list);
    }
}
