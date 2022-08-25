package regexteam.product.servicetest

import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.core.app.JobIntentService
import java.util.*
import kotlin.concurrent.timerTask


class MyJobIntentService: JobIntentService(){
    override fun onHandleWork(intent: Intent) {

    }

    var counter = 0
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {


        val timer= Timer()
        timer.schedule(timerTask {
            Log.e("test", "JobIntentService is working for $counter seconds: ", )
            counter+=1
        },0,1000)
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("test", "JobIntentService onDestroy", )
    }
}