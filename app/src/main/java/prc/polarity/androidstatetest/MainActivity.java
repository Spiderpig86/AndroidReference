package prc.polarity.androidstatetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

// This app tests for app state calls.
// Sequence: onCreate --> onStart --> onResume --> onStop --> onDestroy

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "apptest";
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView); // Will give mTextView a reference to the textview in the app.
        Log.i(TAG, "onCreate called");
        mTextView.append("onCreate called");
    }

    @Override
    public void onStart() { // Runs when the app first starts.
        super.onStart();
    }

    @Override
    public void onResume() { // Runs when the activity comes into view (foreground) again.
        super.onResume();
    }

    @Override
    public void onPause() {  // Runs when a different activity comes into view.
        super.onPause();
    }

    @Override
    protected void onStop() { // Runs when this activity becomes invisible.
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onDestroy() { // Runs when the activity is about to fully close.
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
