package MAIN;

import java.io.IOException;

import javafx.beans.property.SimpleStringProperty;

public class LoginMain {
	public SimpleStringProperty userName;
	
	public LoginMain() {
			userName = new SimpleStringProperty("");
	}	

	/**
	 * @param userName
	 */
	public LoginMain(SimpleStringProperty userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName.getValue();
	}

	public void setUserName(String userName) {
		this.userName = new SimpleStringProperty(userName);
	}	
	
	private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException 
    {
    	stream.writeUTF(getUserName());
    	
    }
    
    private void readObject(java.io.ObjectInputStream stream)
            throws IOException 
    {
    	setUserName(stream.readUTF());
    	
    }
        
}
