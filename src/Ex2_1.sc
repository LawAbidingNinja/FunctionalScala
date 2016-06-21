def fib(n:Int) = {
  def calcFib(num1: Int, num2:Int, n:Int): Int = {
    if (n <=1) 0
    else if (n ==2) 1
    else if (n == 3) num1 + num2
    else calcFib(num2, num1+num2, n-1)
  }
  calcFib (0,1,n)
}

//fib(10)