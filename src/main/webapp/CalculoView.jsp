
<html>
<head>
<title>Cálculo de IMC</title>
</head>
<body>
	<h1>Cálculo de IMC</h1>
	<form>
		Nome do Aluno: <input type="text" name="nome" required="" value="${param.nome}"><br>
		Frequência do Aluno: <input type="text" name="frequencia" required="" value="${param.frequencia}"><br>
		Nota do Aluno: <input type="text" name="nota" required="" value="${param.nota}"><br>
		<button>Calcular</button>
	</form>
    <b>${ResultadoAprovacao}</b>
</body>
</html>
