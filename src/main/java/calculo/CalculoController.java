package calculo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/calculo")
public class CalculoController extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    //Preparação dos parâmetros.
    String nomeStr = req.getParameter("nome");
  String nome = nomeStr == null || nomeStr.isEmpty() ? "0" : nomeStr;
    String frequenciaStr = req.getParameter("frequencia");
    float frequencia = frequenciaStr == null || frequenciaStr.isEmpty() ? 0 : Float.parseFloat(frequenciaStr);

    String notaStr = req.getParameter("nota");
    float nota = notaStr == null || notaStr.isEmpty() ? 0 : Float.parseFloat(notaStr);

    //Chamada ao Model.
    String resultado = CalculoModel.ResultadoAprovacao(nome,frequencia,nota);

    //Passagem de atributos para o JSP.
    req.setAttribute("ResultadoAprovacao", resultado);

    //Chamando o JSP.
    String nextJsp = "/CalculoView.jsp";
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
    dispatcher.forward(req, resp);
  }
}
