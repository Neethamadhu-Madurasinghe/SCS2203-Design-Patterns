package Adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdaptor mediaAdaptor;

    @Override
    public void play(String audioType, String fileName) {
//        for mp3 files use the AudioPlayer
        if(audioType.equals("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);

//            For vlc and mp4 use media adaptor
        }else if(audioType.equals("vlc") || audioType.equals("mp4")) {
            mediaAdaptor = new MediaAdaptor(audioType);
            mediaAdaptor.play(audioType, fileName);

        }else {
            System.out.println("Invalid format");
        }
    }
}
