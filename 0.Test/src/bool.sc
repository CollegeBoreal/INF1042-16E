// 1 - Affichage à l'écran

println("hello word")

println(5)

println(3.5)

// 2 - Types de variables

// Type Implicite

// Variable

var x = 5

x = 9

println (x)


// Constante

val z = 5

// Type Explicite

var y :Any = 5

y = 2.8

y = "yves"


def f(x: Int) = { x*x }

f(5)

f(10)
def g(x: Int) = { x*x }


def h(x: Any) = println(x)
def p(x:Int) :Int =  { x + 1}

/**/type R  =  Double

def s (y: R ) : R = {y + 3}

y = 0.5
s (0.5 )
s(  -5)=