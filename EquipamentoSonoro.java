public class EquipamentoSonoro extends Equipamento {

    private short volume;
    private boolean stereo;
    private boolean mono;

 
    public EquipamentoSonoro(int estado) {
        super(estado);
    }

  
    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public boolean getStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    public void mono(){
        this.mono = false;
    }

    public void stereo(boolean stereo){
        this.stereo = true;
    }
}