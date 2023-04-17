package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre , edad , "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos(){
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return Math.abs(golesRecibidos-((Portero)o).golesRecibidos);
    }
    @Override
    public java.lang.String toString() {
        return super.toString() + " con el dorsal "+ dorsal +". Le han marcado " + golesRecibidos;
    }
}
