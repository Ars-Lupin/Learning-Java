
class Triangulo
{
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    
    // Construtor
    public Triangulo(Ponto p1, Ponto p2, Ponto p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Método para calcular o perímetro do triângulo
    public double calculaPerimetro()
    {
        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p1);
        return lado1 + lado2 + lado3;
    }
}
