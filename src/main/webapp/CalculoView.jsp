
<html>
<head>
<title>C�lculo Aprova��o Aluno</title>
</head>
<body>
	<h1>C�lculo Aprova��o Aluno</h1>
	<form>
		Nome do Aluno: <input type="text" name="nome" required="" value="${param.nome}"><br>
		Frequ�ncia do Aluno: <input type="text" name="frequencia" required="" value="${param.frequencia}">%<br>
		Nota do Aluno: <input type="text" name="nota" required="" value="${param.nota}"><br>
		<button>Calcular</button>
	</form>
    <b>${ResultadoAprovacao}</b>
</body>
</html>
