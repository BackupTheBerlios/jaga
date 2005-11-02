package pl.ekomputery.urb.jaga;

import org.jivesoftware.smack.*;

public class Connection {
	private String serverName;
	private int port;
	
	private String login;
	private String password;
	
	private XMPPConnection xmppConnection;
	private Roster roster;
		
	public Connection(String serverName, int port, String login, String password) {
		this.serverName = serverName;
		this.port = port;
		this.login = login;
		this.password = password;
	}
	
	synchronized public boolean connect() 
	{
		try {						
				xmppConnection = new XMPPConnection(serverName, port);
				xmppConnection.login(login, password, "JAGA");					
		} catch(XMPPException e) {
			return false;
		}
		
		return true;
	}
	
	synchronized public boolean disconnect() {
		if(xmppConnection != null)
		{
			xmppConnection.close();
			xmppConnection = null;			
			return true;
		}
		return false;
	}
	
	synchronized public boolean isConnected() {
		if (xmppConnection !=null)
			return xmppConnection.isConnected();
		return false;
	}
	
	synchronized public boolean loadRoster() {
		if(isConnected()) {
			roster = xmppConnection.getRoster();
			if(roster != null)
				return true;
		}
		return false;
	}	
	
}
