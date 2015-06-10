package juanlulp.portfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity { //Deprecated ActionBarActivity (Default)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button spotify_stremer = (Button) findViewById(R.id.button);
        Button scores_app = (Button) findViewById(R.id.button2);
        Button library_app = (Button) findViewById(R.id.button3);
        Button build_it_together = (Button) findViewById(R.id.button4);
        Button bacon_reader = (Button) findViewById(R.id.button5);
        Button my_own_app = (Button) findViewById(R.id.button6);


        spotify_stremer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my spotify app!" , Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        scores_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my scores app!" , Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        library_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my library app!" , Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        build_it_together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my build_it_together app!" , Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        bacon_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my bacon_reader app!" , Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        my_own_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my own app!" , Toast.LENGTH_SHORT);
                toast.show();
            }
        });


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
