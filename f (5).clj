(ns task.core)
(defn task [inList]
    (if (not (empty? inList))
        (+ 1 (task (rest inList)))
        0
    )
)

(println (task '(1 a c (2) 3 (4 8) 9)))
