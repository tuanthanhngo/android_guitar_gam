package com.ttngo.guitargam.data;

public class SongDetailItem extends SongListItem {
//	private int id;
//	private String name;

	/** lyrics text, break line with \n */
	private String lyrics;

	/** chord - json format ? [{0, "Am'", {10, "Dm"}, {char_index, chord_text}, ...] */
	private String chord;


	/** auth */
	private String writer;
	private String writersong;
	private String writertime;
	private String writerchord;

	private String singer;
	private String mainchord;

//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getChord() {
		return chord;
	}
	public void setChord(String chord) {
		this.chord = chord;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWritersong() {
		return writersong;
	}
	public void setWritersong(String writersong) {
		this.writersong = writersong;
	}
	public String getWritertime() {
		return writertime;
	}
	public void setWritertime(String writertime) {
		this.writertime = writertime;
	}
	public String getWriterchord() {
		return writerchord;
	}
	public void setWriterchord(String writerchord) {
		this.writerchord = writerchord;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMainchord() {
		return mainchord;
	}
	public void setMainchord(String mainchord) {
		this.mainchord = mainchord;
	}
}