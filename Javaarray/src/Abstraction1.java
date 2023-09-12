
 abstract  class Abstraction {
    abstract void twowheeler();
    abstract void fourwheeler();
//    void disp()
//    {
//        System.out.println("hi");
//++-        }
    }
     class Abstraction1 extends Abstraction
    {
        void fourwheeler()
        {
            System.out.println(" level up the gear feel the vibe");
             
        }
        void twowheeler() {
            System.out.println(" level up the gear feel the vibeee");
        }
        public static void main(String[] args)
        {
        	Abstraction obj= new Abstraction1();
            obj.fourwheeler();
            obj.twowheeler();
            
        }
        
    }


