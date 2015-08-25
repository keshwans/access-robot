package ksmaragh.c4q.nyc.accessrobot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class SettingsActivity extends AppCompatActivity {

    RadioGroup rgInterfaceType;
    RadioButton rbBluetooth;
    RadioButton rbSerialCable;

    SharedPreferencesHelper sharedPreferencesHelper;

    RadioGroup.OnCheckedChangeListener interfaceTypeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.radio_bluetooth:
                    Log.d("interface type", "bluetooth");
                    sharedPreferencesHelper.saveInterfaceType(AppConstants.INTERFACE_BLUETOOTH);
                    break;
                case R.id.radio_serial:
                    Log.d("interface type", "serial cable");
                    sharedPreferencesHelper.saveInterfaceType(AppConstants.INTERFACE_SERIAL_CABLE);
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        sharedPreferencesHelper = new SharedPreferencesHelper(this);

        rgInterfaceType = (RadioGroup) findViewById(R.id.interface_type);
        rgInterfaceType.setOnCheckedChangeListener(interfaceTypeListener);

        rbBluetooth = (RadioButton) findViewById(R.id.radio_bluetooth);
        rbSerialCable = (RadioButton) findViewById(R.id.radio_serial);

        initializeView();

    }

    protected void initializeView() {
        int interfaceType = sharedPreferencesHelper.getInterfaceType();
        if (interfaceType == AppConstants.INTERFACE_SERIAL_CABLE){
            rbSerialCable.setChecked(true);
        }
        else {
            rbBluetooth.setChecked(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
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
