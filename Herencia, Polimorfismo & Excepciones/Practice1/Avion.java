public class Avion extends Vehiculo{

  public Avion(int ns, int np){
    super(ns, np, Vehiculo.Tipo.valueOf("AEREO"));
  }

  // polimorfismo
  public void resumenInfo(){
    System.out.println("este es el resumen de AVION");
    System.out.println("El numero de Series: " + numSerie);
    System.out.println("El numero de Pasajeros: " + numeroPasajeros);
    System.out.println("El tipo de transporte es: " + transporte);
  }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Tipo getTransporte() {
        return transporte;
    }

    public void setTransporte(Tipo transporte) {
        this.transporte = transporte;
    }

    @Override
    public void avanzar() {
        super.avanzar();
        System.out.println("Estas avanzando en Avion");
        System.out.println("Y su velocidad se mide en nudos");
    }


}
