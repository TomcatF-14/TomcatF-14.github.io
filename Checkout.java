const TVH = 13; //taux de taxe
 
 
 
function calculeCout(prix,quantite) {
 
  return quantite * prix * ((TVH/100)+1)
 
}
 
 var num = Math.ceil
 
var p = parseFloat (prompt("Quel est le prix de l'article ?"));
 
var q = parseInt (prompt("Quel est la quantité de l'article ?"));
 
var total = calculeCout(p,q);
console.log ( " votre totale est " + ( total + num ) + "$");
 
 
 
