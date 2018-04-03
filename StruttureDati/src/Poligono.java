import java.util.Vector;

public class Poligono  {
    Vector poligono=new Vector(1,1);

    public void aggiungi(){
        Punto p1=new Punto(0,2);
        Punto p2=new Punto(2,5);
        Punto p3=new Punto(4,4);
        Punto p4=new Punto(5,2);
        Punto p5=new Punto(2,-1);

        poligono.addElement(p1);
        poligono.addElement(p2);
        poligono.addElement(p3);
        poligono.addElement(p4);
        poligono.addElement(p5);
    }
    public void stampa(){
        Punto p;
        System.out.println("Elenco punti");
        for(int i=0;i<poligono.size();i++){
            p=(Punto)poligono.elementAt(i);
            System.out.println("x="+p.x+" y="+p.y);
        }
    }

}
