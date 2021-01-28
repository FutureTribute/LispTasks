(ns task.core)
(def a 10)
(defn y [x]
    (cond 
        (and (>= x -1) (<= x 1)) (Math/sqrt (+ x a))
        (> x 1) (/ a (Math/pow x 4))
    )
)
(println (y -10))
(println (y 0))
(println (y 1.5))