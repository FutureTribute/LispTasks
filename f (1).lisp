(defun y (x) 
    (cond
        ((and (>= x 2) (< x 5)) (+ (cosh (+ 3 x)) (cos (+ (expt x 2) x))))
        ((and (>= x -0.5) (<= x 0)) (tan (- (* pi x) pi)))
        (t (expt x 3))
    )
)

(print "=======  DO  =======")
(do ((x -1 (+ 0.1 x)))
   ((>= x 6) (y x))
  (format t "~% x = ~d" (y x))
)

(print "======= PROG =======")
(defun f ()
    (prog ()
        (setq i -1)
        loop
        (if (>= i 6) (return i))
        
        (format t "~% x = ~d" (y i))

        (setq i (+ i 0.1))
        (go loop)
))
(f)
