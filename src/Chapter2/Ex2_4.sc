def uncurry[A,B,C](f: A => (B => C)): (A,B) => C = {
  f(a, b)
//  //(a: A, b: B) =>
//  f(a: A, b: B) => (b: B) => (a: A)
}

//def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
//(a: A) => (b: B) => f(a,b)
//}

//def partial1[A,B,C](a: A, f: (A,B) => C): B => C = {
//(b: B) => f (a, b)
//}