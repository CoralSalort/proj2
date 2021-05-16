public class Stack
{
	static Card stack[];
	static int top;
	static int capacity;

	// Constructor to initialize stack
	Stack(int size)
	{
		stack = new Card[size];
		capacity = size;
		top = -1;
    }

    // Devuelve TRUE si esta vacio, FALSE si no
    public static Boolean isEmpty(){

        if(top == -1){
            System.out.println("Empty stack");
            return true;
        }

        return false;
    }

    // Determina si el stack esta lleno.
    // Devuelve TRUE si esta lleno
    // De lo contrario, devuelve FALSE
    public static boolean Full(){
        return top == capacity;
    }

    // Devuelve el indice del top del stack
    public static int Size(){
        return top;
    }
    
    // Anade una carta al top del stack. Si esta lleno, devuelve error.
    public static void Push(Card c){

        if(Full()){
            System.out.println("Stack is full. Can't insert.");  
        }

        stack[++top] = c;
    }

    // Saca carta del top del stack. Si esta vacio, devuelve error.
    public static Card Pop(){

        if(isEmpty()){
            System.out.println("Stack is empty, can't remove.");  
        }
        
        return stack[top--];
    }


    // Mira contenido de la carta del tope sin sacarla.
    // Da error si se trata de Peek un stack vacio.
    public static Card Peek(){

        if(isEmpty()){
            System.out.println("Trying to peek from empty stack.");   
        }
        
        return stack[top];
    }

}