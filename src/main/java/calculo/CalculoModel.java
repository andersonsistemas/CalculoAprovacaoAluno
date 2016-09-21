package calculo;
public class CalculoModel {

  public static String ResultadoAprovacao(String nome, float frequencia, float nota) {

      if(nome.equalsIgnoreCase("0")&&frequencia==0&&nota==0)
          return "";
      else if(frequencia>=75&&nota>=6.0)
          return "O aluno: "+nome +"<br>Frequencia: "+frequencia+"%<br>Nota: "+nota +"<br>Está APROVADO";
    else
        return "O aluno: "+nome +"<br>Frequencia: "+frequencia+"%<br>Nota: "+nota +"<br>Está REPROVADO";
  }
}

