
// Tuples

val vs = (1,2)

val ws = (1,2,3)

// deconstruction

val (x,y,z) = (1,2,3)

x

// Travail sur le conteneur

// En occurence, la liste chainee la plus courante en Scala
val xs= List ( -2,-1,0,1,2)

// Recuperer la tete
 xs.head

// Recuperer la queue
xs.tail


// Inference (Deduit le type de la valeur automatiquement)

val c = 'y'

val s = "Yves"

// Genericite

type Z = Long
type R = Double


val  zs = List[R]( -1,0.5,0 , 1)

val cs = List[Char] ('a','b','c')

cs head

cs tail

// Access direct

cs (1)

// Cons

val ds = 'a' :: 'b' :: 'c' :: Nil

   

