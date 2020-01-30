# Resumo
<p>Nesse projeto faço uso do Spring boot, H2 Database, PostgreSql e Heroku<br>
E está sendo feito somente como forma didática,<br>
por ser uma API, a comunicação é feita pelos verbos http
</p>

# Link para heroku
Obs: Por se tratar de uma hospedagem gratuita e fica nos Estados unidos, é um pouco lenta<br>
<br>
<p>https://ygorkayansb.herokuapp.com/</p>

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

