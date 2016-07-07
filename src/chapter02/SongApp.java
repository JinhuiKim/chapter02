package chapter02;

public class SongApp {
	public static void main(String[] args){
		Song song = new Song();
		song.setArtist("아이유");
		song.setTitle("좋은 날");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
	}
}
