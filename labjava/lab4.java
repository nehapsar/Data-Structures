package FourAdapter;

interface AdvancedMediaPlayer {
	public void playFile(String filename);
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////


package FourAdapter;

public class Main {
	public static void main(String args[]){
	    MediaPlayer player = new MP3Player();
	    player.play("sample.mp3");
	    player = new MediaPlayerAdapter(new MP4Player());
	    player.play("sample.mp4");
	    player = new MediaPlayerAdapter(new VLCPlayer());
	    player.play("sample.avi");
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////


package FourAdapter;


public interface MediaPlayer {
	public void play(String filename);
}







///////////////////////////////////////////////////////////////////////////////////



package FourAdapter;

class MediaPlayerAdapter implements MediaPlayer {
	 private AdvancedMediaPlayer advancedMediaPlayer;
	 public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
	    this.advancedMediaPlayer = advancedMediaPlayer;
	 }
	 @Override
	 public void play(String filename) {
	   System.out.print("Using MediaPlayerAdapter - ");
	   advancedMediaPlayer.playFile(filename);
	 }
}




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





package FourAdapter;

class MP3Player implements MediaPlayer {
	@Override
	public void play(String filename) {
		System.out.println("Playing MP3 file " + filename);		
	}
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





package FourAdapter;


class MP4Player implements AdvancedMediaPlayer {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 file " + filename);		
	}
}




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




package FourAdapter;

class VLCPlayer implements AdvancedMediaPlayer {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing VLC file " + filename);		
	}
}






