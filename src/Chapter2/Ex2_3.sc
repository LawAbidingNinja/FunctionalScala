def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
  (a: A) => (b: B) => f(a,b)
}

val testCurry = curry ((x: Int, y: Int) => x+y)
val v1 = testCurry(1)
val v2 = v1(2)