package aoscar.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produto;

// reload de jsp eh automatico, de .java nao, ai configura no pom.xml!
@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		new Produto("Rtx 2060", 2002.2);
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Bata um papo conosco!!</h2></html>");
		writer.close();
	}
}
// .jar gera o package so com as classes.
// .war, ele add o pom e quase todos os arquivos, nao poe .java!
// Cuidado ao usar os dois projetos em sua maquina, pois ele te da acesso a classes que 
// nao deveria ter, como classes de teste. Eh bom pois o eclipse faz o link e qq alteracao 
// no outro projeto, ja reflete aqui, sem precisar rebuildar! Contudo, te da acesso ao que
// nao deveria. Para usar dois projetos, eh necessario que o outro esteja instalado no repo
// local. usando mvn install.
