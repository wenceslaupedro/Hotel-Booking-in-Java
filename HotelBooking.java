import javax.swing.JOptionPane;

public class HotelBooking {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name:");

        int nights = Integer.parseInt(JOptionPane.showInputDialog("Enter the required number of nights:"));

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

        double totalCost = nights * 90;
        
        if(age >= 18){
            JOptionPane.showMessageDialog(null, "Booking confirmed for " +name+ ". Total cost is " +totalCost+ " euro for " +nights+ " nights in our lovely Hotel. See you soon!");          
        }

        else if(age < 18){
            JOptionPane.showMessageDialog(null, "Sorry, but you must be at least 18 years old to book a hotel room.");
            
        }     
  
    }
}
