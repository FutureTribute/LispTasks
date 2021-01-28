(ns task.core)
(defn task [month]
    (cond
        (or (= month "December") (= month "December") (= month "December")) "Winter" 
        (or (= month "March") (= month "April") (= month "May")) "Spring"
        (or (= month "June") (= month "July") (= month "August")) "Summer"
        (or (= month "September") (= month "October") (= month "November")) "Fall"
    )
)
(println (task "December"))
(println (task "November"))
(println (task "Something"))