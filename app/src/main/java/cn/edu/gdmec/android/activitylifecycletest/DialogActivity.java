package cn.edu.gdmec.android.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Jack on 2017/11/30.
 * 活动的启动模式
 * standard,singleTop,singleTask,singleInstance。
 * Log.d("FirstActivity",this.toString());
 * android:launchMode="singleTop"
 * android:launchMode="singleTask"
 * android:launchMode="singleInstance"
 *
 * Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
 * intent.putExtra("param1","data1");
 * intent.putExtra("param2","data2");
 * startActivity(intent);
 *
 * SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
 *
 */

public class DialogActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        requestWindowFeature ( Window.FEATURE_NO_TITLE );
        setContentView ( R.layout.dialog_layout );
    }
}
