(ns task.core)
(defn gcd [a b] ; Greatest Common Divisor
    (if (zero? b)
        a
        (recur b, (mod a b))
    )
)
(defn lcm [a b] ; Least Common Multiple
    (Math/abs (/ (* a b) (gcd a b)))
)
(defn lcmv [& v] ; Recursively call function of 2 arguments on sequence
    (reduce lcm v)
)
(defn task [inList fn]
    (apply fn inList)
)

(println (task '(-1 2 3 4 5) lcmv))