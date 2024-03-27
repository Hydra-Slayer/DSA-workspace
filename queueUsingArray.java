import java.util.Scanner;

public class queueUsingArray{  
  /* Member variable declaration */  
  private int maxSize;  
  private int[] queueArray;  
  private int front;  
  private int rear;  
  private int currentSize;  
  /* Constructor */  
  public queueUsingArray(int size){  
    this.maxSize = size;  
    this.queueArray = new int[size];  
    front = 0;  
    rear = -1;  
    currentSize = 0;  
  }
  /* Queue:Insert Operation */  
  public void insert(int item){  
    /* Checks whether the queue is full or not */  
    if(isQueueFull()){  
      System.out.println("Queue is full!");  
      return;  
    }  
    if(rear == maxSize - 1){  
      rear = -1;  
    }  
    /* increment rear then insert element to queue */  
    queueArray[++rear] = item;  
    currentSize++;  
    System.out.println("Item added to queue: " + item);  
  }  
  /* Queue:Delete Operation */    
  public int delete(){  
    /* Checks whether the queue is empty or not */  
    if(isQueueEmpty())  {  
      throw new RuntimeException("Queue is empty");  
    }  
    /* retrieve queue element then increment */  
    int temp = queueArray[front++];  
    if(front == maxSize){  
      front = 0;  
    }  
    currentSize--;  
    return temp;  
  }  
  /* Queue:Peek Operation */      
  public int peek(){  
    return queueArray[front];  
  }  
  /* Queue:isFull Operation */   
  public boolean isQueueFull(){  
    return (maxSize == currentSize);  
  }      
  /* Queue:isEmpty Operation */   
  public boolean isQueueEmpty(){  
    return (currentSize == 0);  
  }  
  /* Driver Code */  
  public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    int sz = sc.nextInt(); 
    queueUsingArray queue = new queueUsingArray(sz);  
    queue.insert(3);
    queue.insert(5);    
    queue.insert(7);
    queue.peek();
  }
}