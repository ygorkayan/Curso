# Curso
<p>Nesse projeto faço uso do Spring boot, db H2,Postman, PostgreSql e Heroku</p>
<p>E esta sendo feito somente como forma didatica</p>

# Link para heroku
<p>https://yk-javasb.herokuapp.com/</p>

# Como usar
<p>POST:</p>
<p>users/ -> recebe um json para criar usuario</p>
<p>{</p>
<p> "name": "Bob Brown",</p>
<p> "email": "bob@gmail.com",</p>
<p> "password": "123456",</p>
<p> "phone": "977557755"</p>
<p>}
<br><br>
  
<p>GET:</p>
<p>users/ -> retorna todos os usuarios</p>
<p>users/1 -> retorna o usuario com id 1</p>
<br><br>

<p>DELETE:</p>
<p>users/1 -> Deleta o usuario com id 1</p>
<br><br>

<p>PUT: </p>
<p>users/1 -> Modifica o usuario com id 1, so permiti a att de Nome, email e Phone</p>
<p>{</p>
<p> "name": "Outro nome",</p>
<p> "email": "Outro email",</p>
<p> "phone": "Outro numero"</p>
<p>}

