import javax.swing.JFrame;


public class Window extends JFrame {
	public Window () {
		super();
		configWindow();
		initComponents();
	}
	
	private void configWindow() {
		this.setTitle("Proto NetAdminTool");
		this.setSize(600, 500);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initComponents() {

	}
	
	public static void main(String[] args) {
		Window mainwin = new Window();
		mainwin.setVisible(true);
	}
}