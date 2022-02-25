public class Aluno
{
  int idade;
  int matricula;
  String nome;
  double nota1;
  double nota2;

  double media (double x, double y)
  {
    double m;
      m = (x + y) / 2;
      return m;
  }

  double maior (double x, double y)
  {
    double m;

    if (x > y)
      {
	m = x;
      }
    else
      {
	m = y;
      }
    return m;
  }

}