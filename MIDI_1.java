import javax.sound.midi.*;
import java.io.IOException;

public class MIDI_1 {

        public static void main(String[] args){
            MIDI_1 midi1 = new MIDI_1();
            midi1.play();
        }

    public void play(){
            try{
                //Open a sequencer object
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                //Get a sequence object
                Sequence seq = new Sequence(Sequence.PPQ, 4);

                //Get a track from the sequence
                Track t = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144,1,44,100);
                MidiEvent noteON = new MidiEvent(a, 1);
                t.add(noteON);

                ShortMessage b = new ShortMessage();
                b.setMessage(144,1,44,100);
                MidiEvent noteOFF = new MidiEvent(b, 16);
                t.add(noteOFF);

                player.setSequence(seq);

                player.start();

            } catch (MidiUnavailableException e) {
                e.printStackTrace();
            } catch (InvalidMidiDataException e) {
                e.printStackTrace();
            }
    }

}
