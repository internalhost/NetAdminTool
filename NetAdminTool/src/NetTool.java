import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.Dimension;


public class NetTool extends JFrame{
	//Default size of Window
	private int FRAME_WIDTH = 900;
	private int FRAME_HEIGHT = 600;

	private JMenuBar menubarTop;
	private JMenu menuFile, menuHelp;
	private JMenuItem itemOpen, itemImport, itemExport, itemExit, itemAbout;
	private JSplitPane panelBackground, panelBacktop;
	private JPanel panelDraw;
	private JTabbedPane panelShell;
	private JScrollPane panelTools;
	
	public NetTool(){
		super();
		initComponents();
		configWindow();
	}
	
	private void configWindow(){
		this.setTitle("Proto NetAdminTool");
		this.setPreferredSize(new Dimension(this.FRAME_WIDTH,this.FRAME_HEIGHT));
		this.setResizable(true);
		this.getContentPane().setLayout(new GridLayout());
		this.getContentPane().add(panelBackground);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setJMenuBar(menubarTop);
		this.add(panelBackground);
		
		pack();
	}
		
	private void initComponents(){
		menubarTop = new JMenuBar();
		menuFile = new JMenu("File");
		menuHelp = new JMenu("Help");
		
		itemOpen = new JMenuItem("Open");
		itemImport = new JMenuItem("Import");
		itemExport = new JMenuItem("Export");
		itemExit = new JMenuItem("Exit");
		itemAbout = new JMenuItem("About");
		
		menubarTop.add(menuFile);
		menubarTop.add(menuHelp);
		menuFile.add(itemOpen);
		menuFile.add(itemImport);
		menuFile.add(itemExport);
		menuFile.add(itemExit);
		menuHelp.add(itemAbout);
		
		panelBackground = new JSplitPane();
		panelBacktop = new JSplitPane();
		panelShell = new JTabbedPane();
		panelTools = new JScrollPane();
		panelDraw = new JPanel();
		
		panelBackground.setLayout(new BoxLayout(panelBackground, BoxLayout.Y_AXIS));
				
		panelBackground.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panelBackground.setDividerLocation(300);
		panelBackground.setTopComponent(panelBacktop);
		panelBackground.setBottomComponent(panelShell);
		
		panelBacktop.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		panelBacktop.setDividerLocation(300);
		panelBacktop.setLeftComponent(panelTools);
		panelBacktop.setRightComponent(panelDraw);
		
		//This will generate automatically when click to SSH connect on Draw Pane
		JPanel shell1 = new JPanel();
		panelShell.addTab("Shell1", shell1);
	}
	
	public static void main(String[] args){
		NetTool mainwin = new NetTool();
		mainwin.setVisible(true);
	}
}