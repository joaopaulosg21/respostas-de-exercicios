# Roman To Int

- #### O objetivo desse exercicio é transformar a String de entrada que está em algarismos romanos para seu valor em int

- ##### A minha melhor solução é colocar os valores em um map e verificar cada valor, mas como alguns numeros romanos são compostos de 2 algarismos como o 4 (IV), é necessarios verificar os valores, se o segundo valor for maior que o primeiro basta fazer a subtração dos valores, exemplo para chegar no numero 900: 
    - 900 (CM) -> C = 100, M = 1000
    - M - C = 900