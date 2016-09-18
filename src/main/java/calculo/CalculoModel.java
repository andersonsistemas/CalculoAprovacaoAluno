package calculo;
public class CalculoModel {

  public static String ResultadoAprovacao(String nome, float frequencia, float nota) {
    if(frequencia>=75&&nota>=6.0)
      return "O aluno: "+nome +"Obteve Frequencia de :"+frequencia+" e nota: "+nota +" e está APROVADO";
    else
        return "O aluno: "+nome +"Obteve Frequencia de :"+frequencia+" e nota: "+nota +" e está REPROVADO";
  }
}

