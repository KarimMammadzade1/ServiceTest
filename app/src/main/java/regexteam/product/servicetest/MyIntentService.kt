package regexteam.product.servicetest

import android.app.IntentService
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.util.*
import kotlin.concurrent.timerTask

class MyIntentService:IntentService("MyIntentService"){
    override fun onCreate() {
        super.onCreate()
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
    }
    var counter = 0
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val timer= Timer()
        timer.schedule(timerTask {
            Log.e("test", "IntentService is working for $counter seconds: ", )
            counter+=1
        },0,1000)

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("test", "IntentService onDestroy: ", )
    }

    override fun onBind(intent: Intent?): IBinder? {
        return super.onBind(intent)
    }

    override fun setIntentRedelivery(enabled: Boolean) {
        super.setIntentRedelivery(enabled)
    }

    override fun onHandleIntent(p0: Intent?) {
        Log.e("test", "IntentService onHandleIntent triggered: ", )
    }
}