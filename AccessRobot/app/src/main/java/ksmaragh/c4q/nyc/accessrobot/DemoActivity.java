package ksmaragh.c4q.nyc.accessrobot;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Toast;

import net.steamcrafted.materialiconlib.MaterialIconView;

import at.markushi.ui.CircleButton;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import tourguide.tourguide.Overlay;
import tourguide.tourguide.Pointer;
import tourguide.tourguide.ToolTip;
import tourguide.tourguide.TourGuide;

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

    public TourGuide tutorialHandler;
    Animation enterAnimation;
    Animation exitAnimation;

    boolean tutorialMode = true; // TODO: SharedPreferences

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        ButterKnife.bind(this);

        // On first run, launch the tutorial.
        setupEnterExitAnis();
        initTourGuide();
        tutorialHandler.playOn(btnConnect);
    }

    private void initTourGuide() {
        // initialize TourGuide without playOn()
        tutorialHandler = TourGuide.init(this).with(TourGuide.Technique.Click)
                .setPointer(new Pointer())
                .setToolTip(new ToolTip()
                        .setTitle("Connect!")
                        .setDescription("This lets the robot to listen to commands.")
                        .setBackgroundColor(Color.parseColor("#78909C"))
                        .setGravity(Gravity.CENTER_HORIZONTAL))
                .setOverlay(new Overlay().setEnterAnimation(enterAnimation).setExitAnimation(exitAnimation));
    }

    private void setupEnterExitAnis() {
        enterAnimation = new AlphaAnimation(0f, 1f);
        enterAnimation.setDuration(600);
        enterAnimation.setFillAfter(true);

        exitAnimation = new AlphaAnimation(1f, 0f);
        exitAnimation.setDuration(600);
        exitAnimation.setFillAfter(true);
    }

    @OnClick(R.id.btn_connect)
    public void connectRobot() {
        if (tutorialMode) {
            tutorialHandler.cleanUp();
            tutorialHandler.setToolTip(new ToolTip()
                    .setTitle("Move forward!")
                    .setDescription("You can also move left, right, and backward.")
                    .setBackgroundColor(Color.parseColor("#78909C"))
                    .setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL))
                    .playOn(btnMoveForward);
        } else {
            Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_move_backward)
    public void moveBackward() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_move_forward)
    public void moveForward() {
        if (tutorialMode) {
            tutorialHandler.cleanUp();
            tutorialHandler.setToolTip(new ToolTip()
                    .setTitle("Stop!")
                    .setDescription("Tap here to stop moving.")
                    .setBackgroundColor(Color.parseColor("#78909C"))
                    .setGravity(Gravity.TOP | Gravity.LEFT))
                    .playOn(btnStop);
        } else {
            Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
        }
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
        if (tutorialMode) {
            tutorialHandler.cleanUp();
            tutorialHandler.setToolTip(new ToolTip()
                    .setTitle("Look cute!")
                    .setDescription("?!")
                    .setBackgroundColor(Color.parseColor("#78909C"))
                    .setGravity(Gravity.TOP | Gravity.RIGHT))
                    .playOn(btnLookCute);
        } else {
            Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_light_right)
    public void lightRight() {
        Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_look_cute)
    public void lookCute() {
        if (tutorialMode) {
            tutorialHandler.cleanUp();
            tutorialMode = false;
        } else {
            Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_stop)
    public void stopMoving() {
        if (tutorialMode) {
            tutorialHandler.cleanUp();
            tutorialHandler.setToolTip(new ToolTip()
                    .setTitle("Light it up!")
                    .setDescription("You can blink left and right LEDs.")
                    .setBackgroundColor(Color.parseColor("#78909C"))
                    .setGravity(Gravity.TOP | Gravity.RIGHT))
                    .playOn(btnLightLeft);
        } else {
            Toast.makeText(this, "Beep boop!", Toast.LENGTH_SHORT).show();
        }
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
                Intent code = new Intent(this, Code.class);
                startActivity(code);
                break;
            case R.id.action_settings:
//                Intent settings = new Intent(this, Settings.class);
//                startActivity(settings);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}