package fr.univlille1.tiir.music.dao.impl;

import java.io.Serializable;

import fr.univlille1.tiir.music.dao.Music;
import fr.univlille1.tiir.music.dao.User;

public class ShareDAOIdClass implements Serializable{
    private Music piste;
    private User utilisateur;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((piste == null) ? 0 : piste.hashCode());
		result = prime * result
				+ ((utilisateur == null) ? 0 : utilisateur.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShareDAOIdClass other = (ShareDAOIdClass) obj;
		if (piste == null) {
			if (other.piste != null)
				return false;
		} else if (!piste.equals(other.piste))
			return false;
		if (utilisateur == null) {
			if (other.utilisateur != null)
				return false;
		} else if (!utilisateur.equals(other.utilisateur))
			return false;
		return true;
	}
}
