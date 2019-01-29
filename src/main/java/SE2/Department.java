package SE2;

public abstract class Department extends EmptyQueueException {
    private StringQueue queue = new StringQueue();


    public StringQueue getQueue() {
        return queue;
    }

    public abstract String getName();

    public void addMessage(String s) {
        queue.enqueue(s);
    }

    public String nextMessage() throws  EmptyQueueException{
        //
      if(queue.isEmpty()){
          throw new EmptyQueueException("Empty queue");
      }
      return  queue.dequeue();
    }

    public Department() {

    }

//implement
}
