var qg= prompt ("DIGITE A QUANTIDADE DE GOLS")
var pc= prompt ("DIGITE A QUANTIDADE DE PASSES CERTO")
var pe= prompt ("DIGITE A QUANTIDADE DE PASSES ERRADOS")

var pontos = (qg * 50) + (pc * 10) + (pe * -5) 

if (pontos < 50) {
    alert("PESSIMA PARTIDA");
} else if (pontos >= 50 && pontos < 100) {
    alert("PARTIDA RUIM");
} else if (pontos >= 100 && pontos < 150) {
    alert("FEZ O BASICO");
} else if (pontos >= 150 && pontos < 200) {
    alert("JOGOU BEM");
} else if (pontos >= 200) {
    alert("JOGOU DEMAIS"); // salve, vai com calma que voce consegue. 
}

//Alteração para novo commit 
