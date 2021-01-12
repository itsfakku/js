/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoqueue;

/**
 *
 * @author MINH TAM
 */
public class Queue 
{
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Queue() 
  {
    front = -1;
    rear = -1;
    //front = first
    //rear = current
  }

  boolean isFull() 
  {
    if (front == 0 && rear == SIZE - 1) 
    {
      return true;
    }
    else
    {
    return false;
    }
  }
  boolean isEmpty() 
  {
    if (front == -1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  //Insert elements to the queue
  void enQueue(int element) 
  {

    //If queue is full
    if (isFull()) 
    {
      System.out.println("Queue is already to run !");
    }
    else 
    {
      if (front == -1) 
      {
        front = 0; // mark front denote first element of queue
      }

      rear++;
      items[rear] = element;
      System.out.println("Insert " + element);
    }
  }

  //Delete
  int deQueue() 
  {
    int element;
    if (isEmpty()) 
    {
      System.out.println("Queue is empty !!!!");
      return (-1);
    }
    else 
    {
      element = items[front];
      if (front >= rear) 
      {
        front = -1;
        rear = -1;
      }
      else 
      {
        front++;
      }
      System.out.println("\nDeleted number : "+element);
      return (element);
    }
  }
  void display() 
  {
    int i;
    if (isEmpty()) 
    {
      System.out.println("Empty Queue");
    }
    else 
    {
      System.out.println("\nFront index : " + front);
      System.out.println("\nItems : ");
      for (i = front; i <= rear; i++)
      System.out.print(items[i] + "  ");
      System.out.println("\n\nRear index : " + rear);
    }
  }

  public static void main(String[] args) 
  {
    Queue q = new Queue();
    q.deQueue();
    
    for(int i=1;i<6;i++) 
    {
      q.enQueue(i);
    }
    
    q.enQueue(6);
    q.display();
    q.deQueue();
    q.display();
  }
}