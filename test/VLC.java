import java.net.URL;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class VLC extends Application {
    void playMedia() {
        String mp3 = "output.mp3";
        URL resource = getClass().getResource(mp3);
        System.out.println(resource.toString());
        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public static void main(String args[]) {
        new VLC().playMedia();
    }
    @Override
    public void start(Stage stage) throws Exception {
    }
}



// import javafx.scene.media.Media;
// import javafx.scene.media.MediaPlayer;

// public class soundtest {
//     public static void main(String[] args) {
//         System.out.println("open");
//         String bip = "output.mp3";
//         Media hit = new Media(new File(bip).toURI().toString());
//         MediaPlayer mediaPlayer = new MediaPlayer(hit);
//         mediaPlayer.play();
//         System.out.println("close");
//     }
// }
