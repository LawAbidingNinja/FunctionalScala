def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  if (as.length <= 1) true
  else ordered(as.head, as.tail.head) match {
    case false => false
    case true => isSorted(as.tail, ordered)
  }
}

isSorted(Array(2,1), (x: Int, y: Int) => y >= x)