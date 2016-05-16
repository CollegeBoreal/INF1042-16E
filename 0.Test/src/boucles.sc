// ----- Boucles
// Variable

var x = 0

while (x < 5) { println(x); x += 1}

// imprimer x
x

x = 0

do { println(x); x += 1} while (x < 5)

// imprimer x
x

// Passage de 'mutable' a 'immutable'

// Boucle avec variable indicee
var i = -1
while( i  <= 1)  {
  println(i)
  i+=1
}

// Boucle avec generateur de format liste
val is = List( -1, 0,1)
for ( i <- is) {
  println(i)
}

// Boucle avec generateur de format plage (range)
for ( i  <-  -1 to 1) {
  println(i)
}


// Utilisation de l'expression for

for (i <- -1 until 2) {
  println(i)
}


