package fr.univlille1.tiir.music.service.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Utilisateur {

	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private String pseudo, email, passwd, passwd_bis;

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPasswd_bis() {
		return passwd_bis;
	}

	public void setPasswd_bis(String passwd_bis) {
		this.passwd_bis = passwd_bis;
	}
    
}
