package pl.ekomputery.urb.jaga;


import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JApplet;

import org.jivesoftware.*;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;

/**
 * @author wurb
 *
 */
public class JagaApplet extends JApplet {

	private JPanel jContentPane = null;
	private JPanel jTopPanel = null;
	private JPanel jDownPanel = null;
	private JScrollPane jRosterPane = null;
	private JTable rosterTable = null;
	private JButton onlineButton = null;
	private JButton offlineButton = null;
	private JMenu jMenu = null;
	private JMenuItem jMenuItem = null;
	/**
	 * This is the default constructor
	 */
	public JagaApplet() {
		super();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	public void init() {
		this.setSize(200, 400);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJTopPanel(), java.awt.BorderLayout.NORTH);
			jContentPane.add(getJDownPanel(), java.awt.BorderLayout.SOUTH);
			jContentPane.add(getJRosterPane(), java.awt.BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jMenuPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJTopPanel() {
		if (jTopPanel == null) {
			jTopPanel = new JPanel();
			jTopPanel.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
		}
		return jTopPanel;
	}

	/**
	 * This method initializes jDownPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJDownPanel() {
		if (jDownPanel == null) {
			jDownPanel = new JPanel();
			jDownPanel.add(getOnlineButton(), null);
			jDownPanel.add(getOfflineButton(), null);
		}
		return jDownPanel;
	}

	/**
	 * This method initializes jRosterPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJRosterPane() {
		if (jRosterPane == null) {
			jRosterPane = new JScrollPane();
			jRosterPane.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			jRosterPane.setViewportView(getRosterTable());
			jRosterPane.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		}
		return jRosterPane;
	}

	/**
	 * This method initializes rosterTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getRosterTable() {
		if (rosterTable == null) {
			rosterTable = new JTable();
		}
		return rosterTable;
	}

	/**
	 * This method initializes onlineButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOnlineButton() {
		if (onlineButton == null) {
			onlineButton = new JButton();
			onlineButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			onlineButton.setText("Online");
			onlineButton.setName("");
		}
		return onlineButton;
	}

	/**
	 * This method initializes offlineButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOfflineButton() {
		if (offlineButton == null) {
			offlineButton = new JButton();
			offlineButton.setText("Offline");
		}
		return offlineButton;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Menu");
			jMenu.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
			jMenu.add(getJMenuItem());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("abcd");
		}
		return jMenuItem;
	}

}
