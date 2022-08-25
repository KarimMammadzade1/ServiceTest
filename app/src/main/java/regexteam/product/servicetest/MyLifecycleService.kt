package regexteam.product.servicetest

import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleService
import java.util.*
import kotlin.concurrent.timerTask

class MyLifecycleService:LifecycleService(){
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
            Log.e("test", "LifecycleService is working for $counter seconds: ", )
            counter+=1
        },0,1000)
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("test", "LifecycleService ondestroy", )
    }

    override fun onBind(intent: Intent): IBinder? {
        return super.onBind(intent)
    }

    override fun getLifecycle(): Lifecycle {
        return super.getLifecycle()
    }
}