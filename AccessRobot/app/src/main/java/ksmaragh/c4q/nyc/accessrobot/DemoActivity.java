package ksmaragh.c4q.nyc.accessrobot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import net.steamcrafted.materialiconlib.MaterialIconView;

import at.markushi.ui.CircleButton;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoActivity extends AppCompatActivity {

    @Bind(R.id.btn_connect)
    CircleButton btnConnect;
    @Bind(R.id.btn_move_backward)
    MaterialIconView btnMoveBackward;
    @Bind(R.id.btn_move_forward)
    MaterialIconView btnMoveForward;
    @Bind(R.id.btn_move_left)
    MaterialIconView btnMoveLeft;
    @Bind(R.id.btn_move_right)
    MaterialIconView btnMoveRight;
    @Bind(R.id.btn_light_left)
    MaterialIconView btnLightLeft;
    @Bind(R.id.btn_light_right)
    MaterialIconView btnLightRight;
    @Bind(R.id.btn_look_cute)
    MaterialIconView btnLookCute;
    @Bind(R.id.btn_stop)
    MaterialIconView btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_connect)
    public void connectRobot() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_move_backward)
    public void moveBackward() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_move_forward)
    public void moveForward() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_move_left)
    public void moveLeft() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_move_right)
    public void moveRight() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_light_left)
    public void lightLeft() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_light_right)
    public void lightRight() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_look_cute)
    public void lookCute() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_stop)
    public void stop() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_code:
//                Intent settings = new Intent(this, Code.class);
//                startActivity(settings);
                break;
            case R.id.action_settings:
//                Intent settings = new Intent(this, Settings.class);
//                startActivity(settings);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}