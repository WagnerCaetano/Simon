import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

public class SoundClick{
    public static void Beat(){
    try {
         // Open an audio input stream.           
          File soundFile = new File("C:\\Users\\u18300\\Documents\\GitHub\\Simon\\SOUND.wav"); //you could also get the sound file with an URL
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
   public static void BeatShowing(){
    try {
         // Open an audio input stream.           
          File soundFile = new File("C:\\Users\\u18300\\Documents\\GitHub\\Simon\\SHOWING.wav"); //you could also get the sound file with an URL
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
}