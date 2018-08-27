import javax.swing.JOptionPane;

public class RollorCoaster {
public static void main(String[] args) {
	String Coaster=JOptionPane.showInputDialog("What is your weight?");
	int weight = Integer.parseInt(Coaster);
	if(weight>48) {
		JOptionPane.showMessageDialog(null, "You are tall enough");
	}else {
		JOptionPane.showMessageDialog(null, "You need to grow first");
	}
	}
}

