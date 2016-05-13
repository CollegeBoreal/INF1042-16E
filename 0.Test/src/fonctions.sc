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
