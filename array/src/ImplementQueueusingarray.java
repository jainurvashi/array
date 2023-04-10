public class ImplementQueueusingarray {
    int front, rear;
    int arr[] = new int[100005];

    ImplementQueueusingarray()
    {
        front=0;
        rear=0;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        arr[rear] = x;
        rear++;
    }

    //Function to pop an element from queue and return that element.
    int pop()
    {
        if(front>=rear)return -1;
        int ans = arr[front];
        front++;
        return ans;
    }
}
