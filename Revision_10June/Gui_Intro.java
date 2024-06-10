import javax.swing.JOptionPane;


public class Gui_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter Your Name::");
		JOptionPane.showMessageDialog(null,"Hello "+name  );
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
		JOptionPane.showConfirmDialog(null, "You are "+age+"years old");
		
		double height  = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height:"));
		JOptionPane.showConfirmDialog(null, "You are "+height+"cm tall");
		
		

	}

}
