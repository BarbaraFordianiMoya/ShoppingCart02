public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "two thirts";
        String message = custName+" wants to purchase "+itemDesc;
       
        // Declare and initialize numeric fields: price, tax, quantity. 
         int quantidade = 2;
        double preço = 10.00*quantidade;
        double imposto = 5.78;
        
        
        // Declare and assign a calculated totalPrice
        String finalMessage = "O custo final é de: $" + (preço + imposto);
        
        // Modify message to include quantity 
        
        System.out.println(message);
        System.out.println(finalMessage);
        // Print another message with the total cost
        
    }    
}
