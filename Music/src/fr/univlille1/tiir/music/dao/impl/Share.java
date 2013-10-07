package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="share")
public class Share implements fr.univlille1.tiir.music.dao.Share{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long share_id;
	private long musicId;
	private long sharedWithId;
	
	public long getId() {
		return this.share_id;
	}

	public long getMusic() {
		return this.musicId;
	}

	public long getSharedWith() {
		return this.sharedWithId;
	}

}
