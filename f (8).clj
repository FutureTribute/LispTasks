(ns task.core)
(defn task1 [m n]
   (Math/sqrt
    (Math/abs
     (/
      (Math/cos
       (Math/pow Math/E (- (* 0.9 n) (* 0.4 m))))
      (+
       (Math/pow m 5)
       (Math/pow n 2)
       (-
        (Math/log
         (+
          (Math/cos 0.6)
          (Math/sin (+ 0.2 Math/PI))
          )
         )
        )
       )
      )
     )
    )
  )
