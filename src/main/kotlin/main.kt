import java.util.concurrent.Semaphore



    fun main(args: Array<String>) {
        println("Hello World!")
        val semaphore = Semaphore(1)
        val counter = Counter()
        Thread(EditCount("Th 1",semaphore,counter)).start()
        Thread(EditCount("Th 2",semaphore,counter)).start()
        Thread(EditCount("Th 3",semaphore,counter)).start()
        Thread(EditCount("Th 4",semaphore,counter)).start()
        Thread(EditCount("Th 5",semaphore,counter)).start()
        Thread(EditCount("Th 6",semaphore,counter)).start()
        Thread(EditCount("Th 7",semaphore,counter)).start()


    }


