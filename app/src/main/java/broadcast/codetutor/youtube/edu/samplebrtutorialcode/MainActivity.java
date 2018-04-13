package broadcast.codetutor.youtube.edu.samplebrtutorialcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by anildeshpande on 12/09/16.
 */
public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver myBroadcastReceiver;
    private int MY_PERMISSION;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_activty);
        myBroadcastReceiver = new MyBroadcastReceiver1();

    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(myBroadcastReceiver, intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myBroadcastReceiver);
    }
}
