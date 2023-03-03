algoritmo "Calculador de salario"

var

salario: real
aumento: real
aumento_total: real

inicio
escreval("Voce teve um aumento de 30%!")
escreval("Insira seu salario em reais: ")
leia (salario)
//regra de três basica
aumento <- (salario * 30) / 100
aumento_total <- aumento + salario

escreval("Seu aumento foi de R$",aumento)
escreval("Seu novo pagamento é: R$",aumento_total)

fimalgoritmo
