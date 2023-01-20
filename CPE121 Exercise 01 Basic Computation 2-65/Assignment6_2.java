import javax.swing.JOptionPane;
class Assignment6_2 {
  public static void main(String[] args) {
        final float pi = 3.14;
        String radiusinput = JOptionPane.showInputDialog("Enter the radius of a cylinder:");
        float radius = Float.parseFloat(radiusinput);
        String lenghtinput = JOptionPane.showInputDialog("Enter the radius of a lenght:");
        float lenght = Float.parseFloat(lenghtinput);
        float area = radius * radius * pi;
        float volume = area * lenght;
        JOptionPane.showMessageDialog(null,"The area is " + area);
        JOptionPane.showMessageDialog(null,"The volume of the cylinder is " + volume); 
  }
}