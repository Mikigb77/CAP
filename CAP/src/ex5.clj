(ns ex5)
(defn abs-value [n]
  (if (< n 0) (- n) n))

(defn power1 [a b]
  (letfn [(power-aux [x p] 
                     (if (= 0 p) 1 (* x (power-aux x (dec p)))))]
    (if (< b 0) 
      (/ 1 (power-aux a (- b)))
      (power-aux a b))))

