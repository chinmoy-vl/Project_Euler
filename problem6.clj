
(defn square 
  "returns the square of a number"
  [n]
  (* n n))


(defn sum-square-difference
  [n]
  (-
    (square (/ (* n (inc n)) 2))
    (reduce 
      + 
      (map square (range 1 (inc n))))))
(sum-square-difference 100)
