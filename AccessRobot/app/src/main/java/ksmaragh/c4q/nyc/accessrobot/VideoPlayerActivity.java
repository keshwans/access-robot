package ksmaragh.c4q.nyc.accessrobot;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    private static final String TAG = VideoPlayerActivity.class.getSimpleName();

    VideoView videoView = null;

    private void playMp4OnMediaView() {
        String videoUrl = "http://html5demos.com/assets/dizzy.mp4";
        Uri videoUri = Uri.parse(videoUrl);
        videoView.setVideoURI(videoUri);
//
//        //2a) optional but good:
//        //Use a media controller so that you can scroll the video contents
//        //and also to pause, start the video.

//        MediaController mediaController = new MediaController(VideoPlayerActivity.this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);

        // 2b) prep the video and then set the controller, so you can position controls


        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                /*
                 * add media controller
                 */
                        MediaController mediaController = new MediaController(VideoPlayerActivity.this);
                        mediaController.setAnchorView(videoView);
                        videoView.setMediaController(mediaController);
                        mediaController.setAnchorView(videoView);
                    }
                });
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        videoView = (VideoView) findViewById(R.id.video_view);
        playMp4OnMediaView();

    }

    @Override
    protected void onResume() {
        super.onResume();
        videoView.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        videoView.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (videoView.isPlaying()) {
            videoView.stopPlayback();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_video_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
