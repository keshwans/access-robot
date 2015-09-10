package ksmaragh.c4q.nyc.accessrobot;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class VideoPlayerActivity extends AppCompatActivity {

    private static final String TAG = VideoPlayerActivity.class.getSimpleName();

    VideoView videoView = null;
    MediaPlayer mediaPlayer = null;

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
                    }
                });
            }
        });
    }

    private void playMp4OnSurfaceView() {
        String videoUrl = "http://html5demos.com/assets/dizzy.mp4";
        Uri videoUri = Uri.parse(videoUrl);
        mediaPlayer = MediaPlayer.create(this, videoUri);
        final SurfaceView sf = (SurfaceView) findViewById(R.id.surface_view);

        final SurfaceHolder surfaceHolder = sf.getHolder();
        //surfaceHolder.addCallback(this); requires implementing SurfaceHolder.Callback

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                surfaceHolder.setFixedSize(mp.getVideoWidth(), mp.getVideoHeight());
                mp.start();

                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        /*
                         * add media controller
                         */
                        MediaController mediaController = new MediaController(VideoPlayerActivity.this);
                        mediaController.setAnchorView(sf);
                        videoView.setMediaController(mediaController);

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
        playMp4OnSurfaceView();

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

        if (mediaPlayer != null) {
            mediaPlayer.stop();
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

    // implements SurfaceHolder.Callback
    // @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    // @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    // @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
