import javax.swing.JOptionPane;
class Assignment6_2 {
  public static void main(String[] args) {
        String radiusinput = JOptionPane.showInputDialog("Enter the radius of a cylinder:");
        double radius = Float.parseFloat(radiusinput);
        String lenghtinput = JOptionPane.showInputDialog("Enter the radius of a lenght:");
        double lenght = Float.parseFloat(lenghtinput);
        double area = radius * radius * 3.14;
        double volume = area * lenght;
        JOptionPane.showMessageDialog(null,"The area is " + area);
        JOptionPane.showMessageDialog(null,"The volume of the cylinder is " + volume); 
  }
}