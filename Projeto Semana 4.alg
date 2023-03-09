algoritmo "facilidador de vidas nos EUA"


var
Temp_f, Temp_c : real
CotacaoDolar, qtdDolar, qtdReal :real
Opcaomenu, saida : literal

inicio
Escreval("===== Conversor de valores =====")
escreval("Insira a cotação do dolar: ")
leia(cotacaoDolar)

repita
   limpatela
   Escreval("=====conversor de valores=====")
   escreval("Escolha uma opção")
   escreva("1 - Trocar a cotação do dolar? ")
   escreval("| Cotação do USD: BRL", Cotacaodolar)
   escreval("2 - Converter moedas")
   escreval("3 - Converter temperaturas")
   escreval("4 - Sair do progama")
   leia (opcaomenu)

   se opcaomenu = "1" entao
      limpatela
      escreval("Insira a cotação do dolar: ")
      leia(cotacaoDolar)

   fimse

   se opcaomenu = "2" entao
      repita
         limpatela
         escreval("Escolha uma conversão")
         escreval("1 - Dolar para real")
         escreval("2 - Real para Dolar")
         leia(opcaomenu)
         se opcaomenu = "1" entao
            limpatela
            escreval("Insira a quantia em dolares")
            leia (qtdDolar)
            qtdReal <- qtddolar * cotacaoDolar
            escreval("US$",qtdDolar:1:2 ," equivale a R$", qtdReal:1:2)
            escreval(" ")
            escreval("Deseja retornar ao menu?")
            escreval("Sim / Nao")
            leia(saida)
         fimse
         se opcaomenu = "2" entao
            limpatela
            escreval("Insira a quantia em reais")
            leia (qtdReal)
            qtdDolar <- qtdReal / cotacaoDolar
            escreval("R$",qtdReal:1:2 ," equivale a US$", qtdDolar:1:2)
            escreval(" ")
            escreval("Deseja retornar ao menu?")
            escreval("Sim / Nao")
            leia(saida)
         fimse
         limpatela
      ate saida = "sim"
   fimse

   se opcaomenu = "3" entao
      repita
         limpatela
         escreval("Escolha uma conversao")
         escreval("1 - Fahrenheit para Celsius")
         escreval("2 - Celsius para Fahrenheit")
         leia (opcaomenu)
         se opcaomenu = "1" entao
            limpatela
            escreval("Insira a temperatura em Fahrenheit")
            leia(temp_F)
            Temp_c <-  (temp_f - 32) / 1.8
            escreval(temp_f, " Fahrenheit sao ",Temp_c:1:1," Celsius")
            escreval(" ")
            escreval("Deseja retornar ao menu?")
            escreval("Sim / Nao")
            leia(saida)
         fimse
         se opcaomenu = "2" entao
            limpatela
            escreval("Insira a temperatura em Celsius")
            leia(temp_C)
            Temp_f <- (temp_c * 9/5) + 32
            escreval(temp_C, " Celsius sao ",Temp_F:1:1," Fahrenheit")
            escreval(" ")
            escreval("Deseja retornar ao menu?")
            escreval("Sim / Nao")
            leia(saida)
            limpatela
         fimse
      ate saida = "sim"
   fimse


   limpatela
ate opcaomenu = "4"
fimalgoritmo



