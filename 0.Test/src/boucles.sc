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

for (i <- 1 to 5) {
  println(i)
}

for (i <- 1 until 5) {
  println(i)
}

// Map Reduce

val xs = List(3,4,7,6,1,12)

for (x <- xs if x%2 == 0) yield x


for (x <- xs if x%2 == 0) yield x*10

xs.filter(x => x%2 == 0).map(x => x*10)

// Syntactic Sugar
xs.filter(_%2 == 0).map(_*10)

xs.filterNot(x =>  x%2==0).map(x=>x*10)

