package chapter02;

public class SongApp {
	public static void main(String[] args){
		Song song = new Song();
		song.setArtist("������");
		song.setTitle("���� ��");
		song.setAlbum("Real");
		song.setComposer("�̹μ�");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
	}
}
