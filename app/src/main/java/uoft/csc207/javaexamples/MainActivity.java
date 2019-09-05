package uoft.csc207.javaexamples;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    /**
     * The title of the app.
     */
    private static final String TAG = "Java Examples";

    /** The spinner menu items. */
    public final static String WHILE_EXAMPLE = "While loop example";
    public final static String FOR_EXAMPLE = "For loop example";
    public final static String ARRAY_EXAMPLE = "String array example";
    public final static String OBJECT_EXAMPLE = "Object example";

    /**
     * The list of choices for the spinner that allows the user to choose which
     * Java feature to demonstrate.
     */
    private final String[] whatToDo = {WHILE_EXAMPLE, FOR_EXAMPLE, ARRAY_EXAMPLE, OBJECT_EXAMPLE};

    /**
     * The examples to choose from.
     */
    private JavaExamples examples = new JavaExamples();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the whatToDo spinner.
        Spinner spinner = (Spinner) findViewById(R.id.javaSpinner);
        ArrayAdapter adapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, whatToDo);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    /**
     * Do an example of Java based on user selection.
     *
     * @param view
     */
    public void doJavaExamples(View view) {
        EditText outputText = (EditText) findViewById(R.id.outputText);
        Spinner spinner = (Spinner) findViewById(R.id.javaSpinner);
        String choice = spinner.getSelectedItem().toString();
        String result = examples.doJavaExamples(choice);
        outputText.setText(result);
    }

}
