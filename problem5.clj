(defn gcd
  "computes the GCD of two numbers"
  [a b]
  (if (= (rem b a) 0)
    a
    (recur (rem b a) a)))


(defn lcm
  "returns the lcm of two numbers"
  [a b]
  (if-not (= (rem b a) 0)
    (do
      (/ (* a b) (gcd a b)))
    b))

(reduce 
  lcm  
  (range 2 21))