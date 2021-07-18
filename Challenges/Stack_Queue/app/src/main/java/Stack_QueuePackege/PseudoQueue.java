package Stack_QueuePackege;
public class PseudoQueue<T> {
    private Stack stack1 ;
    private Stack stack2 ;
    public PseudoQueue(){
        this.stack1 = new Stack() ;
        this.stack2 = new Stack() ;
    }
    public void enqueue(T data){
        this.stack1.push(data);
    }
    public T dequeue(){
        if (this.stack1.isEmpty()) return (T)"Exception";
        while (!this.stack1.isEmpty()){
            this.stack2.push(this.stack1.peek());
            this.stack1.pop();
        }
        T returnData = (T)this.stack2.pop();
        while (!this.stack2.isEmpty()){
            this.stack1.push(this.stack2.peek());
            this.stack2.pop() ;

        }
        return returnData;
    }
    public void tostring() {
        this.stack1.tostring();
    }
}