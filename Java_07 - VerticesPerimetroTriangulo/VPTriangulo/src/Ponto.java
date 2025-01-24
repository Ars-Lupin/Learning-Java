public class Ponto
{
   private double x;
   private double y;

   // Construtor
   public Ponto(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double distancia(Ponto p)
   {
      return (double) Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
   }
}
