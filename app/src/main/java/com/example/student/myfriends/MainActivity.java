package com.example.student.myfriends;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import static android.view.View.OnClickListener;
import static com.example.student.myfriends.R.id.action_about;
import static com.example.student.myfriends.R.id.action_help;

public class MainActivity extends ActionBarActivity {

    private EditText myEditText;
    private Button searchDatabaseButton;
    private String database;
    private MyDBHandler dbHandler;
    private ListView listView;

    private List<Friend> friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDatabase();
        getFriends();

/*
        myEditText = (EditText) findViewById(R.id.editText);

        searchDatabaseButton = (Button)findViewById(R.id.searchButton);

        searchDatabaseButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                database = myEditText.getText().toString();
                setDatabase();
                getFriends();
                populateListView();
            }
        });
  */

    }

    public void setDatabase(){
        dbHandler = new MyDBHandler(this, null, null, 1);
        listView = (ListView) findViewById(R.id.listView);
       // dbHandler.setDatabaseName(database);

    }

    public void getFriends(){
        friends = dbHandler.getAllFriends();

        List<String> names = null;

        for(Friend t:friends){
            names.add(t.get_name());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        listView.setAdapter(arrayAdapter);



        if(friends != null )
        for(Friend f : friends){
            TextView t = (TextView)findViewById(R.id.textView3);
            t.setText(f.get_name());
        }
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

        switch (id){
            case action_about:
                Intent intentAbout = new Intent(this, AboutActivity.class);
                startActivity(intentAbout);
                return true;
            case action_help:
                Intent intentHelp = new Intent(this, HelpActivity.class);
                startActivity(intentHelp);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
