package regexteam.product.servicetest

import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.IBinder
import android.util.Log
import java.io.FileDescriptor
import java.io.PrintWriter
import java.util.*
import kotlin.concurrent.timerTask

class MyService: Service(){
    override fun onBind(p0: Intent?): IBinder? = null
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
    }


    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
    }
    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        super.onTaskRemoved(rootIntent)
    }

    override fun dump(fd: FileDescriptor?, writer: PrintWriter?, args: Array<out String>?) {
        super.dump(fd, writer, args)
    }

    var counter = 0
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val timer= Timer()
        timer.schedule(timerTask {
            Log.e("test", "MyService is working for $counter seconds: ", )
            counter+=1
        },0,1000)

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("test", "Service onDestroy: ", )
    }


}