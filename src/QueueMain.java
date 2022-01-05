import java.util.Queue;

public class QueueMain
    {
        public static void main(String[] args) {
            Queues  q = new Queues();

            q.enqueue(56);
            q.enqueue(30);
            q.enqueue(70);
            q.displayQueue();

            q.dequeue();
            q.displayQueue();
        }
    }
