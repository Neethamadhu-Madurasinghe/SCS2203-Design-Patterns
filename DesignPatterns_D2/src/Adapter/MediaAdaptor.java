package Adapter;

public class MediaAdaptor implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaptor(String audioType) {
        if(audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
