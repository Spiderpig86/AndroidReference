package prc.polarity.androidstatetest;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
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

        // Create the button
        Button button = new Button(this);
        button.setText("Click me");
        button.setBackgroundColor(Color.WHITE);

        // Username
        EditText user = new EditText(this);

        // Assign ID to controls. These IDs help with easier access.
        button.setId(1);
        user.setId(2);

        // Button Layout
        RelativeLayout.LayoutParams buttonLayout = new RelativeLayout.LayoutParams( // Pass in height and width of the container.
                RelativeLayout.LayoutParams.WRAP_CONTENT, // WRAP_CONTENT automatically gets the height and width of the activity
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonLayout.addRule(RelativeLayout.CENTER_HORIZONTAL); // Center the button in the middle of the view.
        buttonLayout.addRule(RelativeLayout.CENTER_VERTICAL);

        // Username Layout
        RelativeLayout.LayoutParams userLayout = new RelativeLayout.LayoutParams( // Pass in height and width of the container.
                RelativeLayout.LayoutParams.WRAP_CONTENT, // WRAP_CONTENT automatically gets the height and width of the activity
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        userLayout.addRule(RelativeLayout.ABOVE, button.getId()); // This will put the username above the button.
        userLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userLayout.setMargins(0, 0, 0, 50); // Adds space between the username and the button.

        // Setting the width of the textfield. setWidth() accepts pixels, but doesn't take into account of density.
        Resources r = getResources(); // Gets information about app
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r.getDisplayMetrics() // Converts value from DIP to pixels (which take into account screen pixel density). (Type, width (px), display metrics) displayMetrics supply info about the screen
        );

        user.setWidth(px);

        // Add the button to the layout we just created
        layout.addView(button, buttonLayout); // Second param specifies how the button should be positioned.
        layout.addView(user, userLayout);

        // Set the layout we created to display on the view.
        setContentView(layout); // Instead of setContentView(R.layout.activity_main) or some other layout you created.
    }
}
