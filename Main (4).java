public class Main{
    public static void main(String[] args) {
       toNumber toNumbers = new toNumber("2720", "18429.2459", "4258");
       System.out.printf("The total value = %,.2f \n", toNumbers.getTotal());
       
       valueToString valueToString = new valueToString(toNumbers);
       System.out.println("The converstion of number to string brings " + valueToString.getResult());
    
        reverseString reverseString = new reverseString("Hello World");
        System.out.println("the reverse string is " + reverseString.getReversed());
    }
    
    //class Converting a string to a number
    public static class toNumber{
        private String firstValue;
        private String secondValue;
        private String thirdValue;
        private int a; 
        private double b; 
        private int c; 
        private double total;
        
        // consturctor with parameters
        public toNumber(String firstValue, String secondValue, String thirdValue){
            this.firstValue = firstValue; 
            this.secondValue = secondValue;
            this.thirdValue = thirdValue;
            
            
             // converstion to a numbers
        this.a = Integer.valueOf(firstValue);
        this.b = Double.valueOf(secondValue);
        this.c = Integer.valueOf(thirdValue);
        
        this.total = a + b +c;
        // System.out.println(total);
        }
        
        // setting the getter
        public double getTotal(){
            return total;
        }
        
        public int geta(){
            return a;
        }
        
         public double getb(){
            return b;
        }
        
         public int getc(){
            return c;
        }
    }
    // class to convert number to a string
    public static class valueToString{
        private String NewA;
        private String NewB;
        private String NewC;
        private String result;
        
         // Constructor that accepts a toNumber instance
        public valueToString (toNumber number){
        this.NewA = String.valueOf(number.geta());
        this.NewB = String.valueOf(number.getb());
        this.NewC = String.valueOf(number.getc());
        this. result = NewA + NewB + NewC;
        }
       
       public String getResult(){
           return result;
       }
        
    }
    
    public static class reverseString{
        public String word; 
        
        
        public reverseString (String word) {
            this.word = word;
        } 
        
        public String getReversed(){
            StringBuilder reversed = new StringBuilder(word);
                return reversed.reverse().toString();
            
        }
    }
}
