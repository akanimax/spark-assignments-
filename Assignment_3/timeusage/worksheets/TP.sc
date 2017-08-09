val a = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

a.foldLeft((List[Int](), List[Int]()))(
  (x, y) => x match {
    case (even, odd) => if(y % 2 == 0) (even ++ List(y), odd)
                                      else (even, odd ++ List(y))
  }
)