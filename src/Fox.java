import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Fox{
    public static void main(String[] args){
        File file1 = new File("morse.WAV");
        File file2 = new File("shh.WAV");
        for (int j = 0; j < 4000; j++){
            for (int i = 0; i < 5; i++) {
                playSound(file1);
            }
            playSound(file2);
        }
    }
    static void playSound(File sound){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/860);
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
} 