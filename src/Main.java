import java.util.Random;
import edu.princeton.cs.stdlib.StdDraw;

public class Main {
    public static void main(String[] args) {
        //Rango del dibujo
        double min = -1.0;
        double max = 1.0;

        //Definicion de la escala del lienzo del dibujo
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        //evita parpadeo de pantalla
        StdDraw.enableDoubleBuffering();

        //posicion inicial aleatoria de cada extremo de las lineas
        double x = min+ (max -min) * Math.random();
        double xUno= min+ (max -min) * Math.random();
        double y = min+ (max -min) * Math.random();
        double yUno=min+ (max -min) * Math.random();

        //Se define una velocidad aleatoria
        double velX = Math.random()/100;
        double velXUno = Math.random()/100;
        double velY = Math.random()/100;
        double velYUno = Math.random()/100;

        while (true){

            //Se verifica que la primera linea (negro) no salga del interior del lienzo
            if (Math.abs(x+velX)>1.0){
                velX= -velX;
            }

            if (Math.abs(y+velY)>1.0){
                velY= -velY;
            }

            if (Math.abs(xUno+velXUno)>1.0){
                velXUno= -velXUno;
            }

            if (Math.abs(yUno+velYUno)>1.0){
                velYUno= -velYUno;
            }
            //Se verifica que la ultima linea (azul) no salga del interior del lienzo
            if (Math.abs(x-0.1+velX)>1.0){
                velX= -velX;
            }

            if (Math.abs(y-0.1+velY)>1.0){
                velY= -velY;
            }

            if (Math.abs(xUno-0.1+velXUno)>1.0){
                velXUno= -velXUno;
            }

            if (Math.abs(yUno-0.1+velYUno)>1.0){
                velYUno= -velYUno;
            }

            //Se actualiza la posicion de los extremos de cada line
            x += velX;
            y += velY;
            xUno += velXUno;
            yUno += velY;

            StdDraw.clear();

            //Se crea cada una de las seis lineas
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(x-0.1,y-0.1,xUno-0.1,xUno-0.1);

            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(x-0.08,y-0.08,xUno-0.08,xUno-0.08);

            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.line(x-0.06,y-0.06,xUno-0.06,xUno-0.06);

            StdDraw.setPenColor(StdDraw.PINK);
            StdDraw.line(x-0.04,y-0.04,xUno-0.04,xUno-0.04);

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(x-0.02,y-0.02,xUno-0.02,xUno-0.02);

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(x,y,xUno,xUno);

            StdDraw.show();

        }
    }
}