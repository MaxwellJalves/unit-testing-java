# unit-testing-java
#Estudo  -   Unit-testing


#	Referencias:
		-	https://site.mockito.org/
-	-	-
		- Principais recursos da documentação de referência :

-	mock()/ @Mock: criar simulação
opcionalmente, especifique como ele deve se comportar via Answer/MockSettings
-	when()/ given()para especificar como um mock deve se comportar
Se as respostas fornecidas não atenderem às suas necessidades, escreva uma estendendo a Answerinterface
-	spy()/ @Spy: simulação parcial, métodos reais são invocados, mas ainda podem ser verificados e fragmentados
@InjectMocks: injeta automaticamente campos fictícios / espiões anotados com @Spyou@Mock
-	verify(): para verificar se os métodos foram chamados com os argumentos fornecidos
pode usar correspondência de argumento flexível, por exemplo, qualquer expressão por meio do any()
ou capturar quais argumentos foram chamados usando em @Captorvez disso
Experimente a sintaxe de desenvolvimento baseada em comportamento com BDDMockito
Use o Mockito no Android, graças à equipe que trabalha no dexmaker


# 	Configuração Intelij  
- O procesimendo listado abaixo foi utilizado para conseguir realizar o rebuild automatico quando existe alguma alteração no projeto.
	- Pressionar shift * 3 
	-	Informar na pesquisa o : Registry
	-	Habilitar a opção -	[]	compiler.automatemake.allow.when.app.running	
-	[ ]		[ ]Allow auto-make to start even if developed application is currently running. Note that automatically started make may eventually delete some classes that are required by the application	
