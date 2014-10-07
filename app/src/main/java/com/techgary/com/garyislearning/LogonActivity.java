package com.techgary.com.garyislearning;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.techgary.com.business.Repository;
import com.techgary.com.httpclient.ApiHttpClientUsage;

import org.json.JSONException;


public class LogonActivity extends Activity {

    private EditText nameEditText;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);

        nameEditText = (EditText)findViewById(R.id.editText);
        goButton = (Button)findViewById(R.id.button);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameEditText.getText().length()==0){
                    Toast.makeText(getApplicationContext(), "Name cannot be empty.", Toast.LENGTH_SHORT).show();
                }else{
                    //TODO: go to next activity
                    Toast.makeText(getApplicationContext(), "Next page will be delivered soon.", Toast.LENGTH_SHORT).show();
                    //Log a test information
                    ApiHttpClientUsage testUsage = new ApiHttpClientUsage();
                    try{

                       Log.i("first item", testUsage.getProductsRaw().getCount()+"");
                    }catch(JSONException je){
                        je.printStackTrace();
                    }
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.logon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
