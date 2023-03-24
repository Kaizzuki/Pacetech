algoritmo "Registrador de temperatura"




var
MedTempC, MedTempF : vetor[1..4] de real
MedHora : vetor[1..4] de literal
opcaomenu : literal
i, j : inteiro
aux, aux2 : real
aux3 : literal

//PROCEDIMENTOS/FUNCOES ----------------------
procedimento calculotemp() : real
var
temperaturaC, temperaturaF : real
inicio
//Celsius para Fahrenheit
se opcaomenu = "1" entao
   escreval("Insira a temperatura em Celsius")
   leia (temperaturaC)
   temperaturaF <- (temperaturaC * 9/5) + 32
   MedTempC[i] <- temperaturaC
   MedTempF[i] <- temperaturaF
senao
   //Fahrenheit para Celsius
   escreval("Insira a temperatura em Fahrenheit")
   leia(temperaturaF)
   TemperaturaC <- (temperaturaF - 32) * 5/9
   MedTempC[i] <- temperaturaC
   MedTempF[i] <- temperaturaF
fimse
fimprocedimento



Procedimento RegTempo()
inicio
escreval("Insira a hora em que a temperatura foi registrada")
leia (Medhora[i])

fimprocedimento



procedimento MostrarMenu()
inicio
escreval("Este é o",i,"º registro de temperatura do dia")
escreval("Converter a temperatura de: ")
escreval("1 - Celsius para Fahrenheit")
escreval("2 - Fahrenheit para Celsius")
leia(opcaomenu)
fimprocedimento



//CODIGO PRINCIPAL -----------------------------
inicio
repita
   para i de 1 ate 4 faca
      mostrarMenu()
      escolha opcaomenu
      caso "1"
         limpatela
         calculotemp()
         RegTempo()
         limpatela

      caso "2"
         limpatela
         calculotemp()
         RegTempo()
         limpatela

      outrocaso
         escreval("opção invalida")



      fimescolha
   fimpara


   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         se MedtempC[j] > medtempC[i] entao


            aux <- MedtempC[i]
            aux2 <- MedTempF[i]
            aux3 <- Medhora[i]

            MedtempC[i] <- medtempC[j]
            MedtempF[i] <- medtempf[j]
            MedHora[i] <- medhora[j]

            medtempC[j] <- aux
            medtempf[j] <- aux2
            medhora[j] <- aux3

         fimse
      fimpara
   fimpara

   para i de 1 ate 4 faca
      escreval("Temperatura de ", MedTempC[i]:1:2 ," graus celsius, registrada as ", MedHora[i],"H corresponde a", MedtempF[i]," graus Fahrenheit.")
   fimpara
   escreval("Eescreva 'sair' para sair do progama")
   leia (opcaomenu)

ate opcaomenu = "sair"
fimalgoritmo
