(defn palindrome?
  "tests if a given string/number is a palindrome"
  [obj]
  (let  [v (vec (str obj))]
    (loop [i 0 j (- (count v) 1) ]
      (if (>= i j)
        true
        (if (= (v i) (v j))
          (recur (inc i) (dec j))
          false)))))

(first
  (sort > 
        (filter palindrome? (for [i (range 999 100 -1)
                                  j (range 999 100 -1)]
                              (* i j)))))