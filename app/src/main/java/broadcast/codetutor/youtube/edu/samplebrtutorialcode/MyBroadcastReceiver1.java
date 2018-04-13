package broadcast.codetutor.youtube.edu.samplebrtutorialcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


/**
 * Created by elsalti on 2018-04-09.
 */

public class MyBroadcastReceiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Broadcast Receiver is Triggered", Toast.LENGTH_SHORT).show();

    }
}