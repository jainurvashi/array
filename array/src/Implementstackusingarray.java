public class Implementstackusingarray {
    int top;
    int arr[] = new int[100000];

    Implementstackusingarray()
    {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a)
    {
        top++;
        arr[top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        if(top<0)return -1;
        int ans= arr[top];
        top--;
        return ans;

    }
}
