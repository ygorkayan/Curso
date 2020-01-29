# Curso
<p>Nesse projeto faço uso do Spring boot, db H2,Postman, PostgreSql e Heroku</p>
<p>E esta sendo feito somente como forma didatica</p>

# Link para heroku
<p>https://yk-javasb.herokuapp.com/</p>

# Como usar
## POST
<p>usuario/ -> recebe um json para criar usuario</p>
<p>{</p>
<p> "name": "Bob Brown",</p>
<p> "email": "bob@gmail.com",</p>
<p> "password": "123456",</p>
<p> "phone": "977557755"</p>
<p>}
<br><br>
  
## GET:
<p>usuario/ -> retorna todos os usuarios</p>
<p>usuario/1 -> retorna o usuario com id 1</p>
<br><br>

## DELETE
<p>usuario/1 -> Deleta o usuario com id 1</p>
<br><br>

## PUT
<p>usuario/1 -> Modifica o usuario com id 1</p>
<p>{</p>
<p>"name": "outro nome",</p>
<p>"email": "outro email",</p>
<p>"password": "outra senha",</p>
<p>"phone": "outro telefone"</p>
<p>}

