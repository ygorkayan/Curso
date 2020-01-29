package com.yk.curso.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class index {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>So uma lasanha agora em :)</h1>";
    }

    private String msg() {
        StringBuilder temp = new StringBuilder();

        temp.append("Bem vindo, api desenvolvida por Ygor Kayan<br>");
        temp.append("o uso dela foi pensado usando os verbos HTTP meio que uma API Rest<br>");

        temp.append("<br>");

        temp.append("<p>POST: <br>");
        temp.append("usuario/ -> recebe um json para criar usuario <br>");

        temp.append("<br><br>");

        temp.append("GET: <br>");
        temp.append("usuario/ -> retorna todos os usuarios<br>");
        temp.append("usuario/1 -> retorna o usuario com id 1<br>");

        temp.append("<br><br>");

        temp.append("DELETE: <br>");
        temp.append("usuario/1 -> Deleta o usuario com id 1<br>");

        temp.append("<br><br>");

        temp.append("PUT: <br>");
        temp.append("usuario/1 -> Modifica o usuario com id 1<br></p>");

        return temp.toString();
    }
}
