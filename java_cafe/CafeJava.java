public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        
        double mochaPrice = 3.5;
        double latte = 5;
        double cappuccino = 10;
        double coffee = 3;
        double numberOflattes = 2;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        System.out.println(generalGreeting + customer1 +coffee);

        if(isReadyOrder4){
            System.out.println(readyMessage);
        }
        else{
             System.out.println(pendingMessage);
        }


         double total = numberOflattes * latte;
        System.out.println(displayTotalMessage + total);
        
        if (isReady3) {
            System.out.println( customer2+pendingMessage);
        } else {
            System.out.println(customer2+readyMessage);
        }

        double newtotal = latte - coffee;
        System.out.println(displayTotalMessage + newtotaltotal);
        
    }
}

