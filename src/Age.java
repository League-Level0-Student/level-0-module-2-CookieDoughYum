import javax.swing.JOptionPane;

public class Age {
public static void main(String[] args) {
	String Age=JOptionPane.showInputDialog("How old are you?");
	int President = Integer.parseInt(Age);
	if(President>18) {
		JOptionPane.showInputDialog("Who do you think the next president should be?");
	}else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	}
	}
	}


