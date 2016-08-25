package prc.polarity.androidstatetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventHandlingTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling_test);

        Button centerButton = (Button) findViewById(R.id.centerButton); // Find the button in the view and cast it to a button.
        centerButton.setOnClickListener(
                new Button.OnClickListener() { // Waits for button to be clicked.
                    @Override
                    public void onClick(View view) {
                        TextView centerText = (TextView) findViewById(R.id.centerText); // Gets the textview. Must be located within this interface.
                        double r = Math.random() * 10;
                        centerText.setText(Double.toString(r)); // Sets some random number to the textview.
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_handling_test, menu);
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
