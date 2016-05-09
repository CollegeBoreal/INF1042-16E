   // Declaration et initialisation
   // Constante (encore appelle valeur)
   val check = false
   val happy = "heureux"
   val sad = "triste"

   // -- Conditions

   if (check) happy else sad

   if (check) happy

   if (check) happy else ()

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