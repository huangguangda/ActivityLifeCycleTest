package cn.edu.gdmec.android.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//onCreate(),onStart(),onResume(),onPause(),onStop(),onDestroy()
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
}
