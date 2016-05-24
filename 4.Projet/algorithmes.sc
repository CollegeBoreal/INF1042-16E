// Fibonacci

type N = Int

def fib0 (n: N) : N = {
  if ( n==0) 0 else
  if (n == 1) 1
  else fib0(n - 1) + fib0(n - 2)

}

fib0(2)

def fib1 (n: N): N = n  match {
  case 0 | 1 => n
  case _ => fib1 (n-1 ) + fib1 (n-2)
}

fib1(2)
fib1(3)

fib1(10)

def multiply (x : N ,y :N) :N = {
  if ( y==0) 0 else {
    val z= multiply( x, y/2)
    if (y%2==0) 2*z else
      x+2*z
  }

}
multiply(2,2)
multiply(2,3)