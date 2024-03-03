public class Switch {
    public static void main(String[] args) {
        char choice;
        System.out.println("Select your Choice:");
        System.out.println("M -> Madras");
        System.out.println("B -> Bombay");
        System.out.println("C -> calcutta ");
        System.out.print("Choice --->");
        try
        {
            switch (choice = (char) System.in.read()) 
            {
                case  'M':
                    System.out.println("Madras");
                break;
                case 'B':
                    System.out.println("Bombay");
                break;
                case 'c':
                    System.out.println("Calcultta");
                break;
            
            
                default:
                    System.out.println("INvalid choice");
                    
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}

