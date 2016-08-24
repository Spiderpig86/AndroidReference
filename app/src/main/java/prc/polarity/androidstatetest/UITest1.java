package prc.polarity.androidstatetest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by Stan on 8/24/2016.
 * The point of this class is to demonstrate that UI elements can be added to the activity
 * programatically.
 */
public class UITest1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Init Layout
        RelativeLayout layout = new RelativeLayout(this); // Instantiates a new layout object.
        layout.setBackgroundColor(Color.BLUE);

        RelativeLayout.LayoutParams buttonLayout = new RelativeLayout.LayoutParams( // Pass in height and width of the container.
                RelativeLayout.LayoutParams.WRAP_CONTENT, // WRAP_CONTENT automatically gets the height and width of the activity
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonLayout.addRule(RelativeLayout.CENTER_HORIZONTAL); // Center the button in the middle of the view.
        buttonLayout.addRule(RelativeLayout.CENTER_VERTICAL);

        // Create the button
        Button button = new Button(this);
        button.setText("Click me");
        button.setBackgroundColor(Color.WHITE);

        // Add the button to the layout we just created
        layout.addView(button, buttonLayout); // Second param specifies how the button should be positioned.

        // Set the layout we created to display on the view.
        setContentView(layout); // Instead of setContentView(R.layout.activity_main) or some other layout you created.
    }
}
