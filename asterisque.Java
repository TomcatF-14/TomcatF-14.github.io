//demande un nombre entre 1 a 30
var nombre = parseInt(prompt("Insere un nombre entre 1 et 30 (Tu peux aller avec un nombre plus elever(je ne recommende pas plus que 500 sinnon sa va devenir problematique)) " ));
//affiche ce nombre d'asteriques (*) avec for
console.log("affichage asterqiues avec for")
var asterisque = "";
for (let i = 1; i <= nombre; i++ ) {
 asterisque = asterisque + "*";
}
console.log(asterisque)
 
//affiche le nombre d'asterisque (*) avec la fonction while
console.log("afficage avec while")
 let i = 1;
 
 while (i <= nombre) {
 i++
   
  console.log (asterisque)
 }
