import java.util.*;
class StackusingArray{
	static Scanner sc=new Scanner(System.in);
	static int size=sc.nextInt();
	static int s[]=new int[size];
	static int top=-1;
	
	public static void main(String[] args){
		System.out.println("How many time you want to push an element in Stack");
		int n=sc.nextInt();
		for (int i=0;i<n;i++){
			push(sc.nextInt());
		}
		pop();
		pop();
		pop();
		//System.out.println("pop:-     "+pop());
		System.out.println("stackTop:-     "+stackTop());
		System.out.println("peek element:-  ");
		System.out.println("peek:-     "+peek(sc.nextInt()));
		display();
	}
	public static void push(int x){
		if (isFull()){
			System.out.println("Stack in OverFlow Condition");
		}else{
			top++;
			s[top]=x;
		}
	}
	public static int pop(){
		int x=-1;
		if (isEmpty()){
			System.out.println("Stack in UnderFlow Condition");
		}else{
			x=s[top];
			top--;
		}
		return x;
	}
	public static void display(){
		System.out.println("Display");
		for(int i=top;i>=0;i--)
			System.out.println(s[i]);
	}
	public static int peek(int pos){
		if ((top-pos+1)<0){
			System.out.println("Please Enter Valid Postion");
				return -1;
		}else
			return s[top-pos+1];
	}
	public static int stackTop(){
		if (top==-1)
			return -1;
		else
			return s[top];
	}
	static boolean isFull(){
		if (top==size-1)
			return true;
		else
			return false;
	}
	static boolean isEmpty(){
		if(top==-1)
			return true;
		else
			return false;
	}
}