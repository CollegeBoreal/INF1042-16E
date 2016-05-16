// definir le domaine
type R  = Double

def f(x: R) : R = x + 1

// composition de deux foncfions
def  g (f : R => R , x : R) :R=f(x) + 3

g( f, 5 )

def p ( x: R ) : R = x*x

g (p , 5)


def s( x: R) : R = 3*x + 2

g (s ,3)

def  n (m : R => R)(x : R) :R = m(x) - 3

n(f)(3)

f(0 )

f(-5)

for ( x <-  -2  to 2)  yield s(x)

// Map Reduce

val xs = scala.List(3,4,7,6,1,12)

for (x <- xs if x%2 == 0) yield x


for (x <- xs if x%2 == 0) yield x*10

xs.filter(x => x%2 == 0).map(x => x*10)

// Syntactic Sugar
xs.filter(_%2 == 0).map(_*10)

xs.filterNot(x =>  x%2==0).map(x=>x*10)


val ys:List[Int] = List()

ys :: 2 :: Nil




