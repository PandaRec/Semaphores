import java.util.concurrent.Semaphore

class EditCount(val name:String, val sem:Semaphore,var counter:Counter):Runnable{
    override fun run() {
        sem.acquire()
        for(i in 0..10){
            counter.counter+=1
            println("$name counter = ${counter.counter}")
                //Thread.sleep(100)
        }

        sem.release()
    }

}

class Counter{
    var counter=0
}