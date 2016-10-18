package lerning;

//Francisco Sanchez Enriquez    30 Days of Code < Generics        
  public class Lerning{  
      
        public static <E> void printArray(E[] numbers){
                for(E element : numbers){
                System.out.println(element);
                }
        }
     
    	public static void main(String[] args){   
          Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Lerning.class.getDeclaredMethods().length > 2){
        System.out.println("You should only have 1 method named printArray.");
        }
        
        
    }
}