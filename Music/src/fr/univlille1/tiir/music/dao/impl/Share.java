package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Column;
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
	private long id;
	
	@Column(name="musicId", nullable=false)
	private long musicId;
	
	@Column(name="sharedWithId", nullable=false)
	private long sharedWithId;
	
	public long getId() {
		return this.id;
	}

	public long getMusic() {
		return this.musicId;
	}

	public long getSharedWith() {
		return this.sharedWithId;
	}

}
