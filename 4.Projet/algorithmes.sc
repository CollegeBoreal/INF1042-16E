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

def multiply (x : N ,y :N) :N = y match {
  case 0 => 0
  case _ =>
    val z= multiply( x, y/2)
    if (y%2==0) 2*z else
      x+2*z
}
multiply(2,2)
multiply(2,3)

def divide (x : N,y : N) : (N,N) = x match {
  case 0 => (0, 0)
  case _ =>
    var (q, r) = divide(x / 2, y)
    q = 2 * q
    r = 2 * r
    if (x % 2 == 0) r else r = r + 1
    if (r >= y) (q + 1, r - y) else (q, r)

}
divide (8,4)
divide (20,3)
divide(1,5)

