import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int totalBill = 0;

        
        int dosaPrice = 50;
        int samosaPrice = 20;
        int idliPrice = 30;
        int wadaPavPrice = 20;
        int dalBaatiPrice = 50;
        int noodlesPrice = 30;
        int manchurianPrice = 30;
        int pizzaPrice = 70;
        int coldcoffeePrice = 50;
        
        


        System.out.println("Food Menu:");
        System.out.println("1. Dosa - Rs.50");
        System.out.println("2. Samosa - Rs.20");
        System.out.println("3. Idli - Rs.30");
        System.out.println("4. WadaPav - Rs.20");
        System.out.println("5. Dalbaati - Rs.50");
        System.out.println("6. Noodles - Rs.30");
        System.out.println("7. Manchurian - Rs.30");
        System.out.println("8. Pizza - Rs.70");
        System.out.println("9. Cold coffee - Rs.50");
        System.out.println("10. Generate Bill");

        
        while (true) {
            System.out.print("\nEnter your choice (1-9 for items, 10 to generate bill): ");
            choice = scanner.nextInt();

            if (choice == 10) {

                break;
            }

            
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            
            switch (choice) {
                case 1:
                	
                	
                    totalBill += dosaPrice * quantity;
                    break;
                case 2:
                    totalBill += samosaPrice * quantity;
                    break;
                case 3:
                    totalBill += idliPrice * quantity;
                    break;
                case 4:
                    totalBill += wadaPavPrice * quantity;
                    break;
                case 5:
                    totalBill += dalBaatiPrice * quantity;
                    break;
                case 6:
                    totalBill += noodlesPrice * quantity;
                    break;
                case 7:
                    totalBill += manchurianPrice * quantity;
                    break;
                case 8:
                    totalBill += pizzaPrice * quantity;
                    break;
                case 9:
                    totalBill += coldcoffeePrice * quantity;
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
                    break;
            }
        }

        
        System.out.println("\nTotal Bill: Rs." + totalBill);
        scanner.close();
    }
}