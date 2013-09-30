package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Share implements fr.univlille1.tiir.music.dao.Share{

	@Id
	private long id;
	private long musicId;
	private long sharedWithId;
	
	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public long getMusic() {
		return this.musicId;
	}

	@Override
	public long getSharedWith() {
		return this.sharedWithId;
	}

}
