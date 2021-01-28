(ns task.core)
(defn pretask [inlist]
    (if (> (count inlist) 0)
        (* (first inlist) (pretask (rest inlist)))
        1
    )
)
(defn task [inlist]
    ; (/ (apply * inlist) (count inlist))
    (/ (pretask inlist) (count inlist))
)

(println (task '(1 2 3 4 5)))
